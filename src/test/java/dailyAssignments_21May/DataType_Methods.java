package dailyAssignments_21May;

public class DataType_Methods {
	
	public int getInt(int number) {		
		return number;		 
	}
	
	public double getDouble(double number) {
		return number;
	}
	
	public String getString (String value) {
		return value;
	}

	public Boolean getBoolean (Boolean value) {
		return value;
	}
public static void main(String [] args) {
	
	DataType_Methods d = new DataType_Methods();
int number = d.getInt(10);
System.out.println("Int number " + number);

double dou = d.getDouble(99.99);
System.out.println("Dobule number "+ dou);

String str = d.getString("Sri");
System.out.println("String value is "+ str);

Boolean bb = d.getBoolean(true);
System.out.println("Boolean value is "+ bb);
	
}

}
