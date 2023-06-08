class Bags{

static String name;
static byte noOfBags;
static String color;
static String brand;
static float size;

public static void Display1(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+noOfBags);
	System.out.println("This is Color:"+color);
	System.out.println("This is Brand:"+brand);
	System.out.println("This is Size:"+size);
	
	
	
}

public static void SetValue(String fname,byte fnoOfBags,String fcolor,String fbrand,float fsize){
	
	name=fname;
	noOfBags=fnoOfBags;
	color=fcolor;
	brand=fbrand;
	size=fsize;
	System.out.println("This is Bags SetValue");
	
}

public static void Display(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+noOfBags);
	System.out.println("This is Color:"+color);
	System.out.println("This is Brand:"+brand);
	System.out.println("This is Size:"+size);
	
	
	
}


}