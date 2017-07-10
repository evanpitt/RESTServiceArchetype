
package com.pittfield.archetype.restservice.beans;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class Response implements Serializable
{
	private String responseTxt;

	public String getResponseTxt()
	{
		return responseTxt;
	}

	public void setResponseTxt(String responseTxt)
	{
		this.responseTxt = responseTxt;
	}

	public Response(String resp)
	{
		this.responseTxt = resp;
	}

	public String toString()
	{
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}