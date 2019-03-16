package com.gbn.mail;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestMail {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object o = factory.getBean("id2");
		SendMail ml = (SendMail)o;
		
		ml.sendMail("khammamvideos@gmail.com","khammamvideos@gmail.com","Java Training","Welcome to GBN technologies");
				
	}

}

/*By default Gmail account is highly secured. When we use gmail smtp from non gmail tool, email is blocked.  To test in our local environment, 
  make your gmail account less secure as
 

1.	Login to Gmail. 
2.	Access the URL as https://www.google.com/settings/security/lesssecureapps 
3.	Select "Turn on"*/