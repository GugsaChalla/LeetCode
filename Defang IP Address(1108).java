class Solution {
    public String defangIPaddr(String address) {
        StringBuilder adr = new StringBuilder();
        
        for(int i =0; i <address.length(); i++) {
        	if( address.charAt(i) == '.'){
                adr.append("[.]");
            }
        		
        	else{
                adr.append(address.charAt(i));
            }
        		
        }
        return adr.toString();
    }
}
