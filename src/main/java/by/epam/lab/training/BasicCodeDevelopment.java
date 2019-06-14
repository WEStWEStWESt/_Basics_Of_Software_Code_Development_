package by.epam.lab.training;

import by.epam.lab.training.service.Executor;
import by.epam.lab.training.service.impl.*;

public class BasicCodeDevelopment {

    public static void main(String[] args) {

        Executor[] executors = {
                new TaskOneLineProgramsExecutor(),
                new TaskTwoLineProgramsExecutor(),
                new TaskThreeLineProgramsExecutor(),
                new TaskFourLineProgramsExecutor()
        };

        Printer printer = new PrinterImpl();
        printer.print(executors);
    }

}
