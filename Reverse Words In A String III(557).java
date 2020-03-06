class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>-1;j--){
                str.append(arr[i].charAt(j));
            }
            if(i==arr.length-1){break;}
            str.append(" ");
        }
        return str.toString();
    }
}