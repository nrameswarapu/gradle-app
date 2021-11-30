package com.naga.rewrite;

import java.util.Date;

public abstract class Customer {

	private Date dateOfBirth;
	private String firstName;
	private String lastName;
	
	public abstract void setCustomerInfo(String lastName);

    public String hello() {
        return "Hello from com.naga.rewrite.Customer!";
    }
    String hello = "hello world";
}
