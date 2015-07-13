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

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.test.bcop.model.Network;
import com.test.bcop.model.VM;

/**
 * @author Huang, Liangliang
 *
 */
@Service("orderVm")
public class OrderVmClient {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Produce(uri = "direct:order")
    ProducerTemplate producerTemplate;
    
    public Object ordervm(){
        VM vm=new VM();
        vm.setId("111");
        vm.setName("test");
        Network network=new Network();
        network.setId("n1");
        List<String> region =new ArrayList<String>();
        region.add("VM");
        network.setRegion(region);
        vm.setNetwork(network);
        
        producerTemplate.sendBody(vm);
/*        if(response instanceof String){
            log.info("the response is:"+response);
        }*/
        return vm;
    }
}
