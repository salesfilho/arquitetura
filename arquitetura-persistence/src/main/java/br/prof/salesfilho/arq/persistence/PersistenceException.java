/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.prof.salesfilho.arq.persistence;

/**
 *
 * @author salesfilho
 */
public class PersistenceException extends RuntimeException {

    String message;

    public PersistenceException(String message) {
        super(message);
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
