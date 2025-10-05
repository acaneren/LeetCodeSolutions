import java.util.ArrayList;
import java.util.List;

class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> second_half = new ArrayList<>();

        int counter = 0;
        for(int i=1; i * i <= n; i++){
            if(n % i == 0){
                counter++;
                if(counter == k){
                    return i;
                }
                if(i != n/i){
                    second_half.add(0,n/i);
                }
            }
        }

        int index = k - counter - 1;
        if(index >= 0 && index < second_half.size()){
            return second_half.get(index);
        }
        return -1;
    }
}