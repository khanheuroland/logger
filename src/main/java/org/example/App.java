package org.example;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
    private static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.fatal("This is fatal message");
        logger.error("This is error message");
        System.out.println("Logic executed successfully....");
    }*/
    public ArrayList<Integer> GetNumberNotDupplicate(int[] inputArray)
    {
        ArrayList<Integer> output = new ArrayList<>();
        //TODO:
        for (int i = 0; i < inputArray.length; i++) {
            int number = inputArray[i];
            boolean isDupplicate = false;
            for (int j = 0; j < inputArray.length; j++) {
                if(number== inputArray[j] && i!=j)
                {
                    isDupplicate=true;
                    break;
                }
            }
            if(isDupplicate==false)
            {
                output.add(number);
            }
        }
        return output;
    }

    public int GetCountDupplicateNumber(int[] inputArray)
    {
        int count=0;
        for (int i = 0; i < inputArray.length-1; i++) {
            int temp = 0;
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i]==inputArray[j])
                {
                    temp++;
                }
            }
            if(temp==1)
            {
                count++;
            }
        }
        return count;
    }

    /*
    public ArrayList<Integer> GetTopSNT(int n)
    {
        ArrayList<Integer> output = new ArrayList<>();
        int i=2;
        while (output.size()<n)
        {
            if(CheckSNT(i)==true)
            {
                output.add(i);
            }
            i++;
        }
        return output;
    }*/
    public static void main(String[] args) {
        Random rd = new Random();
        int firNumber = rd.nextInt(10);
        int secNumber = firNumber - rd.nextInt(10);

        int expectedNumber;
        try
        {
            expectedNumber = firNumber/secNumber;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            expectedNumber = 0;
        }

        System.out.println(expectedNumber);
    }
}
