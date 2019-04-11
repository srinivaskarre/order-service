package com.skarre.order.model;

import javax.persistence.*;

@Entity
@Table(name="ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ORDER_ID")
    private Long orderId;

    @Column(name="EXT_ORDER_ID")
    private String extOrderId;

    @Column(name="SKU")
    private String SKU;

    @Column(name="CUSTOMER_NAME")
    private String customerName;

    @Column(name="CUSTOMER_ID")
    private String customerId;

    @Column(name="ADDRESS")
    private String address;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getExtOrderId() {
        return extOrderId;
    }

    public void setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
    }

    public Order(Long orderId, String extOrderId, String SKU, String customerName, String customerId, String address) {
        this.orderId = orderId;
        this.extOrderId = extOrderId;
        this.SKU = SKU;
        this.customerName = customerName;
        this.customerId = customerId;
        this.address = address;
    }

    public String getSKU() {
        return SKU;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", extOrderId='" + extOrderId + '\'' +
                ", SKU='" + SKU + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
