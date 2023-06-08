class River{

static String name;
static String place;
static String typeOfRiver;
static float length;
static String state;

public static void Display1(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+place);
	System.out.println("This is Color:"+typeOfRiver);
	System.out.println("This is Brand:"+length);
	System.out.println("This is Size:"+state);
	
	
	
}

public static void SetValue(String fname,String fplace,String ftypeOfRiver,float flength,String fstate){
	
	name=fname;
	place=fplace;
	typeOfRiver=ftypeOfRiver;
	length=flength;
	state=fstate;
	System.out.println("This is Bags SetValue");
	
}

public static void Display(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+place);
	System.out.println("This is Color:"+typeOfRiver);
	System.out.println("This is Brand:"+length);
	System.out.println("This is Size:"+state);
	
	
	
}



}