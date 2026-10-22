package com.satyam.main.service;

public class Password {
    String algo;


    public Password(String algo) {
        this.algo = algo;
        System.out.println("Password is Created ");
    }

    public void passwordAlgoUsed() {
        System.out.println("The ALgo Used For Password is " + algo);
    }
}
