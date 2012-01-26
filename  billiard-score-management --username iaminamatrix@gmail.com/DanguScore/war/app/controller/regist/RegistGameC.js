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
	
	registGame: function(button){
//		console.log('Regist Game button clicked !!');
		var gridPanel = button.up('grid'),
		gridstore = gridPanel.getStore();
		var arr = new Array();
		var records = gridstore.getRange();
		for(var i = 0; i < records.length; i++){
			arr.push(records[i].data);
		}
		var builder = Ext.encode(arr);
		console.log(builder);
	    
		Ext.Ajax.request({
		    url: '/managementgamer',
		    type:'json',
		    params: {
		        action:'create',
		        values: builder
		    },
		    success: function(response){
		        var text = response.responseText;
		        console.log(text);
		        Ext.MSG.alert('success');
		        // process server response here
		    }, 
		    fail : function(response){
		    	Ext.MSG.alert('fail');
		    }
		});
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
//		this.getUsersStore().sync();
	}
	
});