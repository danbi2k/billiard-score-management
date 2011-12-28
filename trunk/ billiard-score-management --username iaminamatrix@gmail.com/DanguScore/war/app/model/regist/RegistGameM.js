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
    	type: 'long'
    }, {
    	name: 'endtime',
    	type: 'long'
    }, {
    	name: 'winner',
    	type: 'string'
    }
    ]
});