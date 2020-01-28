package jen;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<String, String> monthMap1 =new TreeMap<String, String>();
		TreeMap<String, String> monthMap2 =new TreeMap<String, String>();
		TreeMap<String, String> monthMap3 =new TreeMap<String, String>();
		Month month1 = new Month(monthMap1);
		month1.addMonth("January","Num1");
		month1.addMonth("February","Num2");
		month1.addMonth("March","Num3");
		month1.addMonth("April","Num4");
		month1.addMonth("May","Num5");
		month1.addMonth("June","Num6");
		month1.addMonth("July","Num7");
		month1.addMonth("August","Num8");
		month1.addMonth("September","Num9");
		month1.addMonth("October","Num0");
		month1.addMonth("November","Num1");
		month1.addMonth("December","Num2");
		Month month2 = new Month(monthMap2);
		month2.addMonth("January","Num3");
		month2.addMonth("February","Num4");
		month2.addMonth("March","Num5");
		month2.addMonth("April","Num6");
		month2.addMonth("May","Num7");
		month2.addMonth("June","Num8");
		month2.addMonth("July","Num9");
		month2.addMonth("August","Num0");
		month2.addMonth("September","Num1");
		month2.addMonth("October","Num2");
		month2.addMonth("November","Num3");
		month2.addMonth("December","Num4");
		Month month3 = new Month(monthMap3);
		month3.addMonth("January","Num5");
		month3.addMonth("February","Num6");
		month3.addMonth("March","Num7");
		month3.addMonth("April","Num8");
		month3.addMonth("May","Num9");
		month3.addMonth("June","Num0");
		month3.addMonth("July","Num1");
		month3.addMonth("August","Num2");
		month3.addMonth("September","Num3");
		month3.addMonth("October","Num4");
		month3.addMonth("November","Num5");
		month3.addMonth("December","Num6");
		TreeMap<String, TreeMap> productMap1 =new TreeMap<String,TreeMap>();
        Products product = new Products(productMap1);
        product.addProductMap("Product1", month1.getMonthMap());
        product.addProductMap("Product2", month2.getMonthMap());
        product.addProductMap("Product3", month3.getMonthMap());
        String result = product.find("Product3","January");
        System.out.println( result);
        
	}
}

