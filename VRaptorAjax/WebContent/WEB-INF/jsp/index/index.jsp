<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<script type="text/javascript" charset="utf-8"	src="<c:url value="/js/jquery-1.4.2.min.js"/>"></script>
	<script type="text/javascript" charset="utf-8"	src="<c:url value="/js/jquery.jqia.selects.js"/>"></script>
	<script type="text/javascript" charset="utf-8"	src="<c:url value="/js/main.js"/>"></script>
	<script type="text/javascript">
	  $(function(){
		  
		$('#loading').hide();
	    $('#estadoDropdown').change(function(){
	        adjustMunicipioDropdown();
	      }).change();
		$('#loading').ajaxStart(function() {
			$(this).show();
		});		
	    $('#loading').ajaxStop(function(){
	        $(this).hide();   
	    });
	
	  });
	</script>
</head>
<body>
<form action="" >
	<h1>Formulário de Cadastro</h1>
	<table>
		<tr>
			<td>
				<label>Estado:</label>			
			</td>
			<td>
				<select id="estadoDropdown">
					<option value="">Selecione o Estado</option>
					<option value="RJ">RIO DE JANEIRO</option>
					<option value="SP">SAO PAULO</option>
				</select>			
			</td>
		</tr>
		<tr>
			<td>
				<label>Municipio:</label>
			</td>
			<td>
				<select id="municipioDropdown" disabled="disabled"></select>
				<img id="loading" alt="Carregando" src="<c:url value="/img/loading.gif"/>">
			</td>
		</tr>		
	</table>	
</form>
</body>
</html>