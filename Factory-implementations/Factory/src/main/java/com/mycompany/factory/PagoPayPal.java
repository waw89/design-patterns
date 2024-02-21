/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author luisp
 */
public class PagoPayPal implements Pago {

    @Override
    public void crearPago() {

        System.out.println("Se ha procesado un tipo de pago de tipo PayPal");

    }
}
