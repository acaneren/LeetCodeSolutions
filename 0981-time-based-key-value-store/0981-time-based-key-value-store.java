import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {

	private Map<String, ArrayList<Object[]>> store;
	
    public TimeMap() {
    	store = new HashMap<String, ArrayList<Object[]>>();
    }
    
    public void set(String key, String value, int timestamp) {
        
    	if(!store.containsKey(key)) {
    		store.put(key, new ArrayList<Object[]>());
    		store.get(key).add(new Object[] {timestamp, value});
    	}
    	else {
    		store.get(key).add(new Object[] {timestamp, value});
    	}
    }
    
    public String get(String key, int timestamp) {
    	
    	if(!store.containsKey(key)) {
    		return "";
    	}
    	
    	List<Object[]> valuesList = store.get(key);
    	
    	int left = 0;
    	int right = valuesList.size() - 1;
    	
    	while(left <= right) {
    		
    		int mid = (left + right) / 2 ;
    		
    		int mid_timestamp = (int)valuesList.get(mid)[0];
    		String mid_value = String.valueOf(valuesList.get(mid)[1]);
    		
    		if(mid_timestamp == timestamp) {
    			return mid_value;
    		}
    		else if (mid_timestamp < timestamp){
    			left = mid + 1;
    		}
    		else {
    			right = mid - 1;
    		}
    	}	
		if(right >= 0) {
			return String.valueOf(valuesList.get(right)[1]);
		}
		return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */