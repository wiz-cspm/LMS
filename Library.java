package com.ds;

public class Library {
    
	//private String IFSC = "1234567891012145";
	
	public String validateIFSC(Book details) throws Exception  {
		if(details.getIFSC().length()==16)
		{
		return "IFSC is valid";
		}
		else
		{
			throw new InvalidIFSCException("IFSC is invalid");
		}
	}
	
	public String issueBook(Book details, String name) throws Exception  {
		if(details.isAvailable()) {
			details.setAvailable(false);
			details.setIssuedBy(name);
			return "Book is issued successfully";
		}
		else
		{
			
			throw new BookUnavailableException("Book is unavalibale");
		}
			
	}
	
}
