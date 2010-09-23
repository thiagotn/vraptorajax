function adjustMunicipioDropdown() {
	var estadoValue = $('#estadoDropdown').val();
	var dropdownSet = $('#municipioDropdown');
	if (estadoValue.length == 0) 
	{
		dropdownSet.attr("disabled", true);
		dropdownSet.emptySelect();
	} 
		else 
	{
		dropdownSet.attr("disabled", false);

		$.getJSON('/VRaptorAjax/index/buscaMunicipios.json', {
			uf : estadoValue
		}, function(data) {
			dropdownSet.loadSelect(data);
		});
	}
}


