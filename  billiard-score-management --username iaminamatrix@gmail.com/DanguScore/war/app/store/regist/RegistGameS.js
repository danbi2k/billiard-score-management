Ext.define('Dangu.store.regist.RegistGameS', {
    extend: 'Ext.data.Store',
    model: 'Dangu.model.regist.RegistGameM',
    
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