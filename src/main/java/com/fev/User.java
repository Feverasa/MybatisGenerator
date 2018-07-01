package com.fev;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String nameHello;

    private Integer ageUser;

    private String addresstc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameHello() {
        return nameHello;
    }

    public void setNameHello(String nameHello) {
        this.nameHello = nameHello;
    }

    public Integer getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(Integer ageUser) {
        this.ageUser = ageUser;
    }

    public String getAddresstc() {
        return addresstc;
    }

    public void setAddresstc(String addresstc) {
        this.addresstc = addresstc;
    }
}