package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log extends BaseClass{
    private static final Logger logger = LogManager.getLogger(Log.class.getName());

    public static void info (String message)
    {
        logger.info(message);
    }
    //Warn Level Logs
    public static void warn (String message)
    {
        logger.warn(message);
    }
    //Error Level Logs
    public static void error (String message)
    {
        logger.error(message);
    }
    //Fatal Level Logs
    public static void fatal (String message){
        logger.fatal (message);
    }
}
