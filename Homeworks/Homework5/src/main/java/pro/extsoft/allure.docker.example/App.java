package pro.extsoft.allure.docker.example;

import io.github.tatools.sunshine.core.EngineException;
import io.github.tatools.sunshine.core.FileSystemOfClasspathClasses;
import io.github.tatools.sunshine.core.RegexCondition;
import io.github.tatools.sunshine.junit4.Junit4Engine;
import io.github.tatools.sunshine.junit4.JunitSuite;
import ru.yandex.qatools.allure.junit.AllureRunListener;

public class App {

    public static void main(String[] args) throws EngineException {
        System.setProperty("allure.results.directory", "allure-result");
        new Junit4Engine(
                new JunitSuite(
                        new FileSystemOfClasspathClasses(),
                        new RegexCondition("^pro.extsoft.allure.docker.example.tests.+")
                )
        ).with(new AllureRunListener()).run();
    }
}
