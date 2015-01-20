/**
* Copyright 2015 China Mobile. All Right Reserved
* 
* This file is owned by China Mobile and you may not use, modify, copy, 
* redistribute this file without written permissions.
 * 
* These Terms of Use define legal use of this file, all updates, revisions, 
* substitutions for you. All rights not expressly granted to you are reserved 
* by Chinamobile. 
*/ 

package com.test.bcop.client;

import org.apache.camel.ExchangePattern;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Huang, Liangliang
 *
 */
@Service("orderVm")
public class OrderVmClient {
    @Produce(uri = "jms:queue:order")
    ProducerTemplate producerTemplate;
    
    public Object ordervm(){
        Object response = producerTemplate.requestBody("VM");
        if(response instanceof String){
            System.out.print("the response is:"+response);
        }
        return null;
    }
}
