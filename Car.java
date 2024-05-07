
public class Car extends Vehicle{
	
	private int numDoor;
	private int numStudent;
	
	public Car(String aMake, String aModel, String aPlate,int doors, int passengers) {
		super(aMake,aModel,aPlate);
		this.numDoor=doors;
		this.numStudent=passengers;
	}
	
	public int getDoor() {
		return this.numDoor;
	}
	
	public int getStudent() {
		return this.numStudent;
	}
	
	
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.",this.numDoor, getMake(), getModel(), getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherVec = (Car) other;
		
		if((this.numDoor==otherVec.numDoor)&&(this.numStudent==otherVec.numStudent)) {
		
			return super.equals(otherVec);
			
			
		}
		
		return false;
	}
	
	
	public Car copy() {  

		String make=getMake();
		String model=getModel();
		String plate=getPlate();
		int pass=this.numStudent;
		int door=this.numDoor;
		Car theCopy= new Car(make,model,plate,door,pass);  

		return theCopy;  

	}  
	

}

