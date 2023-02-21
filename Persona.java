public class Persona {
	
	private int Age;
	private String Gender;
	
	public Persona (int a,String g) {
		Age = a;
		Gender = g;
	}

	public int getAge() {
		return Age;
	}

	public String getGender() {
		return Gender;
	}

	 @Override
	    public String toString() {
	        return Gender + ", " + Age;
	    }
	

}
