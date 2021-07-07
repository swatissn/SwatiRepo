package FunctionalInterfacExample;

public class ArrayExample {
	public static void main(String[] args) {
		String [] values = new String []{"1","2","3","4"};
		StringBuffer buffer = new StringBuffer();
		for(int i =0 ;i < values.length;){
			
			buffer.append(values[i]);
			
		}
		System.out.println(buffer);
	}
}
