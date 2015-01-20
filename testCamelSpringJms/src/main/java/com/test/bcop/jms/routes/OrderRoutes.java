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

package com.test.bcop.jms.routes;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author Huang, Liangliang
 *
 */
public class OrderRoutes extends RouteBuilder{

    /* (non-Javadoc)
     * @see org.apache.camel.builder.RouteBuilder#configure()
     */
    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        from("jms:queue:order").beanRef("orderProcessor", "orderProduct");
        from("jms:queue:orderbs").beanRef("orderBSProcessor", "orderProduct");
    }

}
