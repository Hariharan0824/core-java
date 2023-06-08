class Hairs{

static String colors;
static byte numbers;
static String thickness;
static String width;
static float area;

public static void Display1(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+colors);
	System.out.println("This is No of Bags:"+numbers);
	System.out.println("This is Color:"+thickness);
	System.out.println("This is Brand:"+width);
	System.out.println("This is Size:"+area);
	
	
	
}

public static void SetValue(String fcolors,byte fnumbers,String fthickness,String fwidth,float farea){
	
	colors=fcolors;
	numbers=fnumbers;
	thickness=fthickness;
	width=fwidth;
	area=farea;
	System.out.println("This is Bags SetValue");
	
}

public static void Display(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+colors);
	System.out.println("This is No of Bags:"+numbers);
	System.out.println("This is Color:"+thickness);
	System.out.println("This is Brand:"+width);
	System.out.println("This is Size:"+area);
	
	
	
}

}