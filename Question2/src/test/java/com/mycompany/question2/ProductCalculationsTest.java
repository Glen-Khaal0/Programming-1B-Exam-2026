/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.question2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {

        ProductCalculations calc =
                new ProductCalculations(3500);

        double expected = 525.0;
        double actual = calc.GetVat();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {

        ProductCalculations calc =
                new ProductCalculations(3500);

        double expected = 4200.0;
        double actual = calc.GetTotal();

        assertEquals(expected, actual, 0.001);
    }
}