package SwapNumbers;

public class ThirdVariable {
    public ThirdVariable(int num1 , int num2){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First Num : " +num1 +" || " +"Second Num : " +num2);
    }
}
