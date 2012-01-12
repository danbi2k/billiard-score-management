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
			},
			'gamelist' :{
				itemclick: this.addGameInfo
			},
			'gameinfo button[action=save]' : {
				click: this.saveGame
			}
		});
		console.log('Dangu.controller.regist.RegistGame controller init() finish.');
	},

	addGame: function(button){
		console.log('Add Game Button clicked!!');
		var gridPanel = button.up('gamelist'),
		store = gridPanel.getStore();
		store.insert(store.getCount(), new Ext.create('Dangu.model.regist.RegistGameM',{
			gamer1: '',
			gamer2: '',
			starttime: '',
			endtime: '',
			result: ''
		}));
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
	},
	
	addGameInfo: function(grid, record){
		var view = Ext.widget('gameinfo');

		view.down('form').loadRecord(record);
	},
	
	saveGame: function(button){
		   console.log('clicked the Save button');
		   var win = button.up('window'),
		   form = win.down('form'),
		   record = form.getRecord(),
		   values = form.getValues();
		   
		   record.set(values);
		   win.close();
//		   this.getUsersStore().sync();
	   }
});