Ext.Loader.setConfig({enabled:true});

Ext.application({
	name: 'Dangu',
	appFolder: 'app', 
	controllers: ['main.MainWindowC', 'regist.RegistGameC'],
	autoCreateViewport: true
});