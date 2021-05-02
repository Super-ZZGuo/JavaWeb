package com.zhiguo.pojo;

import java.math.BigDecimal;

public class Book {

    private String sn;
    private String name;
    private String autor;
    private double price;

    public Book(String sn, String name, String autor, double price) {
        this.sn = sn;
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

    public Book() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", price=" + price +
                '}';
    }
}
