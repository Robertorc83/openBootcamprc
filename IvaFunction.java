package com.OpenBootcamp;


public class IvaFunction {

    public static void main(String[] args) {

        System.out.println(priceWithiva(80));

    }

    public static double priceWithiva (long price) {

            double Iva = 0.21 ;
            double newPrice = price + (Iva * price);
            return newPrice;

        }


}
