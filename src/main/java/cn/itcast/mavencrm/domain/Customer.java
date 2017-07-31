package cn.itcast.mavencrm.domain;
// Generated 2017-7-31 17:15:15 by Hibernate Tools 3.2.2.GA


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="customers"
    ,catalog="bos"
)
@XmlRootElement
public class Customer implements java.io.Serializable {


     private Integer id;
     private String name;
     private String telephone;
     private String address;
     private String station;
     private String decidedzoneId;

    public Customer() {
    }

	
    public Customer(String name, String telephone, String address) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        System.out.println("");
        System.out.println("ceshi");
    }
    public Customer(String name, String telephone, String address, String station, String decidedzoneId) {
       this.name = name;
       this.telephone = telephone;
       this.address = address;
       this.station = station;
       this.decidedzoneId = decidedzoneId;
    }
   
     @GenericGenerator(name="generator", strategy="uuid")@Id @GeneratedValue(generator="generator")
    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="NAME", nullable=false, length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="TELEPHONE", nullable=false, length=20)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="ADDRESS", nullable=false)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="STATION")
    public String getStation() {
        return this.station;
    }
    
    public void setStation(String station) {
        this.station = station;
    }
    
    @Column(name="DECIDEDZONE_ID", length=32)
    public String getDecidedzoneId() {
        return this.decidedzoneId;
    }
    
    public void setDecidedzoneId(String decidedzoneId) {
        this.decidedzoneId = decidedzoneId;
    }
}


