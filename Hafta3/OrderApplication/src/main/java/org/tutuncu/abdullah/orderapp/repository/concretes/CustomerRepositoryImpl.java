package org.tutuncu.abdullah.orderapp.repository.concretes;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Customer;
import org.tutuncu.abdullah.orderapp.entity.abstracts.Order;
import org.tutuncu.abdullah.orderapp.entity.concretes.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class CustomerRepositoryImpl implements org.tutuncu.abdullah.orderapp.repository.abstracts.CustomerRepository {


    private static final Set<IndividualCustomer> individualCustomers=new HashSet<>(Arrays.asList(

            new IndividualCustomer(2,"Individual Customer","Abdullah Tütüncü", LocalDate.of(2022, Month.JUNE,12),
                    new IndividualOrder(2,"Individual Order",100,LocalDate.of(2022,Month.JUNE,12)),
                    new Invoice(2,"Individual Invoice",100,LocalDate.of(2022,Month.JUNE,12)),"Software"),

            new IndividualCustomer(1,"Individual Customer","Zeynep Korkmaz", LocalDate.of(2022, Month.APRIL,16),
                    new IndividualOrder(1,"Individual Order",150,LocalDate.of(2022,Month.APRIL,16)),
                    new Invoice(1,"Individual Invoice",150,LocalDate.of(2022,Month.APRIL,16)),"Consultation"),

            new IndividualCustomer(3,"Individual Customer","Murat Kaya", LocalDate.of(2022, Month.MAY,25),
                    new IndividualOrder(3,"Individual Order",200,LocalDate.of(2022,Month.MAY,25)),
                    new Invoice(3,"Individual Invoice",200,LocalDate.of(2022,Month.MAY,25)),"Education")

    )
    );

    private static final Set<CorporateCustomer> corporateCustomers=new HashSet<>(Arrays.asList(

           new CorporateCustomer(1,"Corporate Customer","ABC Bank",LocalDate.of(2022,Month.FEBRUARY,15),
                   new CorporateOrder(1,"Corporate Order",1600,LocalDate.of(2022,Month.FEBRUARY,15)),
                   new Invoice(1,"Corporate Invoice",1600,LocalDate.of(2022,Month.FEBRUARY,15)),"Finance"),

            new CorporateCustomer(2,"Corporate Customer","AIR Soft",LocalDate.of(2022,Month.JUNE,20),
                    new CorporateOrder(2,"Corporate Order",500,LocalDate.of(2022,Month.JUNE,20)),
                    new Invoice(2,"Corporate Invoice",500,LocalDate.of(2022,Month.JUNE,20)),"Software"),

            new CorporateCustomer(3,"Corporate Customer","CARE Holding",LocalDate.of(2022,Month.DECEMBER,5),
                    new CorporateOrder(3,"Corporate Order",2000,LocalDate.of(2022,Month.DECEMBER,5)),
                    new Invoice(3,"Corporate Invoice",2000,LocalDate.of(2022,Month.DECEMBER,5)),"Health")
    )
    );




    @Override
    public List<Customer> getAllCustomer() {

        List <Customer> customerList=new ArrayList<>();
        customerList.addAll(individualCustomers);
        customerList.addAll(corporateCustomers);
        return customerList;
    }

    @Override
    public List<IndividualCustomer> getAllIndividualCustomer() {
        return individualCustomers.stream().toList();
    }

    @Override
    public List<CorporateCustomer> getAllCorporateCustomer() {
        return corporateCustomers.stream().toList();
    }

    @Override
    public void addIndividualCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order,Invoice invoice,String sector) {
        individualCustomers.add(new IndividualCustomer(id, customerType, fullName,  dateOfRegistration, order,invoice,sector));
    }

    @Override
    public void addCorporateCustomer(int id, String customerType, String fullName, LocalDate dateOfRegistration, Order order,Invoice invoice, String sector) {
        corporateCustomers.add(new CorporateCustomer(id,customerType,fullName,dateOfRegistration, order,invoice,sector));
    }





}
