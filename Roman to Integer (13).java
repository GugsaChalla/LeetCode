class Solution {
    public int romanToInt(String s) {
        int sum =0;
        int prev =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='M'){
                if(prev==100) sum+=800;
                else sum+=1000;
                prev=1000;
            }
            if(s.charAt(i)=='D'){
                if(prev==100) sum+=300;
                else sum+=500;
                prev=500;
            }
             if(s.charAt(i)=='C'){
                if(prev==10) sum+=80;
                else sum+=100;
                prev=100;
            }
            
            if(s.charAt(i)=='L'){
                if(prev==10) sum+=30;
                else sum+=50;
                prev=50;
            }
            if(s.charAt(i)=='X'){
                if(prev==1) sum+=8;
                else sum+=10;
                prev=10;
            }
            if(s.charAt(i)=='V'){
                if(prev==1) sum+=3;
                else sum+=5;
                prev=5;
            }
            if(s.charAt(i)=='I'){
                prev=1;
                sum+=1;
            }
           
        }
        return sum;
    }
}