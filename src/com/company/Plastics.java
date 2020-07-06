package com.company;

public class Plastics implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Message message) {
        if (message.getMessage().equals("Tworzywa sztuczne") || message.getMessage().equals("Plastic")) {
            System.out.println("Pojemnik na plastik: " + message.getMessage());
        } else {
            chain.requestProcess(message);
        }
    }
}
