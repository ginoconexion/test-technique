package com.viadialog.testtechnique.helper;

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
public class AlgorithmHelperTest {

    @Autowired
    private AlgorithmHelper algorithmHelper;

    @Test
    public void checkOccurences_of_53() {
        Assert.assertEquals("BarFoo", algorithmHelper.checkOccurences(53));
    }

    @Test
    public void checkOccurences_of_35() {
        Assert.assertEquals("FooBar", algorithmHelper.checkOccurences(35));
    }

    @Test
    public void check_if_10_divisible_by_5() {
        Assert.assertEquals("Bar", algorithmHelper.checkIfDivisibleByNumber(10, 5, "Bar"));
    }

    @Test
    public void check_if_10_divisible_by_3() {
        Assert.assertEquals("", algorithmHelper.checkIfDivisibleByNumber(10, 3, "Foo"));
    }

    @Test
    public void check_if_14_divisible_by_7() {
        Assert.assertEquals("Qix", algorithmHelper.checkIfDivisibleByNumber(14, 7, "Qix"));
    }
}
