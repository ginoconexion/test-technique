package com.viadialog.testtechnique.clr;

import com.viadialog.testtechnique.service.AlgorithmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

/**
 * Created by pgm on 20/10/17.
 */
@Component
@Profile("app")
public class AlgorithmCommandLineRunner implements CommandLineRunner {

    private final static Logger LOGGER = LoggerFactory.getLogger(AlgorithmCommandLineRunner.class);

    @Autowired
    private AlgorithmService algorithmService;


    @Override
    public void run(String... strings) throws Exception {

        IntStream.range(1, 101)
                .forEach(n -> LOGGER.info(algorithmService.checkNumber(n)));
    }
}
