package com.gbn.service;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class StudentService implements MessageSourceAware{
	
	private MessageSource source = null;

	@Override
	public void setMessageSource(MessageSource source) {
		this.source = source;
	}
	
	public void printMessage()
	{
		String englishName = source.getMessage("message",
    			new Object[] { "Ramesh", "Java Full Stack" }, Locale.US);

    	System.out.println(englishName);

    	String chineseName = source.getMessage("message",
    			new Object[] { "Ramesh", "Java Full Stack" },
                        Locale.SIMPLIFIED_CHINESE);

    	System.out.println(chineseName);
	}

}
