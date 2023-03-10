import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main3 {
    public static void main(String[] args) throws IOException {

        System.out.println("Type tbe firstNumber: ");
        Integer Number1 = loadNumber();

        System.out.println("Type tbe secondNumber: ");
        Integer Number2 = loadNumber();

        System.out.println("Type tbe secondNumber: ");
        Integer Number3 = loadNumber();

        calculateBigNumber(Number1, Number2, Number3);
        calculateSmallNumber(Number1, Number2, Number3);
    }

    private static  Integer loadNumber() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String StrNumber = buffer.readLine();
        Integer Number = Integer.parseInt(StrNumber);
        return Number;
    }


    /**
     *
     * @param Number1
     * @param Number2
     * @param Number3
     */

    private static void calculateBigNumber(Integer Number1, Integer Number2, Integer Number3 ){
        Integer bigNumber = Number1;

        if(Number2 > bigNumber){
            bigNumber = Number2;
        }
        if(Number3 > bigNumber ){
            bigNumber = Number3;
        }
        System.out.println("The big number Is: " + bigNumber);


    }
    private static void calculateSmallNumber(Integer Number1, Integer Number2, Integer Number3 ){
        Integer smallNumber = Number1;

        if(Number2 < smallNumber){
            smallNumber = Number2;
        }
        if(Number3 < smallNumber ){
            smallNumber = Number3;
        }
        System.out.println("The small number Is: " + smallNumber);
    }


}
