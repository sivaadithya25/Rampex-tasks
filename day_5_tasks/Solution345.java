class Solution {
    public String reverseVowels(String s) {
        char []arr=s.toCharArray();
        int st=0;
        int end=arr.length-1;
        while(st<end){
            if("aeiouAEIOU".indexOf(arr[st])==-1) st++;
            else if("aeiuoAEIOU".indexOf(arr[end])==-1) end--;
            else{

         char temp= arr[st];
         arr[st]=arr[end];
         arr[end]=temp;
         st++;
         end--;

        }
    }
    return new String(arr);
}}
