Ext.define('Dangu.view.regist.GamerListCombo', {
	extend: 'Ext.form.ComboBox',
	requires:['Dangu.model.regist.GamerListM'],
	alias:'widget.gamerlistcombo',
	displayField:'name',
	valueField:'name',
	typeAhead: true,
	triggerAction:'all',
    selectOnTab: true,
    editable: false,
    store:{
    	fields:[{name : 'name', type :'string'}],
//    	model:'Dangu.model.regist.GamerListM',
    	data:[
    		{name: '김현진'},
    		{name: '오진호'},
    		{name: '유광현'},
    		{name: '이종화'},
    		{name: '임형주'},
    		{name: '조도현'},
    		{name: '최광수'},
    		{name: '황호길'}
    	]
    }
});