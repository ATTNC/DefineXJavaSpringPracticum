package org.tutuncu.abdullah.orderapp.entity.concretes;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Customer;
import org.tutuncu.abdullah.orderapp.entity.abstracts.Order;

import java.time.LocalDate;

public class IndividualCustomer extends Customer {


    public IndividualCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order, Invoice invoice, String sector) {
        super(id, customerType, fullName, dateOfRegistration, order, invoice, sector);
    }
}
