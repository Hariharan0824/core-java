class Festival{

static String name;
static byte date;
static String food;
static String cloths;
static String typeOfFestivel;

public static void Display1(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+date);
	System.out.println("This is Color:"+food);
	System.out.println("This is Brand:"+cloths);
	System.out.println("This is Size:"+typeOfFestivel);
	
	
	
}

public static void SetValue(String fname,byte fdate,String ffood,String fcloths,String ftypeOfFestivel){
	
	name=fname;
	date=fdate;
	food=ffood;
	cloths=fcloths;
	typeOfFestivel=ftypeOfFestivel;
	System.out.println("This is Bags SetValue");
	
}

public static void Display(){
	System.out.println("This is Display method");
	System.out.println("This is Name:"+name);
	System.out.println("This is No of Bags:"+date);
	System.out.println("This is Color:"+food);
	System.out.println("This is Brand:"+cloths);
	System.out.println("This is Size:"+typeOfFestivel);
	
	
	
}

}