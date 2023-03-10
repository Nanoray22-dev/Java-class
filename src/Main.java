import java.util.Scanner;
public class Main {
    public static void main(String[] args){
             String sexo;
             int edad;
             Double costo = 0.0;
             Scanner input= new Scanner(System.in);
             System.out.println("Enter your sex");
              sexo = input.next();
              System.out.println("Enter your age");
              edad = Integer.parseInt(input.next());
              switch(sexo){
            case "H":
                if(edad < 25){
                    costo  = 100.0;
                }else{
                    costo = 70.0;
                }
                break;
                  case "M":
                      if (edad < 21){
                          costo = 50.0;
                      }
                      break;
        }

        System.out.println("EDAD :" + edad);
        System.out.println("Sexo :" + sexo);
        System.out.println("COSTO :" + costo);
        System.out.println("Thank u for buy a ticket");



    }
}