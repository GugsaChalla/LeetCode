class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean add=true;
        for(int i=left;i<=right;i++){
            int num=i;
            while(num>0){
                if(num%10==0){
                   add=false;
                    break; 
                }
                if(i%(num%10)!=0){
                    add=false;
                    break;
                }
                num=num/10;
                add=true;
            }
            if(add==true){
                list.add(i);
            }
            
        }
        return list;
    }
}
