package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        double sumThatIHave=0.0;

        while(!input.equals("Start")){
            double money=Double.parseDouble(input);
            if(money==0.1 || money==0.2 || money==0.5 || money==1 || money==2){
                sumThatIHave+=money;
            }
            else{
               System.out.printf("Cannot accept %.2f%n", money);
            }
            input=s.nextLine();
        }

        String wantedProducts=s.nextLine();

        while(!wantedProducts.equals("End")){
            switch (wantedProducts){
                case "Nuts"->{
                    if(sumThatIHave>=2.0){
                        System.out.printf("Purchased %s%n", wantedProducts);
                    sumThatIHave-=2.0;
                    break;}
                    else{System.out.printf("Sorry, not enough money%n");}
                }
                case "Water"->{
                    if(sumThatIHave>=0.7){
                        System.out.printf("Purchased %s%n", wantedProducts);
                        sumThatIHave-=0.7;
                         break;}
                    else{System.out.printf("Sorry, not enough money%n");}
                }
                case "Crisps"->{
                    if(sumThatIHave>=1.5){
                        System.out.printf("Purchased %s%n", wantedProducts);
                        sumThatIHave-=1.5;
                        break;
                    }
                    else{System.out.printf("Sorry, not enough money%n");}
                }
                case "Soda"->{
                    if(sumThatIHave>=0.8)
                    {System.out.printf("Purchased %s%n", wantedProducts);
                        sumThatIHave-=0.8;
                        break;
                    }
                    else{System.out.printf("Sorry, not enough money%n");}
                }
                case "Coke"->{
                    if(sumThatIHave>=1.0){
                        System.out.printf("Purchased %s%n", wantedProducts);
                        sumThatIHave-=1.0;
                        break;
                    }
                    else{System.out.printf("Sorry, not enough money%n");}
                }
                default -> {System.out.println("Invalid product"); break;}
            }

            wantedProducts=s.nextLine();
        }

        System.out.printf("Change: %.2f%n", sumThatIHave);

    }
}

