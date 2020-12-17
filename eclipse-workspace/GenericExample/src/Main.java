
public class Main {
	public static void main(String[] argv) {
		Integer[] a = {1, 2, 3, 4, 2, 2, 3, 4, 1};
		GenericList<Integer> tmp = new GenericList<Integer>(a);
		
		System.out.println(tmp);
		tmp.sortGenericList();
		System.out.println(tmp);
		
	}
	
}
