import javax.sound.midi.MidiChannel;
import java.util.*;

public class L875 {
    public static void main(String[] args) {
        int [] piles = {1,2,3,4};
        minEatingSpeed(piles,8);
    }
    static  int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end=100000;
        int ans=0;
        
        while(start<=end){
            int mid = start+end/2;
            int hour=0;
            for(int i =0 ; i<piles.length;i++){
                hour += Math.ceil(1.0*piles[i]/mid);
            }
            if(hour>h){
                start=ans+1;
            }
            else{
                end=ans-1;
            }
            
        }
      return start;
       
    }
    static int max(int[] piles, int max){
        
        for(int i=0;i<piles.length;i++){
            if(piles[i]>=max){
                max=piles[i];
            }
            else {
                return max;
            }
        }
        return max;
    }
}
