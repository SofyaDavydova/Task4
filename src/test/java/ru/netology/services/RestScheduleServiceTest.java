package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestScheduleServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestSchedule.csv")
    public void testRestSchedule (int expected, int income, int expense, int threshold) {
        RestScheduleService service = new RestScheduleService();

        int actual = service.calculate(income,expense,threshold);

        Assertions.assertEquals(expected, actual);
    }

}
