Ext.define('Dangu.controller.main.MainWindowC', {
	extend: 'Ext.app.Controller',
	init: function() {
		this.control({
			'mainwindow button[action=registgame]' : {
				click: this.displayRegistGame
			},
			'mainwindow button[action=retrievegame]' : {
				click: this.displayRetrieveGame
			},
			'mainwindow button[action=registgamer]' : {
				click: this.displayRegistGamer
			}
		});
		console.log('Dangu.controller.main.MainWindow\'s init function finished.');
	},
	
	displayRegistGame: function(){
		console.log('click the regist game button !!');
		var initialWindow = Ext.getCmp('mainwindow');
		initialWindow.hide();
		var mainViewport = Ext.getCmp('mainviewport');
		mainViewport.add(Ext.create('Dangu.view.regist.RegistGameV'));
	},
	
	displayRetrieveGame: function(){
		console.log('click the retrieve game button !!');
	},
	
	displayRegistGamer: function(){
		console.log('click the regist user button !!');
	}
});