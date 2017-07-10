package com.pittfield.archetype.restservice.controller;

import com.pittfield.archetype.restservice.beans.AppInfo;
import com.pittfield.archetype.restservice.constants.AppConstants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appInfo")
public class AppInfoController
{
	private final static Logger logger = Logger.getLogger(AppInfoController.class);

	@Value("${spring.profiles.active}")
	private String env;
	
	@GetMapping(value="info")
	public ResponseEntity<AppInfo> getAppInfo() 
	{
		logger.info("AppInfo requested");

		return ResponseEntity.status(HttpStatus.OK).body(new AppInfo(AppConstants.APP_NAME, AppConstants.APP_VERSION, env));
	}
}