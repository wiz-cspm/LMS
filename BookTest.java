public class BookTest {

	public static void main(String [] args) throws Exception {
		
		Book data = new Book("java", "1234567890123456", "ravi", "ravi", true);
		Library obj = new Library();
		String ans1 = obj.validateIFSC(data);
		String ans2 = obj.issueBook(data, "java");
		
		System.out.println(ans1);
		System.out.println(ans2);
	}
}
