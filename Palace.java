class Palace{

static String name;
static String location;
static String states;
static String area;
static byte noOfRooms;

public static void Display1(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+location);
	System.out.println("This is Color:"+states);
	System.out.println("This is Brand:"+area);
	System.out.println("This is Size:"+noOfRooms);
	
	
	
}

public static void SetValue(String fname,String flocation,String fstates,String farea,byte fnoOfRooms){
	
	name=fname;
	location=flocation;
	states=fstates;
	area=farea;
	noOfRooms=fnoOfRooms;
	System.out.println("This is Bags SetValue");
	
}

public static void Display(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+location);
	System.out.println("This is Color:"+states);
	System.out.println("This is Brand:"+area);
	System.out.println("This is Size:"+noOfRooms);
	
	
	
}


}