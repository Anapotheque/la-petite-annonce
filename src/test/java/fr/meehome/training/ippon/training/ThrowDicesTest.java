package fr.meehome.training.ippon.training;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ThrowDicesTest {

    @Test
    public void throw_should_do() {
        ThrowDices throwDices = new ThrowDices();

        Assert.assertEquals(BigDecimal.valueOf(0.30556), throwDices.throwDices(2, 6));
        Assert.assertEquals(BigDecimal.valueOf(0.83849), throwDices.throwDices(10, 6));
    }
}