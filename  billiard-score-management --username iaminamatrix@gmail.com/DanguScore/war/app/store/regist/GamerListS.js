Ext.define('Dangu.store.regist.GamerListS', {
    extend: 'Ext.data.Store',
    model: 'Dangu.model.regist.GamerListM',
    proxy:{
    	type:'ajax',
    	reader:{
    		data:'data/gamerlist.json',
    		type:'json',
    		root:'gamerlist'
    	}
    }
});