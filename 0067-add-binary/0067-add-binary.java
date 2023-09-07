class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int aL = a.length()-1;
        int bL = b.length()-1;

        int carry =0;
        while(carry==1 || aL>=0 || bL>=0 ){
            if(aL>=0){
                carry+=a.charAt(aL--)-'0';
            }
            if(bL>=0){
                carry+=b.charAt(bL--)-'0';
            }
            str.append(carry%2);
            carry= carry/2;

        }

        return str.reverse().toString();
    }
}