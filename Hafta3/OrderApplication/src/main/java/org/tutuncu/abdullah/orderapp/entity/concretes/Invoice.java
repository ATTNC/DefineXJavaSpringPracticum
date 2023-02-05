package org.tutuncu.abdullah.orderapp.entity.concretes;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Customer;

import java.time.LocalDate;

public class Invoice {


    private int id;

    private int cost;

    private LocalDate createDate;

    private String invoiceType;

    private String toString;


    public Invoice() {
    }

    public Invoice(int id, String invoiceType, int cost, LocalDate createDate) {
        this.id = id;
        this.cost = cost;
        this.createDate = createDate;
        this.invoiceType = invoiceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getToString() {
        return "Id: " + getId() + " Invoice Type: " + getInvoiceType() + " cost " + getCost() + " Create Date: " + getCreateDate();
    }


}
