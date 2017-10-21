package com.viadialog.testtechnique.helper;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by pgm on 20/10/17.
 */
@Component
public class AlgorithmHelper {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    public String checkOccurences(int numberToTest) {
        String numberToTestString = String.valueOf(numberToTest);


        return Arrays.asList(numberToTestString.split(""))
                .stream()
                .map(s -> getCorespondingCodet(s))
                .collect(Collectors.joining(""));
    }

    public String getCorespondingCodet(String numberString) {
        switch (numberString) {
            case "3" :
                return FOO;
            case "5":
                return BAR;
            case "7":
                return QIX;
            default:
                return "";
        }
    }

    public String checkIfDivisibleByNumber(int numberToTest, int divisor, String code) {
        return numberToTest % divisor == 0 ? code : "";
    }
}
