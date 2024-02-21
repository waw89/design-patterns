/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author luisp
 */
public class PagoFactory  {
    
    public Pago obtenerPago(TipoDePago tipoDePago) throws NoSuchFieldException{
               
        
        if(tipoDePago == TipoDePago.PAYPAL){
            
            return new PagoPayPal();
            
        }else if(tipoDePago == TipoDePago.TARJETA_CREDITO){
            
            return new PagoTarjetaCredito();
            
            
        }else if(tipoDePago == TipoDePago.TARJETA_DEBITO){
            
            return new PagoTarjetaDebito();
            
        }else if(tipoDePago == TipoDePago.TRANSFERENCIA_BANCARIA){
            
            return new PagoTransferenciaBancaria();
            
        }else if(tipoDePago == TipoDePago.BITCOIN){
            
            return new PagoBitcoin();
            
        }else if(tipoDePago == TipoDePago.EFECTIVO){
            
            return new PagoEfectivo();
            
        }else if(tipoDePago == TipoDePago.APPLE_PAY){
            
            return new PagoApplePay();
            
        }else if(tipoDePago == TipoDePago.GOOGLE_PAY){
            
            return new PagoGooglePay();
            
        }else{
            throw new NoSuchFieldException("Tipo de pago no encontrado");
        } 
    }
}
