/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bun.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Visit.R
 */
public class Sale {
    private String saleName;
    private String saleLastname;
    private String salePrice;

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSaleLastname() {
        return saleLastname;
    }

    public void setSaleLastname(String saleLastname) {
        this.saleLastname = saleLastname;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }
}
