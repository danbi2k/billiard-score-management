Ext.define('Dangu.view.regist.RegistGameV', {
	extend: 'Ext.grid.Panel',
	plugins: Ext.create('Ext.grid.plugin.RowEditing'),
	alias: 'widget.gamelist',
	title: 'Game Scroes',
	layout:'fit',
	stores:'regist.RegistGameS',
//	iconCls: 'icon-user',
	columns: [{
		text: 'Gamer 1',
		flex: 1,
		sortable: true,
		dataIndex: 'gamer1',
		field:{
			xtype:'combo'
		}
	}, {
		text: 'Gamer 2',
		flex: 1,
		sortable: true,
		dataIndex: 'gamer2',
		field: {
			xtype: 'combo'
		}
	}, {
		text: 'Start Time',
		flex: 1,
		sortable: true,
		dataIndex: 'starttime',
		field: {
			xtype: 'combo'
		}
	}, {
		text: 'End Time',
		flex: 1,
		sortable: true,
		dataIndex: 'endtime',
		field: {
			xtype: 'combo'
		}
	}, {
		text: 'Winner',
		flex: 1,
		sortable: true,
		dataIndex: 'winner',
		field: {
			xtype: 'combo'
		}
	}],
	dockedItems: [{
		xtype: 'toolbar',
		items: [{
			text: 'Add',
//			iconCls: 'icon-add',
			handler: function(){
				store.insert(0, new RegistGameM());
				rowEditing.startEdit(0, 0);
			}
		}, '-', {
			text: 'Delete',
//			iconCls: 'icon-delete',
			itemId: 'delete',
			disabled: true,
			handler: function(){
				var selection = this.getView().getSelectionModel().getSelection()[0];
				if (selection) {
					store.remove(selection);
				}
			}
		}]
	}],
	
	initComponent : function() {
		console.log('Dangu.view.regist.RegistGame initComponent : function() start!!');


		console.log('Dangu.view.regist.RegistGame initComponent : function() end!!');
		this.callParent(arguments);
	},
});