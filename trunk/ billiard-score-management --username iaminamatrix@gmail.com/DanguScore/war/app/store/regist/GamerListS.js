Ext.define('Dangu.store.regist.GamerListS', {
    extend: 'Ext.data.Store',
    model: 'Dangu.store.regist.GamerListM',
    
    proxy:{
    	type:'ajax',
    	url:'/managementgamer',
    	method:'POST',
    	reader:{
    		type:'json',
    		root:'gamerlist',
    		totalProperty: 'totalCount'
    	}
    }
});