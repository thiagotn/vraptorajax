(function($) {
  $.fn.emptySelect = function() {
    return this.each(function(){
      if (this.tagName=='SELECT') this.options.length = 0;
    });
  }

  $.fn.loadSelect = function(data) {
    return this.emptySelect().each(function(){
      if (this.tagName=='SELECT') {
        var selectElement = this;
   
        $.each(data,function(index,optionData){
       	
        	var option = new Option(optionData.nome,
                    optionData.nome);
        	
          if ($.browser.msie) {
            selectElement.add(option);
          }
          else {
            selectElement.add(option,null);
          }
        });
      }
    });
  }
})(jQuery);
