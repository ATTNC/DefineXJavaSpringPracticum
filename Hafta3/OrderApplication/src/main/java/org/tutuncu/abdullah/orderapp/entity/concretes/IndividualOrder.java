package org.tutuncu.abdullah.orderapp.entity.concretes;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Order;

import java.time.LocalDate;

public class IndividualOrder extends Order {

    public IndividualOrder(int id, String orderType, int cost, LocalDate createDate) {
        super(id, orderType, cost, createDate);
    }
}
