/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;
import java.util.Scanner;
/**
 *
 * @author gkhaa
 */
public class MattressSalesReport {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Declaring a 1D array
        String[] names = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
      //Declaringand a 2D array
        int[][] sales = new int[3][3];

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + names[p] + ": ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*****************************************");

        PrintProduct printer = new PrintProduct(new Product(names, sales));
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();
    }
}
   