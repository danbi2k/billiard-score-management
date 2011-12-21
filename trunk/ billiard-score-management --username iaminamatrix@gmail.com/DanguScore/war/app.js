Ext.Loader.setConfig({enabled:true});

Ext.application({
	name: 'Dangu',
	appFolder: 'app', 
	controllers: ['main.MainLayout'],
	
	launch: function(){
		Ext.create('Ext.container.Viewport', {
			layout: 'fit',
			items: [
			        {
			        	xtype:'firstpage'
			        }
			]
		});
		console.log('app\'s launch function finished !!');
	}
});