Ext.Loader.setConfig({enabled:true});

Ext.application({
	name: 'Dangu',
	appFolder: 'app', 
	launch: function(){
		Ext.create('Ext.container.Viewport', {
			layout: 'fit',
			items: [
			        {
			        	xtype:'panel',
			        	layout:'vbox',
			        	width: 300,
			        	height: 400,
			        	html: 'Hello World',
			        	items:[{xtype:'textfield', name:'test1', fieldLabel:'Test1'},
			        	       {xtype:'textfield', name:'test2', fieldLabel:'Test2'},
			        	       {xtype:'textfield', name:'test3', fieldLabel:'Test3'}]
			        		
			        }
			]
		});
	}
});