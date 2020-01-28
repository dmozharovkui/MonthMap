package jen;

import java.util.TreeMap;

public class Month {
		private TreeMap<String, String> monthMap;

	
		public Month() {
			super();
		}

		public Month(TreeMap<String, String> monthMap) {
			
			this.monthMap = monthMap;
		}

		public TreeMap<String, String> getMonthMap() {
			return monthMap;
		}

		public void setMonthMap(TreeMap<String, String> monthMap) {
			this.monthMap = monthMap;
		}

		public TreeMap<String,String> addMonth(String month,String value) {
			monthMap.put(month,value);
			return monthMap;
		}

		@Override
		public String toString() {
			return "Month [monthMap=" + monthMap + "]";
		}

		
}
