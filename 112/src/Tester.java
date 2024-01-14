import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("請問想在哪裡用餐？輸入（校內/校外）");
    	String location = sc.next();
    	System.out.println("請問預算多少元？");
    	int budget = sc.nextInt();
    	System.out.println("請問想用甚麼類型的餐點呢？輸入（飲料/餐盒/正餐）");
    	String type = sc.next();


    	if(type.equals("飲料")) {


    	}else if(type.equals("餐盒")) {
    		
    	}else if(type.equals("正餐")) {
    		
    		
    	}


    	sc.close();
    }
}