class Solution {
    public int maximum69Number (int num) {
        int count =1;
        int spot=0;
        int res=num;
        while(num>0){
            if(num%10==6){
                spot=count;
            }
            num=num/10;
            count++;
        }
        if(spot==1){
            return res+3;
        }
        if(spot==2){
            return res+30;
        }
        if(spot==3){
            return res+300;
        }
        if(spot==4){
            return res+3000;
        }
        return res;
    }
}