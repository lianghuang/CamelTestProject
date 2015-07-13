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

package com.test.bcop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Huang, Liangliang
 *
 */
public class MessageReceiveMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/camel-server.xml");
    }

}
