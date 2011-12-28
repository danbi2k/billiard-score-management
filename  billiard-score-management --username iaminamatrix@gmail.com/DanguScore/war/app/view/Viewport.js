Ext.define('Dangu.view.Viewport', {
	extend: 'Ext.container.Viewport',
	requires:['Dangu.view.main.MainWindowV'],
	layout: 'fit',
	id: 'mainviewport',
	items: [
	        {
	        	id: 'mainwindow',
	        	xtype:'mainwindow'
	        }
	        ]
});
