package by.epam.lab.training.service.impl;

import by.epam.lab.training.service.Executor;

import java.util.stream.Stream;

public class PrinterImpl implements Printer {

    @Override
    public void print(Executor... executors) {
        Stream.of(executors).forEach(System.out::println);
    }

}
