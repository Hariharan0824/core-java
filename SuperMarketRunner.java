class SuperMarketRunner{

public static void main(String args[]){
	
	String things[]={"Rice","oil","Masala Powders","Sugar","Sweets"};
	SuperMarket.item(things);
	int price[]={500, 600, 700, 800, 900};
	/*SuperMarket.item(things,price,true);*/
	String companyName[]={"Dmart","Sunrise","jio","Realince","Diamond"};
	/*SuperMarket.item(companyName);*/
		SuperMarket.item(things,price,true,companyName);
}
}
