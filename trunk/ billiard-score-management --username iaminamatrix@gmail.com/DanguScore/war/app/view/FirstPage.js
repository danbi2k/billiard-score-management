Ext.define('Dangu.view.FirstPage', {
	extend: 'Ext.window.Window',
	alias: 'widget.firstpage',
	layout: 'fit',
	autoShow: true,
	title : '선택하세요',
	initComponent : function() {
		console.log('Dangu.view.FirstPage initComponent : function() start!!');
		this.buttons=[{text: ''}];
		console.log('Dangu.view.FirstPage initComponent : function() end!!');
	}
	
});