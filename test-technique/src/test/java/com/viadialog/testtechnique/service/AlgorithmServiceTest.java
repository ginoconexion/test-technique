package com.viadialog.testtechnique.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by pgm on 20/10/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AlgorithmServiceTest {

    @Autowired
    private AlgorithmService algorithmService;

    @Test
    public void check_if_13_is_Foo() {
        Assert.assertEquals("Foo", algorithmService.checkNumber(13));
    }

    @Test
    public void check_if_15_is_FooBarBar() {
        Assert.assertEquals("FooBarBar", algorithmService.checkNumber(15));
    }

    @Test
    public void check_if_33_is_FooFooFoo() {
        Assert.assertEquals("FooFooFoo", algorithmService.checkNumber(33));
    }

    @Test
    public void check_if_51_is_FooBar() {
        Assert.assertEquals("FooBar", algorithmService.checkNumber(51));
    }

    @Test
    public void check_if_53_is_BarFoo() {
        Assert.assertEquals("BarFoo", algorithmService.checkNumber(53));
    }

    @Test
    public void check_if_21_is_FooQix() {
        Assert.assertEquals("FooQix", algorithmService.checkNumber(21));
    }

}
