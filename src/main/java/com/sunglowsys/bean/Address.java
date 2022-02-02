package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Value;

public class Address {
    private String id ;
    private String addressLine1 ;
    private String AddressLine2 ;
    private String city ;
    private String state ;
    private String country ;
    private Integer zipcode ;

    public Address(){
        System.out.println("Address object is created");
    };

    public Address(String id, String addressLine1, String addressLine2, String city, String state, String country, Integer zipcode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        AddressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }


    public String getId() {
        return id;
    }
    @Value("1000L")
    public void setId(String id) {
        this.id = id;
    }


    public String getAddressLine1() {
        return addressLine1;
    }
    @Value("Vill-Nagla Nande")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    public String getAddressLine2() {
        return AddressLine2;
    }

    @Value("Post-Salempur Pironda")
    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }


    public String getCity() {
        return city;
    }

    @Value("Kasganj")
    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }

    @Value("U.P")
    public void setState(String state) {
        this.state = state;
    }


    public String getCountry() {
        return country;
    }

    @Value("India")
    public void setCountry(String country) {
        this.country = country;
    }


    public Integer getZipcode() {
        return zipcode;
    }

    @Value("207401")
    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", AddressLine2='" + AddressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
