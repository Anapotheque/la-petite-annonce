package fr.meehome.training.ippon.training;

import org.junit.Assert;
import org.junit.Test;

public class PersonOfInterestTest {

    @Test
    public void machine_should_do(){
        PersonOfInterest personOfInterest = new PersonOfInterest();
        Assert.assertEquals("", personOfInterest.predictCrimes());
    }

}