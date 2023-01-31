public class Book {
private String name;
private String IFSC;
private String author;
private String issuedBy;
private boolean available;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIFSC() {
	return IFSC;
}
public void setIFSC(String iFSC) {
	IFSC = iFSC;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getIssuedBy() {
	return issuedBy;
}
public void setIssuedBy(String issuedBy) {
	this.issuedBy = issuedBy;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}

public Book(String name, String IFSC, String author, String issuedBy, boolean available) {
	super();
	this.name = name;
	this.IFSC = IFSC;
	this.author = author;
	this.issuedBy = issuedBy;
	this.available = available;
}






}
