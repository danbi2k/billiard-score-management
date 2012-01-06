Ext.define('Dangu.controller.regist.RegistGameC', {
	extend: 'Ext.app.Controller',
	init: function() {
		this.control({
			'gamelist button[action=addGame]' : {
				click: this.addGame
			},
			'gamelist button[action=deleteGame]' : {
				click: this.deleteGame
			},
			'gamelist button[action=registgame]' : {
				click: this.registGame
			},
			'gamelist button[action=backMain]' : {
				click: this.backMain
			}
		});
		console.log('Dangu.controller.regist.RegistGame controller init() finish.');
	},

	addGame: function(button){
		console.log('Add Game Button clicked!!');
		var gridPanel = button.up('gamelist'),
		rowEditor = gridPanel.plugins[0],
		store = gridPanel.getStore();
		
		store.insert(0, new Ext.create('Dangu.model.regist.RegistGameM'));
		rowEditor.startEdit(0, 0);
	},
	
	deleteGame: function(button){
		console.log('Delete Game button clicked !!');
		var gridPanel = button.up('grid'),
		store = gridPanel.getStore(),
		selection = gridPanel.getSelectionModel().getSelection()[0];
		if (selection) {
			store.remove(selection);
		}
	}, 
	registGame: function(){
		console.log('Regist Game button clicked !!');
	}, 
	backMain: function(){
		console.log('Back button clicked !!');
	}
});