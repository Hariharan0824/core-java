class Forest{

static String forestName;
static String area;
static float size;
static int trees;
static byte noOfAnimals;

public static void Display1(){
	System.out.println("This is display method");
	System.out.println("This is forest Name:"+forestName);
	System.out.println("This is Area:"+area);
	System.out.println("This is Size Name:"+size);
	System.out.println("This is forest Trees:"+trees);
	System.out.println("This is forest Animals:"+noOfAnimals);
	
	
}

public static void SetValue(String fforestName,String farea,float fsize,int ftrees,byte fnoOfAnimals){
	forestName=fforestName;
	area=farea;
	size=fsize;
	trees=ftrees;
	noOfAnimals=fnoOfAnimals;
	System.out.println("This is setvalue Method");
}
public static void Display(){
	System.out.println("This is display method");
	System.out.println("This is forest Name:"+forestName);
	System.out.println("This is Area:"+area);
	System.out.println("This is Size Name:"+size);
	System.out.println("This is forest Trees:"+trees);
	System.out.println("This is forest Animals:"+noOfAnimals);
	
	
}
}