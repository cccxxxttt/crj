public class Animal{
	private int weight;
	
	
	public int getWeight(){
	    return weight;
}


	public void setWeight(int w){
		weight=w;
	}
}
//本是同根生，相煎何太急。
/*你麻痹！！！*/

public class Cat extends Animal{
	public void miaow{
		
		System.out.println("喵喵！！！！");
	}
}


public 	class WhiteCat{
	private static cat whiteCat;
	public static void main(String[] agrs){
		whiteCat = new Cat;
		whiteCat.setWeight(500);
		System.out.println("白猫的重量："+whiteCat.getWeight()+"克");
		whiteCat.miaow();
	}
	
}

