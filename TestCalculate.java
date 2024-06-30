import java.util.List;
import java.util.ArrayList;


public class TestCalculate{

    public static void main(String[] args) {
        TestCalculate test = new TestCalculate();
        test.testMultiplication();
    }

    
    public void testMultiplication() {

  
        List <Float> numbers = new ArrayList<>();
        numbers.add(5f);
        numbers.add(10f);

        List <String> operations = new ArrayList<>();
        operations.add("*");


        Calculator.Calculate(numbers, operations);

        if (Calculator.finalResult == 50f){

            System.out.println("Test uspesan");
        }
         else {
        System.out.println("Test neuspesan");
    }

    

    }
        
} 