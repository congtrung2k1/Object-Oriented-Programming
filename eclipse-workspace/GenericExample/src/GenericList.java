import java.util.ArrayList;
import java.util.Collections;

public class GenericList <T extends Comparable<T>>{
	public ArrayList<T> genList;
	
	public GenericList() {
		genList = new ArrayList<T>();
	}
	
	public GenericList(T[] arr) {
		this();
		for (T ele : arr) genList.add(ele);
	}
	
	public void addEle(T ele) {
		genList.add(ele);
	}
	
	public void sortGenericList() {
		Collections.sort(this.genList);
	}
	
	public String toString() {
		String re = "";
		
		for (T ele : genList) re += ele.toString();
		
		return re;
	}
}
