package by.epam.lab.training.service.impl;

import by.epam.lab.training.service.LineProgramsExecutor;
import by.epam.lab.training.util.RandomUtil;

public class TaskOneLineProgramsExecutor implements LineProgramsExecutor {

    @Override
    public String execute() {
        int a = RandomUtil.generateNumber();
        int b = RandomUtil.generateNumber();
        int c = RandomUtil.generateNumber();

        double z = ((a - 3.0) * b / 2.0) + c;

        return String.valueOf(z);
    }

    @Override
    public String toString() {
        return "Task One result: " + execute();
    }

}
