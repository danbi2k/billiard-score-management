Ext.define('Dangu.model.regist.RegistGameM', {
    extend: 'Ext.data.Model',
    fields: [{
    	name: 'gamer1',
    	type: 'string',
    }, {
    	name: 'game2',
    	type: 'string'
    }, {
    	name: 'starttime',
    	type: 'int'
    }, {
    	name: 'endtime',
    	type: 'int'
    }, {
    	name: 'result',
    	type: 'string'
    }]
});