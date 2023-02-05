package org.tutuncu.abdullah.orderapp.entity.concretes;

import org.tutuncu.abdullah.orderapp.entity.abstracts.Order;

import java.time.LocalDate;

public class CorporateOrder extends Order {
    public CorporateOrder(int id, String orderType, int cost, LocalDate createDate) {
        super(id, orderType, cost, createDate);
    }
}
