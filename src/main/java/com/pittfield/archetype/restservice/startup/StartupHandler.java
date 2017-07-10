package com.pittfield.archetype.restservice.startup;

/**
 * Created by EvanDesk on 7/9/2017.
 */

import com.pittfield.archetype.restservice.constants.AppConstants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class StartupHandler
{
    private final static Logger logger = Logger.getLogger(StartupHandler.class);

    @Value("${spring.profiles.active}")
    private String env;

    @PostConstruct
    public void init()
    {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        logger.info("============================ Build Confirmation ========================================");
        logger.info("Application built: " + AppConstants.APP_NAME);
        logger.info("Application version: " + AppConstants.APP_VERSION);
        logger.info("Runtime Server environment: " + env);
        logger.info("Build time: " + now.format(formatter));
        logger.info("========================================================================================");
    }
}