package com.company.StringReverse.Test;

import com.company.StringReverse.StringReverse;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {
    StringReverse stringReverse;
    private static final Object[] getStrings(){
        return $(
                $("salam","malas"),
                $("nima","amin"),
                $("maryam","mayram"),
                $("abdpoor","roopdba"),
                $("abedi","ideba"),
                $("dorcheh","hehcrod")
        );

    }
    @Before
    public void setUp(){
        stringReverse = new StringReverse();
    }
    @Test
    @Parameters(method = "getStrings")
    public void StringShouldReverse(String input , String expected){
        assertEquals(expected,stringReverse.Reverse(input));
    }
}
