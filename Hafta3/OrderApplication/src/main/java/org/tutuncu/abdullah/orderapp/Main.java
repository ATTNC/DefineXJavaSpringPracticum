package org.tutuncu.abdullah.orderapp;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Customer;
import org.tutuncu.abdullah.orderapp.entity.concretes.CorporateOrder;
import org.tutuncu.abdullah.orderapp.entity.concretes.IndividualOrder;
import org.tutuncu.abdullah.orderapp.entity.concretes.Invoice;
import org.tutuncu.abdullah.orderapp.repository.concretes.CustomerRepositoryImpl;
import org.tutuncu.abdullah.orderapp.service.abstracts.CustomerService;
import org.tutuncu.abdullah.orderapp.service.concretes.CustomerServiceImpl;

import java.time.LocalDate;
import java.time.Month;


public class Main {

    public static void main(String[] args) {

        // All stream operations are in the Service layer!!!


        CustomerService customerService = new CustomerServiceImpl(new CustomerRepositoryImpl());

        System.out.println("***********************************************************************************************************************");

        //List all customers :
        System.out.println("All Customers :");
        for (Customer customers : customerService.getAllCustomer()) {
            System.out.println(customers.getToString());
        }
        System.out.println("***********************************************************************************************************************");

        // Customers with the letter 'C' in it:
        System.out.println("Customers with the letter 'C' in it: ");
        customerService.filterCustomersByName();
        System.out.println("***********************************************************************************************************************");

        // Total amount of invoices of customers registered in June:
        System.out.println("Total amount of invoices of customers registered in June: " + customerService.customersFilterInvoiceTotalCost());
        System.out.println("***********************************************************************************************************************");

        // List all invoices :
        System.out.println("All Invoices:");
        for (Invoice invoice : customerService.getAllInvoice()) {
            System.out.println(invoice.getToString());
        }
        System.out.println("***********************************************************************************************************************");

        // List invoices over 1500 TL:
        System.out.println("List invoices over 1500 TL: ");
        for (Invoice invoice : customerService.getFilteredInvoices()) {
            System.out.println(invoice.getToString());
        }
        System.out.println("***********************************************************************************************************************");

        //Average of invoices over 1500 TL:
        System.out.println("Average of invoices over 1500 TL: "+customerService.getFilteredInvoicesAverageCost());

        System.out.println("***********************************************************************************************************************");

        //List the names of customers with invoices under 500 TL:
        System.out.println("List the names of customers with invoices under 500 TL :");
        for (Customer customer : customerService.getFilteredInvoiceByCustomerName()) {
            System.out.println(customer.getFullName());
        }
        System.out.println("***********************************************************************************************************************");

        // Sectors of companies with an average invoice of less than 750 in June:
        System.out.print("Sectors of companies with an average invoice of less than 750 in June: ");
        for (Customer customer : customerService.getFilteredCorporateCustomer()) {
            System.out.println(customer.getSector() + " - " + customer.getFullName());
        }
        System.out.println("***********************************************************************************************************************");

        // add new Individual Customer:
        customerService.addIndividualCustomer(4, "Individual Customer", "Yeliz Toprak", LocalDate.of(2022, Month.AUGUST, 24),
                new IndividualOrder(4, "Individual Order", 200, LocalDate.of(2022, Month.AUGUST, 24)),
                new Invoice(4, "Individual Invoice", 200, LocalDate.of(2022, Month.AUGUST, 24)), "Automotive");

        // add new Corporate Customer:
        customerService.addCorporateCustomer(4, "Corporate Customer", "SUIT Buildings", LocalDate.of(2022, Month.OCTOBER, 13),
                new CorporateOrder(4, "Corporate Order", 1000, LocalDate.of(2022, Month.OCTOBER, 13)),
                new Invoice(4, "Corporate Invoice", 1000, LocalDate.of(2022, Month.OCTOBER, 13)), "Building");

    }
}
