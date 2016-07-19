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
import java.util.Date;
import java.util.List;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chinamobile.bcop.openstack.jms.model.bandwidth.CreateBandWidthResp;
import com.chinamobile.bcop.openstack.jms.model.floatingIp.CreatePublicIPResp;
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
    
    public void ordervm(){
//       CreatePublicIPResp ipresp=new CreatePublicIPResp();
//       ipresp.setEffectiveTime(new Date());
//       ipresp.setSuccess(true);
//       ipresp.setResourceCode("1122-3344-5566-7788");
//       ipresp.setOrderExtId("f7604662ed9344f99d74620975d86341");
//       ipresp.setName("10.10.10.10");
//       producerTemplate.sendBodyAndHeader(ipresp, "CamelJacksonUnmarshalType", "com.chinamobile.bcop.openstack.jms.model.floatingIp.CreatePublicIPResp");
//       
//       try {
//        Thread.sleep(10000);
//    } catch (InterruptedException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    }
//       CreateBandWidthResp bandResp=new CreateBandWidthResp();
//       bandResp.setEffectiveTime(new Date());
//       bandResp.setSuccess(true);
//       bandResp.setResourceCode("5566-7788-1122-3344");
//       bandResp.setOrderExtId("9a35a88c0a3f46a39fe1796e84583173");
//       bandResp.setIpAddr("10.10.10.10");
//       producerTemplate.sendBodyAndHeader(bandResp, "CamelJacksonUnmarshalType", "com.chinamobile.bcop.openstack.jms.model.bandwidth.CreateBandWidthResp");
//    
        VM vm=new VM();
        vm.setId("111");
        vm.setName("test");
        Network network=new Network();
        network.setId("n1");
        List<String> region =new ArrayList<String>();
        region.add("VM");
        network.setRegion(region);
        vm.setNetwork(network);
        String result= producerTemplate.requestBodyAndHeader("direct:order",vm, "CamelJacksonUnmarshalType",
                "com.chinamobile.bcop.openstack.jms.model.vm.CreateVmReq",String.class);
        log.info(result);

    }
}
