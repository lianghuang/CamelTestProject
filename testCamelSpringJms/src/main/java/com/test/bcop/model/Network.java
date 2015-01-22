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

package com.test.bcop.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Huang, Liangliang
 *
 */
public class Network implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 2145435552671776668L;

    private String id;
    
    private List<String> region;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }
    
}
