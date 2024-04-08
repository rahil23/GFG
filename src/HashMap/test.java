package HashMap;

public class test {
    public static void main(String[] args) {


        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>'A' && str.charAt(i)<'E')
            {
                System.out.print(str.charAt(i));
            }
            else if(str.charAt(i)>'E' && str.charAt(i)<'I')
            {
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
            }
            else  if(str.charAt(i)>'I' && str.charAt(i)<'O')
            {
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
            }
            else  if(str.charAt(i)>'O' && str.charAt(i)<'U')
            {
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
            }
            else   if(str.charAt(i)>'U')
            {
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(str.charAt(i));
            }



        }


      /*  public static void main (String[]args){
            String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String output = generateOutput(input);
            System.out.println(output);
        }

        public static String generateOutput (String input){
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                output.append(currentChar);
                if (currentChar != 'E' && currentChar != 'O') {
                    output.append(currentChar);
                }
            }

            return output.toString();
        }*/
    }
}





