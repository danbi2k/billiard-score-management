Ext.define('Dangu.view.FirstPage', {
	extend: 'Ext.window.Window',
	alias: 'widget.firstpage',
	layout: 'fit',
	autoShow: true,
	title : '�����ϼ���',
	initComponent : function() {
		console.log('Dangu.view.FirstPage initComponent : function() start!!');
		this.buttons=[{text: ''}];
		console.log('Dangu.view.FirstPage initComponent : function() end!!');
	}
	
});