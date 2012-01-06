Ext.define('Dangu.view.regist.RegistGameV', {
	extend: 'Ext.grid.Panel',
	plugins: Ext.create('Ext.grid.plugin.RowEditing'),
	requires: ['Dangu.view.regist.GamerListCombo'],
	alias: 'widget.gamelist',
	title: 'Game Scroes',
	layout:'fit',
	stores:'regist.RegistGameS',
	iconCls: 'icon-user',
	columns: [{
		text: 'Gamer 1',
		flex: 1,
		sortable: true,
		dataIndex: 'gamer1',
		field:{
			xtype:'gamerlistcombo'
		}
	}, {
		text: 'Gamer 2',
		flex: 1,
		sortable: true,
		dataIndex: 'gamer2',
		field: {
			xtype: 'gamerlistcombo'
		}
	}, {
		text: 'Start Time',
		flex: 1,
		sortable: true,
		dataIndex: 'starttime',
		field: {
			xtype: 'textfield'
		}
	}, {
		text: 'End Time',
		flex: 1,
		sortable: true,
		dataIndex: 'endtime',
		field: {
			xtype: 'textfield'
		}
	}, {
		text: 'Result',
		flex: 1,
		sortable: true,
		dataIndex: 'result',
		field: {
			xtype: 'combo'
		}
	}],
	dockedItems: [{
		xtype: 'toolbar',
		items: [{
			text: 'Add',
			iconCls: 'icon-add',
			action: 'addGame'
		}, '-', {
			text: 'Delete',
			iconCls: 'icon-delete',
			itemId: 'delete',
			disabled: true,
			action: 'deleteGame'
		}]
	}, {
		xtype: 'toolbar',
		dock: 'bottom',
		layout:{
			type: 'hbox',
			align: 'middle',
			pack: 'center'
		},
		items:[{
			text: 'Regist',
			action: 'registgame',
		},{
			text: 'Back',
			action: 'backMain'
		}]
	}],
	initComponent : function() {
		console.log('Dangu.view.regist.RegistGame initComponent : function() start!!');
//		var deletebutton = this.getDockedComponent('delete');
//		this.getSelectionModel().on('selectionchange', function(selModel, selections){
//			deletebutton.setDisabled(selections.length === 0);
//	    });
		console.log('Dangu.view.regist.RegistGame initComponent : function() end!!');
		this.callParent(arguments);
	}
});