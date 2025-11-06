package com.fahami.cda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "JOHN";
        try {
            int number = Integer.parseInt(name);
            IO.println(number);
        }catch(NumberFormatException e){
            // e.printStackTrace();
            IO.println("Exception levée : " + e.getMessage());
        }catch(Exception e){
            IO.println("Exception générique : " + e.getMessage());
        }

        IO.println("Tout s'est bien executé");
    }
}