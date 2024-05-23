import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        List<String> arr = new ArrayList<>();
        for(String str:strArr){
            if(!str.contains("ad")){
                arr.add(str);
            }
        }
        
        answer = new String[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}