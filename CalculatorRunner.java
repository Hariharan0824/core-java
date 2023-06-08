class CalculatorRunner{
//Addition
public static void main(String args[]){
int sumOfTwoNumbers=Calculator.add(20,30);
System.out.println("Sum is:"+sumOfTwoNumbers);
int sumOfThreeNumbers=Calculator.add(20,30,40);
System.out.println("Sum is:"+sumOfThreeNumbers);
int sumOfFourNumbers=Calculator.add(20,30,40,50);
System.out.println("Sum is:"+sumOfFourNumbers);

//Subtraction

int minusfTwoNumbers=Calculator.sub(30,20);
System.out.println("Minus is:"+minusfTwoNumbers);
int minusOfThreeNumbers=Calculator.sub(60,50,40);
System.out.println("Minus is:"+minusOfThreeNumbers);
int minusOfFourNumbers=Calculator.sub(70,60,50,40);
System.out.println("Minus is:"+minusOfFourNumbers);

//Multiplication
int productionOfTwoNumbers=Calculator.mul(20,30);
System.out.println("Multiplication is:"+productionOfTwoNumbers);
int productionOfThreeNumbers=Calculator.mul(20,30,40);
System.out.println("Multiplication is:"+productionOfThreeNumbers);
int productionOfFourNumbers=Calculator.mul(20,30,40,50);
System.out.println("Multiplication is:"+productionOfFourNumbers);

//Divison

int divisionOfTwoNumbers=Calculator.div(20,30);
System.out.println("Sum is:"+divisionOfTwoNumbers);
int divisionOfThreeNumbers=Calculator.div(20,30,40);
System.out.println("Sum is:"+divisionOfThreeNumbers);
int divisionOfFourNumbers=Calculator.div(20,30,40,50);
System.out.println("Sum is:"+divisionOfFourNumbers);
}
}
