import java.util.ArrayList;

class IntClass{
	private int myValue;
	public IntClass(int myValue){
		this.myValue  = myValue;
	}
	public int getMyValue() {
		return myValue;
	}
	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
}
public class AutoboxingUnboxing {
	
	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayLIst = new ArrayList<String>();
		strArrayLIst.add("Abe");
		
		//ArrayList<int> intArrayList = new ArrayList<int>();
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(50));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++){
			intArrayList.add(Integer.valueOf(i));
			//System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		System.out.println("- - INTEGER - -");
		for(int i = 0; i <= 10; i++){
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		
		Integer myIntValue = 56; // Intger.valueOf(56);
		int myInt = myIntValue.intValue();// myIntValue.intValue()
		System.out.println("- - DOUBLE - -");
		ArrayList<Double> myDoubleValue = new ArrayList<Double>();
		for(double dbl = 0.0; dbl <= 10.0; dbl +=0.5){
			myDoubleValue.add(dbl);
		}
		
		for (int i = 0; i < myDoubleValue.size(); i++) {
			double value = myDoubleValue.get(i);
			System.out.println(i +" --> " + value);
		}
	}

}
