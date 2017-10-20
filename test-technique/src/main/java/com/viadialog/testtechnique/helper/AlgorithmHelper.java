package com.viadialog.testtechnique.helper;

import org.springframework.stereotype.Component;

/**
 * Created by pgm on 20/10/17.
 */
@Component
public class AlgorithmHelper {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    public String checkOccurences(int numberToTest) {
        String output = "";
        String numberToTestString = String.valueOf(numberToTest);
        for (int i = 0; i < numberToTestString.length(); i ++ ) {
            output += getCorespondingCode(numberToTestString.substring(i, i + 1));
        }
        return output;
    }

    public String checkIfDivisibleByNumber(int numberToTest, int divisor, String code) {
        return numberToTest % divisor == 0 ? code : "";
    }

    public String getCorespondingCode(String numberString) {
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
}
