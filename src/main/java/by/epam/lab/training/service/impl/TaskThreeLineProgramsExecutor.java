package by.epam.lab.training.service.impl;

import by.epam.lab.training.service.LineProgramsExecutor;
import by.epam.lab.training.util.RandomUtil;

import static java.lang.Math.*;

public class TaskThreeLineProgramsExecutor implements LineProgramsExecutor {

    @Override
    public String execute() {
        int x = RandomUtil.generatePositiveNumber();
        int y = RandomUtil.generatePositiveNumber();

        double result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

        return String.valueOf(result);
    }

    @Override
    public String toString() {
        return "Task Three result: " + execute();
    }
}
