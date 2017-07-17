package fr.meehome.training.qualification.speakingintongues;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpeakingInTonguesTest {

    @Test
    public void should_return_good_value_from_google_line_per_line() {
        assertEquals("our language is impossible to understand", SpeakingInTongues.traitement("ejp mysljylc kd kxveddknmc re jsicpdrysi"));
        assertEquals("there are twenty six factorial possibilities", SpeakingInTongues.traitement("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"));
        assertEquals("so it is okay if you want to just give up", SpeakingInTongues.traitement("de kr kd eoya kw aej tysr re ujdr lkgc jv"));
    }
}
