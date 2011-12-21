Ext.define('Dangu.view.main.FirstPage', {
	extend: 'Ext.window.Window',
	alias: 'widget.firstpage',
	layout: {
		type: 'vbox',
		align: 'stretch',
		padding: '5'
	},
	width:300,
	height:500,
	closable: false,
	closeAction: 'hide',
	frame: true,
	frameHeader: false,
	resizable: false,
	draggable: false,
	autoShow: true,
	initComponent : function() {
		console.log('Dangu.view.FirstPage initComponent : function() start!!');
		this.items=[{xtype:'firstpagebutton', text:'경기 등록'}, 
		            {xtype:'firstpagebutton', text:'전적 확인'},
		            {xtype:'firstpagebutton', text:'사용자 등록'}];
		console.log('Dangu.view.FirstPage initComponent : function() end!!');
		this.callParent(arguments);
	}
});