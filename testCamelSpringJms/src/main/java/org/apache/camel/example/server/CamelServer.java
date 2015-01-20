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

package org.apache.camel.example.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Huang, Liangliang
 *
 */
public class CamelServer {

    
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/camel-server.xml");
        //Multiplier multiplier = context.getBean("multiplierProxy", Multiplier.class);
    }
}
