Ext.define('Dangu.store.regist.RegistGameS', {
    extend: 'Ext.data.Store',
    model: 'Dangu.model.regist.RegistGameM',
    
    proxy:{
    	type:'rest',
    	url:'/managementgamer',
    	method:'POST',
    	writer:{
    		type:'json',
    		root:'gamerlist'
    	}
//    	reader:{
//    		type:'json',
//    		root:'gamerlist',
//    		totalProperty: 'totalCount'
//    	}
    }
});