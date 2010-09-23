package com.tnogueira.ajax;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

import com.tnogueira.dao.MunicipioDao;
import com.tnogueira.model.Municipio;

@Resource
public class IndexController {

	private Result result;
	private MunicipioDao dao;
	
	public IndexController(Result result, MunicipioDao dao){
		this.result = result;
		this.dao = dao;
	}
	
	@Path("/")
	public void index(){
		
	}
	
	@Get @Path("/index/buscaMunicipios.json")
	public void loadMunicipios(String uf){
		List<Municipio> municipios = dao.lista(uf);
		result.use(Results.json()).withoutRoot().from(municipios)
			.exclude("id")
			.serialize();
	}
	
}
