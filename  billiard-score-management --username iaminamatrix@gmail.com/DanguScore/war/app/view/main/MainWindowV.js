Ext.define('Dangu.view.main.MainWindowV', {
	extend: 'Ext.window.Window',
	alias: 'widget.mainwindow',
	requires:['Dangu.view.main.MainWindowButton'],
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
		console.log('Dangu.view.main.MainWindow initComponent : function() start!!');
		this.items=[{xtype:'mainwindowbutton', text:this.htmlText('경기 등록'), action: 'registgame'}, 
		            {xtype:'mainwindowbutton', text:this.htmlText('경기 조회'), action: 'retrievegame'},
		            {xtype:'mainwindowbutton', text:this.htmlText('선수 등록'), action: 'registgamer'}];
		console.log('Dangu.view.main.MainWindow initComponent : function() end!!');
		this.callParent(arguments);
	},
	
	htmlText : function(text){
		var html = "<html><p align='center'><font size='30'><b>" + text + "</b></font></p></html>";
		return html;
	}
});