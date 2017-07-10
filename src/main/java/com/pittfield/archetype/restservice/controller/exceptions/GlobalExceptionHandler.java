
package com.pittfield.archetype.restservice.controller.exceptions;

import com.pittfield.archetype.restservice.beans.Response;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	private final static Logger logger = Logger.getLogger(GlobalExceptionHandler.class);
	
	@Autowired
	private MessageSource messageSource;
	
	@ExceptionHandler(value = NoHandlerFoundException.class)
	public ResponseEntity<Response> requestHandlingNoHandlerFound(NoHandlerFoundException ex) 
	{
		Response resp = new Response(messageSource.getMessage("resourceNotFound.error", new Object[]{ex.getLocalizedMessage()}, null));

		logger.info(resp);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Response> lookupServiceHubException(Exception ex) 
	{
        Response resp = new Response(messageSource.getMessage("resourceRuntimeFailure.error", new Object[]{ex.getLocalizedMessage()}, null));
		
		logger.error(resp);
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp);
	}
}