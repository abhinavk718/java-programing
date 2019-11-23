package jspiderbtm.demoapp;
/* Example of write only data*/
public class Advertise 
{
	private String email;
	private long contact;
	public void setMail(String gmail)
	{
		this.email=gmail;
		System.out.println("Mail id : "+email);
	}
	public void setContact(long contactNumber)
	{
		this.contact=contactNumber;
		System.out.println("Contact Number : "+contact);
	}
	

}
