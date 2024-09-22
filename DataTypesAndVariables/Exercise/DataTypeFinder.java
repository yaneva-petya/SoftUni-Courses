package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*• Integer -> if it is not floating point or string
        	Floating point -> '.'
        	Characters -> length == 1 and ascii<48 or ascii > 57
        	Boolean -> true or false
            Strings -> symbols and ascii<45 or ascii>57
         */
        String command=s.nextLine();
        while(!command.equals("END")){
            String type =" ";
            if(command.equalsIgnoreCase("true") || command.equalsIgnoreCase("false")) {
                type = "boolean";
            }
            else if(command.length()==1){
                // symbol
                // number
                char symbol=command.charAt(0);
                if(symbol<47 || symbol>58){
                    type="character";
                }
                else{
                    type="integer";
                }

            }
            else{//string, floating point, integer
                boolean isString = false;
                boolean isFloat=false;
                for(int i=0;i<command.length();i++){
                    char currentSymbol=command.charAt(i);
                    // checking is it a symbol
                    if(currentSymbol<45 | currentSymbol>57){
                        isString=true;
                    }

                    if(currentSymbol==46){
                        isFloat=true;
                    }
                }
                if(isString){
                    type="string";
                }
                else{
                    // number
                    if(isFloat){
                        type="floating point";
                    }
                    else {
                        type="integer";
                    }
                }
            }

            System.out.printf("%s is %s type%n", command, type);
            command=s.nextLine();
        }

    }
}
