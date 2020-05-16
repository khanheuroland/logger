package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private static final Logger logger = Logger.getLogger(AppTest.class);
    @Test
    public void shouldAnswerWithTrue()
    {
        for (int i = 0; i < 10; i++) {
            logger.info(i);
        }

        int a=10;
        int b= a-a;
        try {
            int c = a / b;
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }

}
