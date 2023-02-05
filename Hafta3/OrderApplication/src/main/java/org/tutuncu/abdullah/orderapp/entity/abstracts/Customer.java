package org.tutuncu.abdullah.orderapp.entity.abstracts;

import org.tutuncu.abdullah.orderapp.entity.concretes.Invoice;

import java.time.LocalDate;

public abstract class Customer {

    private int id;
    private String customerType;

    private String fullName;

    private LocalDate dateOfRegistration;

    private Order order;

    private Invoice invoice;

    private String sector;

    private String toString;

    public Customer() {
    }

    public Customer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order, Invoice invoice, String sector) {
        this.id = id;
        this.customerType = customerType;
        this.fullName = fullName;
        this.dateOfRegistration = dateOfRegistration;
        this.order = order;
        this.invoice = invoice;
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getToString() {
        return "Id: " + " Customer Type: " + getCustomerType() + getId() + " Full Name: " + getFullName() + " Registration Date: " + getDateOfRegistration()
                + " Sector: " + getSector();
    }
}
