package com.company;

public class Glass implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Message message) {
        if(message.getMessage().equals("Szkło") || message.getMessage().equals("Glass")) {
            System.out.println("Pojemnik na szkło: " + message.getMessage());
        } else {
            chain.requestProcess(message);
        }
    }
}
