import java.util.Scanner;

public class Practice3_Test {

    public class Main {
        public static void main(String[] args) {
            boolean press = false;
            Scanner input = new Scanner(System.in);
            Practice3_StopWhatch watch = new Practice3_StopWhatch();

            watch.starTime();

            watch.start();

            while (true){
                if( press == true) break;
                else press = input.nextBoolean();
            }

            watch.stop();

            System.out.println(watch.getElapsedTime());
        }
    }
}
