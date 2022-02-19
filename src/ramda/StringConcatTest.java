package ramda;

public class StringConcatTest {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Wolrd";
		
		StringConcatIml strImpl = new StringConcatIml();
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = (s,v)-> System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "...." + s2);
				
			}
		};
		
		concat2.makeString(s1, s2);
	}
}
