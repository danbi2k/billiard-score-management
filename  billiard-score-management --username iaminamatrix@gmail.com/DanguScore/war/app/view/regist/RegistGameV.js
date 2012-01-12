Ext.define('Dangu.view.regist.RegistGameV', {
	extend: 'Ext.grid.Panel',
	plugins: Ext.create('Ext.grid.plugin.CellEditing', {
		clicksToEdit:1
	}),
	requires: ['Dangu.view.regist.GamerListCombo', 'Dangu.view.regist.GameInformation'],
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
	}, {
		text: 'Gamer 2',
		flex: 1,
		sortable: true,
		dataIndex: 'gamer2',
	}, {
		text: 'Start Time',
		flex: 1,
		sortable: true,
		dataIndex: 'starttime',
	}, {
		text: 'End Time',
		flex: 1,
		sortable: true,
		dataIndex: 'endtime',
	}, {
		text: 'Result',
		flex: 1,
		sortable: true,
		dataIndex: 'result'
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
		this.callParent(arguments);
		this.getSelectionModel().on('selectionchange', this.onSelectChange, this);
		console.log('Dangu.view.regist.RegistGame initComponent : function() end!!');
	},
	
	onSelectChange: function(selModel, selections){
		console.log('onSelectChange');
		this.down('#delete').setDisabled(selections.length === 0);
	}
});