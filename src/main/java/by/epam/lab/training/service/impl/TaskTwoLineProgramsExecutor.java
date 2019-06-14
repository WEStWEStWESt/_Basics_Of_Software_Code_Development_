package by.epam.lab.training.service.impl;

import by.epam.lab.training.service.LineProgramsExecutor;
import by.epam.lab.training.util.RandomUtil;

public class TaskTwoLineProgramsExecutor implements LineProgramsExecutor {

    @Override
    public String execute() {
        int a = RandomUtil.generatePositiveNumber();
        int b = RandomUtil.generatePositiveNumber();
        int c = RandomUtil.generatePositiveNumber();

        double result = (b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));

        return String.valueOf(result);
    }

    @Override
    public String toString() {
        return "Task Two result: " + execute();
    }

}
