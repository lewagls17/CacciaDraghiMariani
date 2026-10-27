import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("Inserisci il numero di battiti di ali: ");
        int battiti = inTastiera.nextInt();

        Drago mioDragoTask = new Drago(battiti, "Spartaco");
        Thread drago1 = new Thread(mioDragoTask);

        drago1.start();

        Cacciatore cacciatore = new Cacciatore("Geralt");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cacciatore.colpisciDrago(drago1);

        inTastiera.close();
    }
}