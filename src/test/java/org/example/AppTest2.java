package org.example;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class AppTest2 {
    private static final Logger logger = Logger.getLogger(AppTest2.class);
    @Before
    public void InitTest()
    {
        logger.info("Init test 2");
    }

    @Test
    public void Test()
    {
        logger.info("Testcase from Test 2");
    }
}
