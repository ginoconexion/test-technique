package com.viadialog.testtechnique.service;

import com.viadialog.testtechnique.helper.AlgorithmHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by pgm on 19/10/17.
 */
@Service
public class AlgorithmService {

    @Autowired
    private AlgorithmHelper algorithmHelper;

    public String checkNumber(int number) {

        String output = Stream.of(
                algorithmHelper.checkIfDivisibleByNumber(number, 3, AlgorithmHelper.FOO),
                algorithmHelper.checkIfDivisibleByNumber(number, 5, AlgorithmHelper.BAR),
                algorithmHelper.checkIfDivisibleByNumber(number, 7, AlgorithmHelper.QIX),
                algorithmHelper.checkOccurences(number)
        ).collect(Collectors.joining(""));

        return output.equals("") ? String.valueOf(number) : output;
    }

}
