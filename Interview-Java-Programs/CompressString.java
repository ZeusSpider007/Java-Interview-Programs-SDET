public class CompressString {

    public String compressString(String input){

      String finalinput =   input.toLowerCase();

      char[] chars =  finalinput.toCharArray();
      String result = "";
      int count = 0;
      char prev = chars[0];

        for(char c : chars){

            if(c==prev){

                count++;
            }
            else{
            result = result+prev+Integer.toString(count);
            prev = c;
            count = 1;

            }


        }
         result = result+prev+Integer.toString(count);
         
        return result;




    }

    public static void main(String[] args) {

        CompressString cs = new CompressString();
        String result = cs.compressString("Naayyy");
        System.out.println(result);

    }
}
