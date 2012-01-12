Ext.define('Dangu.view.regist.GameInformation', {
	extend : 'Ext.window.Window',
	alias : 'widget.gameinfo',

	title : 'Game Information',
	layout : 'fit',
	autoShow : true,

	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			items : [ {
				xtype : 'gamerlistcombo',
				name : 'gamer1',
				fieldLabel : 'Gamer1',
				id: 'gamer1combo'
			}, {
				xtype : 'gamerlistcombo',
				name : 'gamer2',
				fieldLabel : 'Gamer2',
				id: 'gamer2combo'
			}, {
				xtype : 'textfield',
				name : 'starttime',
				fieldLabel : 'Start Time',
				id: 'starttimetext'
			},{
				xtype : 'textfield',
				name : 'endtime',
				fieldLabel : 'End Time',
				id: 'endtimetext'
			}, {
				xtype : 'combo',
				name : 'result',
				fieldLabel : 'Result',
				typeAhead: true,
				triggerAction:'all',
			    selectOnTab: true,
			    editable: false,
	            listClass: 'x-combo-list-small',
	            displayField:'name',
	            id: 'resultcombo',
	            store:{
	            	fields:[{name : 'name', type :'string'}],
	            	data:[{
	            		name: ''
	            	}]
	            },
			} ]
		} ];

		this.buttons = [ {
			text : 'Save',
			action : 'save'
		}, {
			text : 'Cancel',
			scope : this,
			handler : this.close
		} ];

		this.callParent(arguments);
		
		var resultcombo = Ext.getCmp('resultcombo');
		resultcombo.on('expand', this.onExpand);
		
	},
	
	onExpand: function(field, obj){
		console.log('onExpand');
		var gamer1 = Ext.getCmp('gamer1combo').getValue(),
		gamer2 = Ext.getCmp('gamer2combo').getValue(),
		resultCombo = Ext.getCmp('resultcombo'),
		resultStore = resultCombo.getStore();
		resultStore.removeAll();
		resultStore.add({name:'타임아웃'});
		
		if (gamer1 != ''){
			resultStore.add({name: gamer1});
		}
		
		if (gamer2 != ''){
			resultStore.add({name: gamer2});
		}
	}
});