package org.tutuncu.abdullah.orderapp.service.concretes;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Customer;
import org.tutuncu.abdullah.orderapp.entity.abstracts.Order;
import org.tutuncu.abdullah.orderapp.entity.concretes.CorporateCustomer;
import org.tutuncu.abdullah.orderapp.entity.concretes.IndividualCustomer;
import org.tutuncu.abdullah.orderapp.entity.concretes.Invoice;
import org.tutuncu.abdullah.orderapp.repository.abstracts.CustomerRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.Month.JUNE;

public class CustomerServiceImpl implements org.tutuncu.abdullah.orderapp.service.abstracts.CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> getAllCustomer() {

        return customerRepository.getAllCustomer();

    }

    @Override
    public List<IndividualCustomer> getAllIndividualCustomer() {
        return customerRepository.getAllIndividualCustomer();
    }

    @Override
    public List<CorporateCustomer> getAllCorporateCustomer() {
        return customerRepository.getAllCorporateCustomer();
    }

    @Override
    public void addIndividualCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order, Invoice invoice, String sector) {
        customerRepository.addIndividualCustomer(id, customerType, fullName, dateOfRegistration, order, invoice, sector);
    }

    @Override
    public void addCorporateCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order, Invoice invoice, String sector) {
        customerRepository.addCorporateCustomer(id, customerType, fullName, dateOfRegistration, order, invoice, sector);
    }

    @Override
    public void filterCustomersByName() {
        customerRepository.getAllCustomer().stream()
                .filter(customer -> customer.getFullName().contains("C"))
                .forEach(customer -> System.out.println(customer.getFullName()));
    }

    @Override
    public int customersFilterInvoiceTotalCost() {

        List<Customer> customers = customerRepository.getAllCustomer().stream()
                .filter(customer -> customer.getInvoice().getCreateDate().getMonth() == JUNE).collect(Collectors.toList());
        int temp = 0;
        for (Customer customer : customers) {
            temp += customer.getInvoice().getCost();
        }


        return temp;
    }

    @Override
    public List<Invoice> getAllInvoice() {
        List<Invoice> invoices = customerRepository.getAllCustomer().stream()
                .map(x -> x.getInvoice()).collect(Collectors.toList());

        return invoices;
    }

    @Override
    public List<Invoice> getFilteredInvoices() {

        List<Invoice> invoices = customerRepository.getAllCustomer().stream()
                .filter(customer -> customer.getInvoice().getCost() > 1500).map(x->x.getInvoice())
                .collect(Collectors.toList());

        return invoices;
    }

    @Override
    public double getFilteredInvoicesAverageCost() {

        List<Customer> invoicesAverage = customerRepository.getAllCustomer().stream()
                .filter(customer -> customer.getInvoice().getCost() > 1500).collect(Collectors.toList());
        double temp = 0, result = 0;
        for (Customer customer : invoicesAverage) {
            temp += customer.getInvoice().getCost();
        }
        result = temp / invoicesAverage.size();
        return result;
    }

    @Override
    public List<Customer> getFilteredInvoiceByCustomerName() {

        List<Customer> customerList=customerRepository.getAllCustomer().stream()
               .filter(customer -> customer.getInvoice().getCost() <500).collect(Collectors.toList());

        return customerList;
    }

    @Override
    public List<CorporateCustomer> getFilteredCorporateCustomer() {
        List<CorporateCustomer> corporateCustomers=customerRepository.getAllCorporateCustomer().stream()
                .filter(customer->customer.getInvoice().getCreateDate().getMonth()==JUNE && customer.getInvoice().getCost()<750).collect(Collectors.toList());

        return corporateCustomers;
    }


}
