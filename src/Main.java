
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] t =getIndexes("E2");
		System.out.println(t[0]+""+t[1]);

	}
	
	
	public static int[] getIndexes(String userInput){
		int[] out ={-1,-1}; 
		if (userInput.length()==2) {
			out[0] = Xcoord.valueOf(userInput.substring(0, 1).toUpperCase()).index();
			out[1] = Ycoord.valueOf("Y"+userInput.substring(1, 2).toUpperCase()).index();
		}
		else {
			throw new IllegalArgumentException(userInput+" is not a valid input");
		}
		return out;
	}
	

}
