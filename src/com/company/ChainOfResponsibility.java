package com.company;

public interface ChainOfResponsibility {

    void nextChain(ChainOfResponsibility nextChain);
    void requestProcess(Message message);
}
