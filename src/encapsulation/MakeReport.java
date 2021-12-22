package encapsulation;

public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();	// StringBuffer�� ���ڿ��� �߰��ϰų� ���� �� �� �ַ� ����ϴ� �ڷ����̴�.
	
	private String line = "===========================================\n";
	private String title = "  �̸�\t   �ּ� \t\t  ��ȭ��ȣ  \n";
	private void makeHeader() 
	{
		buffer.append(line);	// StringBuffer �ڷ����� append �޼ҵ带 ����Ͽ� ����ؼ� ���ڿ��� �߰��� ���� �� �ִ�.
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
		return buffer.toString();	// toString() �޼ҵ带 �̿��ϸ� String �ڷ������� ������ �� �ִ�.
	}

}
