package com.company;

public class Paper implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Message message) {
        if (message.getMessage().equals("Papier") || message.getMessage().equals("Paper")) {
            System.out.println("Pojemnik na papier: " + message.getMessage());
        } else {
            chain.requestProcess(message);
        }
    }
}
