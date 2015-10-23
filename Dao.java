public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	double x = reader.nextDouble();
	double y;
	if(x<0) y = 1 + 2 * x;
	else if(x==0) y = -1;
	else y = -1 + 3 * x;
}