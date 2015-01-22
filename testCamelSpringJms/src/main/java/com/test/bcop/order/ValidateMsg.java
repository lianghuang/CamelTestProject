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

package com.test.bcop.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Huang, Liangliang
 * 
 */
@Service("validateMsg")
public class ValidateMsg {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public Boolean validator(String msg){
        log.info("begin validate msg");
        if(msg.equals("VM")){
            return true;
        }
        return false;
        
    }
}
