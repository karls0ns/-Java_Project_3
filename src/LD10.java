import java.util.HashMap;

public class LD10 {

	static Object [] Street = {"Suns", new Human(), new Auto(), new Bus(), new Vehicle(), new Human(), new Bus()};
	
	public static void check1 (Object [] O){
		int V=0, A=0, B=0, H=0, U=0, i=0;
		
		while (i != O.length){
			if (O[i] instanceof Human){ 
				H++;				
			}
			else if(O[i] instanceof Auto){
				A++;
			}
			else if (O[i] instanceof Bus){
				B++;
			}
			else if (O[i] instanceof Vehicle){
				V++;
			}
			else {
				U++;
			}
			i++;
		}
		
	System.out.println("Intance of..");
	System.out.println("Human: " +H+ ", Auto: " +A+ ", Bus: " +B+ ", Vehicle: " +V+ " Unknown object: " +U);
	
	}	
	
	public static void check2(Object [] O){
		
		int V=0, A=0, B=0, H=0, U=0, i=0;
		
		while (i != O.length){
			if (Human.class.isInstance(O[i])){ 
				H++;				
			}
			else if(Auto.class.isInstance(O[i])){
				A++;
			}
			else if (Bus.class.isInstance(O[i])){
				B++;
			}
			else if (Vehicle.class.isInstance(O[i])){
				V++;
			}
			else {
				U++;
			}
			i++;
		}
		
	System.out.println("Is Intance..");
	System.out.println("Human: " +H+ ", Auto: " +A+ ", Bus: " +B+ ", Vehicle: " +V+ " Unknown object: " +U);
	
		
		
	}
	
	public static void check3(Object [] O){
		HashMap<String, Integer> Result = new HashMap<String, Integer>();
		int i = 0, value;
		
		while (i != O.length){
			String key = O[i].getClass().getName();
			if(Result.containsKey(key)){
				value = Result.get(key);
				Result.put(key, value+1);
			}
			else {
				Result.put(key, 1);
			}
			i++;
		}
		System.out.println("HashMap + Get Class..");
		System.out.println(Result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		check1 (Street);
		check2 (Street);
		check3(Street);
		
	}

}
