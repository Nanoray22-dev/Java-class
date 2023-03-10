import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
    int cont;
    Double consume, total, desc;
    total = 0.0;
    Scanner input = new Scanner(System.in);
        for(cont = 1 ; cont < 11; cont++){
        System.out.print("Enter Consume Number: " + cont + ":");
        consume = Double.valueOf(input.next());
        total = total + consume;
    }
        if (total > 50){
        desc = total * 0.07;
    }else{
        desc = 0.0;
    }

        System.out.println("consume Total: " + total);
        System.out.println("DESCUENTO: " + desc);
        System.out.println("PAGO TOTAL: " + (total - desc));
        System.out.println("THANKS FOR SHOPP, COME BACK!!!");
}
}
