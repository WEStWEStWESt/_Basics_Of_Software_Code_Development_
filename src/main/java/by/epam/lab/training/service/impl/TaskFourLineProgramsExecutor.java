package by.epam.lab.training.service.impl;

import by.epam.lab.training.service.LineProgramsExecutor;
import by.epam.lab.training.util.RandomUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFourLineProgramsExecutor implements LineProgramsExecutor {

    @Override
    public String execute() {

        String result = Double.toString(RandomUtil.generateFloatPointNumber());
        Pattern pattern = Pattern.compile("[\\d]{3}");
        //Matcher matcher = pattern.matcher(result);

        return "++ " + result + " ++";
    }

    @Override
    public String toString() {
        return "Task Four result: " + execute();
    }

}
