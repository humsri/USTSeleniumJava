package dailyAssignment_25May;

public class RectangleClass {
	
	private int length;
	private int width;
	
	//setter
	
	public void setLength(int length1) {
		this.length = length1;
	}
	
	public void setWidth(int width1) {
		this.width = width1;
	}
		//Getter
	
	public int getLength() {
		return length;
	}

	 public int getWidth() {
		 return width;
	 }
	
	public static void main(String[] args) {
		
		RectangleClass rc = new RectangleClass();
		
		//Setting values
		rc.setLength(10);
		rc.setWidth(5);

		//Getting values
		System.out.println("Length = " + rc.getLength());
		System.out.println("Width = " + rc.getWidth());
	}

}
