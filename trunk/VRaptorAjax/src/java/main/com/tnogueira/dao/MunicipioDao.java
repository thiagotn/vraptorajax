package com.tnogueira.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;

import com.tnogueira.model.Municipio;

@Component
public class MunicipioDao {
	
	private final Session session;
	
	public MunicipioDao(Session session){
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	public List<Municipio> lista(String uf){
		return session.createCriteria(Municipio.class)
				.add(Restrictions.ilike("uf", uf, MatchMode.ANYWHERE))
				.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Municipio> listaTudo(){
		return this.session.createCriteria(Municipio.class).list();
	}
	
}