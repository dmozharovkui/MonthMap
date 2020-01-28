package jen;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Products {
		
		private TreeMap <String,TreeMap> productMap;
		
		public Products() {
			super();
		}

		public Products(TreeMap<String, TreeMap> productMap) {
			super();
			this.productMap = productMap;
		}

		public TreeMap<String,TreeMap> addProductMap(String productName,TreeMap<String,String> monthMap){
			productMap.put(productName, monthMap);
			return productMap;
		}
			
		public String find(String nameProduct,String month) {
			for(Entry<String, TreeMap> m: productMap.entrySet()) {
				if(m.getKey().equals(nameProduct)) {
					TreeMap<String, String> monthValue = m.getValue();
					for(Entry<String, String> mon: monthValue.entrySet()) {
	        			if(mon.getKey().equals(month)) {
	        				return mon.getValue() ;
	        			}
				}
			}		
		 }
			return "";
		}
		
		@Override
		public String toString() {
			return "Products [productMap=" + productMap + "]";
		}
		
		
		
		

		
		
}
