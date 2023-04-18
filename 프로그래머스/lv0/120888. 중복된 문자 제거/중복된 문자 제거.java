import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            set.add(String.valueOf(my_string.charAt(i)));
        }
        
        String answer = "";
        
        Iterator iter = set.iterator();
		while(iter.hasNext())
			answer += iter.next();
        
        return answer;
    }
}