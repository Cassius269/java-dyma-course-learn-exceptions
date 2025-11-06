package com.fahami.cda.exception;

public class BlankInputException extends Exception {
    // Création de deux constructeurs (l'un vide et l'autre plein avec message personnalisé)
    public BlankInputException(){
        super();
    }

    public BlankInputException(String message){
        super(message);
    }
}
