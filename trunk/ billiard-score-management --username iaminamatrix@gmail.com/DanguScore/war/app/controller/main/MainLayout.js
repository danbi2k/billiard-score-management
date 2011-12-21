Ext.define('Dangu.controller.main.MainLayout', {
	extend: 'Ext.app.Controller',
	views: ['main.FirstPage', 'main.FirstPageButton'],

	init: function() {
		console.log('MainLayout\'s init function finished.');

	},

	onPanelRendered: function() {
		console.log('The panel was rendered');
	}
});