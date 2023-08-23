package com.example.demo.modelproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat; 

@Entity
@Table(name = "details")
public class ModelSeat {
    @Id
    private int custid;

    private String custname;
    private String custphone;
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date bookingDate; 

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustphone() {
        return custphone;
    }

    public void setCustphone(String custphone) {
        this.custphone = custphone;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public ModelSeat() {
        super();
    }

    public ModelSeat(int custid, String custname, String custphone, Date bookingDate) {
        super();
        this.custid = custid;
        this.custname = custname;
        this.custphone = custphone;
        this.bookingDate = bookingDate;
    }
}
