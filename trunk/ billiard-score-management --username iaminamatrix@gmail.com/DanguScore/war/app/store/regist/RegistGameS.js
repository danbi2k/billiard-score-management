Ext.define('Dangu.store.regist.RegistGameS', {
    extend: 'Ext.data.Store',
    model: 'Dangu.store.regist.RegistGameM',

    autoLoad: true,
    
    proxy:{
    	type:'rest',
    	url:'/gamerlist',
    	reader:{
    		type:'json',
    		root:'gamerlist'
    	},
    	writer:{
    		type:'json'
    	},
    	listeners: {
    		load: function(store, records, isSuccess, operation){
    			console.log('Dangu.store.regist.RegistGameS load function start!');
    		},
    		write: function(store, operation){
    			console.log('Dangu.store.regist.RegistGameS write function start!');
    		}
    				
    	}
    }
});