package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int houseNO;
    private String address;
    private int pincode;

    public Address(int houseNO,String address,int pincode){
        this.address=address;
        this.houseNO=houseNO;
        this.pincode=pincode;
    }

@Override
    public String toString(){
        return "Address"+address+",houseNo"+houseNO+",pincode"+pincode;
    }
}

