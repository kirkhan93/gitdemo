sap.ui.define([
	"jquery.sap.global"
],function(Jquery){
	return {
		callservice:function(sURL, smethod , oPayload){
			
		return new Promise(function(resolve,reject){
			switch(smethod.toUpperCase()){
				case "GET":
					Jquery.ajax(sURL ,{
				type:'GET',
				success:function(data){
						resolve(data);
				},error:function(err){
					reject(err);
				}
				
			});
				break;
				case "POST":
					Jquery.ajax(sURL ,{
				type:'POST',
				contentType:'application/json',
				data:JSON.stringify(oPayload),
				success:function(data){
						resolve(data);
				},error:function(err){
					reject(err);
				}
				
			});
				break;
				
				
			}
			
		});
		
	}
	
	
	}
	
	}

);