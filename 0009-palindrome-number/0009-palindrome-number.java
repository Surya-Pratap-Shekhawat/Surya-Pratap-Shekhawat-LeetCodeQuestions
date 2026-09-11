class Solution {
    public boolean isPalindrome(int x) {
        int flag = 1;
        int len = String.valueOf(x).length();
        String num = String.valueOf(x);
        for(int i = 0 ; i < len/2 ; i++){
            if(num.charAt(i) != num.charAt(len-1 - i)){
                flag = 0;
                return false;
            }
        }
        return true;
    }
}