sap.ui.define([
	"sap/ui/core/mvc/Controller",
	"jquery.sap.global", 
	"hani/util/service","sap/m/MessageBox"
], function(Controller, Jquery, service,MessageBox) {
	return Controller.extend("hani.controller.Main", {

		onInit: function() {
			var oModel = new sap.ui.model.json.JSONModel();
			oModel.setData({

				   "postPayload": {
					"companyName": "",
					"contactName": "",
					"lastname": "",
					"website": "",
					"email": "",
					"status": "A",
					"gstno": ""
						},
				    "vendor": {}

			});
			sap.ui.getCore().setModel(oModel);
			
		},
		
		onSaveData:function(){
			
			var oModel = sap.ui.getCore().getModel();
			var payload = oModel.getProperty("/postPayload");
			service.callservice("/vendor", "POST", payload).then(function(){
				console.log("post success");
				MessageBox.confirm("Saved successfully");
				
			}).catch(function(){
				console.log("post failed");
				MessageBox.error("Post Failed");
			})
		},
		
		onloadData: function() {
			debugger;
			var that = this;
			//	alert("to load the vendor data here");
			//	modularizing code and pushing to service.js
			/*	Jquery.ajax("/newvendor" ,{
					type:'GET',
					success:function(data){
					//	console.log(data);
						var oTable = that.getView().byId("idtable");
						var oModel = new sap.ui.model.json.JSONModel();
						oModel.setData(data._embedded);
						sap.ui.getCore().setModel(oModel);
						oTable.bindRows("/vendor");
					},error:function(err){
						console.log(err);
					}
					
				})*/

			//service.callservice("/newvendor", "GET", {}).then(function(data) {
				service.callservice("/vendor", "GET", {}).then(function(data) {
				var oTable = that.getView().byId("idtable");
				var oModel = sap.ui.getCore().getModel();
				//oModel.setProperty( "/vendor"  ,  data._embedded.vendor); // for local
			  oModel.setProperty( "/vendor"  ,  data); // for cloud
				oTable.bindRows("/vendor");
			}).catch(function() {

			});

		}

	});
}
);