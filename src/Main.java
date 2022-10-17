import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner sc = new Scanner (System.in);
        Programador progamador1 = new Programador();

        /* Input*/
        System.out.println("Escriba el nombre del programador");
        String lineaNombre = sc.nextLine();//  TODO:  revisar lectura de ints como chars
        progamador1.nombre = lineaNombre;

        System.out.println("¿En que lenguaje programa?");
        progamador1.lenguaje = sc.nextLine();// aquí hago lo mismo que antes pero ahorrandome una linea y una variable

        /* Output*/
        /*System.out.println("El programador se llama " + progamador1.nombre);
        System.out.println("y programa en " + progamador1.lenguaje);*/

        System.out.println(programador.aLinea());







        /**/
    }
}