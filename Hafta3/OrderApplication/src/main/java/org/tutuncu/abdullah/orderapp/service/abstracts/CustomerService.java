package org.tutuncu.abdullah.orderapp.service.abstracts;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Customer;
import org.tutuncu.abdullah.orderapp.entity.abstracts.Order;
import org.tutuncu.abdullah.orderapp.entity.concretes.CorporateCustomer;
import org.tutuncu.abdullah.orderapp.entity.concretes.IndividualCustomer;
import org.tutuncu.abdullah.orderapp.entity.concretes.Invoice;

import java.time.LocalDate;
import java.util.List;

public interface CustomerService {



    List<Customer> getAllCustomer();
    List<IndividualCustomer> getAllIndividualCustomer();

    List<CorporateCustomer> getAllCorporateCustomer();

    void addIndividualCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order, Invoice invoice, String sector);

    void addCorporateCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order,Invoice invoice,String sector);

    void filterCustomersByName();

    int customersFilterInvoiceTotalCost();

    List<Invoice> getAllInvoice();

    List<Invoice> getFilteredInvoices();

    double getFilteredInvoicesAverageCost();

    List<Customer> getFilteredInvoiceByCustomerName();

    List<CorporateCustomer> getFilteredCorporateCustomer();




}
