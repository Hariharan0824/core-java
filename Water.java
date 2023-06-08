class Water{

public static void drink(){
	
System.out.println("This is drink");	
	
}
public static void wash(){
drink();	
System.out.println("This is wash");	
	
}
public static void bath(){
wash();
drink();
System.out.println("This is bath");	
	
}


}