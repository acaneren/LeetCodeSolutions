class Solution {
    public String toLowerCase(String s) {

        String new_str = "";

        for(int i=0; i <s.length(); i++){

            int ascii = s.charAt(i);

            if(ascii >= 65 && ascii <= 90){

                char lower_char = (char) (ascii + 32);

                new_str = new_str + lower_char;
            }
            else{
                new_str += s.charAt(i);
            }
        }
        return new_str;
    }
}