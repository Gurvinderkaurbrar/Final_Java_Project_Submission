/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 *
 * @author CYRIL
 */
public class Lookup {
    
    private int infoId;
    private String bizName;
    private String address;
    private String firtsName;
    private String lastName;
    private String email;
    private String contactNo;
    private String image;

    public Lookup(int infoId, String bizName, String address, String firtsName, String lastName, String email, String contactNo, String image) {
        this.infoId = infoId;
        this.bizName = bizName;
        this.address = address;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
        this.image = image;
    }

    public Lookup() {
    }
    
    

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
