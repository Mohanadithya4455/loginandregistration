package com.security.model;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String productName;
    private String weight;
    private Long price;
    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] qrCode;

    public Product() {
    }

    public Product(Long id, Long price, String productName, byte[] qrCode, String weight) {
        Id = id;
        this.price = price;
        this.productName = productName;
        this.qrCode = qrCode;
        this.weight = weight;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public byte[] getQrCode() {
        return qrCode;
    }

    public void setQrCode(byte[] qrCode) {
        this.qrCode = qrCode;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", Id=" + Id +
                ", productName='" + productName + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
