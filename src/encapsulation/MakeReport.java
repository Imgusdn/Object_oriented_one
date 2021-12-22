package encapsulation;

public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();	// StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
	
	private String line = "===========================================\n";
	private String title = "  이름\t   주소 \t\t  전화번호  \n";
	private void makeHeader() 
	{
		buffer.append(line);	// StringBuffer 자료형은 append 메소드를 사용하여 계속해서 문자열을 추가해 나갈 수 있다.
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter()
	{
		
		buffer.append(line);
	}
	
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();	// toString() 메소드를 이용하면 String 자료형으로 변경할 수 있다.
	}

}
