package com.test.automations.ui.exceptions;

import org.junit.jupiter.api.Assertions;

public class TestScenarioFailedException extends RuntimeException{

    public TestScenarioFailedException(){

        Assertions.fail();

    }

}
