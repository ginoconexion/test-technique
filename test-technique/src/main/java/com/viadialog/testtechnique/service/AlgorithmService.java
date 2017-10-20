package com.viadialog.testtechnique.service;

import com.viadialog.testtechnique.helper.AlgorithmHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pgm on 19/10/17.
 */
@Service
public class AlgorithmService {

    @Autowired
    private AlgorithmHelper algorithmHelper;

    public String checkNumber(int number) {
        String output = "";

        output += algorithmHelper.checkIfDivisibleByNumber(number, 3, AlgorithmHelper.FOO);
        output += algorithmHelper.checkIfDivisibleByNumber(number, 5, AlgorithmHelper.BAR);
        output += algorithmHelper.checkIfDivisibleByNumber(number, 7, AlgorithmHelper.QIX);

        output += algorithmHelper.checkOccurences(number);

        if (output.equals("")) {
            output = String.valueOf(number);
        }
        return output;
    }

}
