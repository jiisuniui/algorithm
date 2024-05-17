import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int start=-1;
        int end=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                if(start==-1){
                    start = i;
                }else{
                    end = i;
                }
            }
        }
        
        if(start==-1){
            answer = new int[1];
            answer[0] = -1;
        }else if(end==-1){
            answer = new int[1];
            answer[0] = 2;
        }else{
            answer = new int[end-start+1];
            for(int i=start; i<=end; i++){
                answer[i-start] = arr[i]; 
            }
        }
        
        return answer;
    }
}