package com.mycompany.mattresssalesreport;


import com.mycompany.mattresssalesreport.IProduct;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gkhaa
 */
public class Product implements IProduct {
    private String[] names;   // 1D array
    private int[][] sales;    // 2D array [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) {
            for (int m = 0; m < sales[p].length; m++) {
                total += sales[p][m];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int entries = sales.length * sales[0].length; // 3 x 3 = 9
        return (double) GetTotalProductsSold() / entries;
    }

    @Override
    public String GetMostPopularProduct() {
        int highest = 0;
        String popular = "";
        for (int p = 0; p < sales.length; p++) {
            for (int m = 0; m < sales[p].length; m++) {
                if (sales[p][m] > highest) {
                    highest = sales[p][m];
                    popular = names[p];
                }
            }
        }
        return popular + " (" + highest + ")";
    }
}