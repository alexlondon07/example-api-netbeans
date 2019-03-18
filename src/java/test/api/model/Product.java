/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.api.model;

import java.util.List;

/**
 *
 * @author alexlondon07
 */
public class Product {
    private int id;
    private String name;
    private float price;
    private List<Product> productsList;


    public Product() {
    }

    public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
    }

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public float getPrice() {
            return price;
    }

    public void setPrice(float price) {
            this.price = price;
    }

    public List<Product> getProductsList() {
            return productsList;
    }

    public void setProductsList(List<Product> productsList) {
            this.productsList = productsList;
    }
}

