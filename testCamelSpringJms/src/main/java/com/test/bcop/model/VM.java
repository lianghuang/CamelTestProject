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

/**
 * @author Huang, Liangliang
 *
 */
public class VM implements Serializable{

    private static final long serialVersionUID = -7017857922284791901L;
    private String id;
    private String name;
    private Network network;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Network getNetwork() {
        return network;
    }
    public void setNetwork(Network network) {
        this.network = network;
    }
    
}
