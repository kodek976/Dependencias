

package CartaRenuncia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1º Recogemos la información que vamos a sustituir 
        System.out.println("Empresa:");
        String empresa = sc.nextLine();
        System.out.println("rrhh:");
        String rrhh = sc.nextLine();
        System.out.println("Departamento:");
        String departamento = sc.nextLine();
        System.out.println("Cargo:");
        String cargo = sc.nextLine();
        System.out.println("Fecha de contratación:");
        String fecha1 = sc.nextLine();
        System.out.println("Fecha de abandono:");
        String fecha2 = sc.nextLine();
        System.out.println("Motivo:");
        String motivo = sc.nextLine();
        System.out.println("Jefe:");
        String jefe = sc.nextLine();
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Apellido:");
        String apellido = sc.nextLine();
        
        //2ºLeemos el archivo y lo sustituimos por los datos que queremos
        try (BufferedReader br = new BufferedReader(new FileReader("carta.txt"))){
            String linea= null;
            while ((linea = br.readLine()) != null) {
                linea= linea.replace("$empresa", empresa);
                linea= linea.replace("$rrhh", rrhh);
                linea= linea.replace("$departamento", departamento);
                linea= linea.replace("$cargo", cargo);
                linea= linea.replace("$fecha1", fecha1);
                linea= linea.replace("$fecha2", fecha2);
                linea= linea.replace("$motivo", motivo);
                linea= linea.replace("$jefe", jefe);
                linea= linea.replace("$nombre", nombre);
                linea= linea.replace("$apellido", apellido);
                System.out.println(linea);
            }
        } catch (Exception e) {
        }
        //3ºLo pasamos a cartafinal.txt
        try (BufferedReader br = new BufferedReader(new FileReader("carta.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("cartafinal.txt"))){
                 String linea = null;
                while ((linea = br.readLine())!= null) {
                linea= linea.replace("$empresa", empresa);
                linea= linea.replace("$rrhh", rrhh);
                linea= linea.replace("$departamento", departamento);
                linea= linea.replace("$cargo", cargo);
                linea= linea.replace("$fecha1", fecha1);
                linea= linea.replace("$fecha2", fecha2);
                linea= linea.replace("$motivo", motivo);
                linea= linea.replace("$jefe", jefe);
                linea= linea.replace("$nombre", nombre);
                linea= linea.replace("$apellido", apellido);
                pw.println(linea);
            }
                
        } catch (Exception e) {
        }
    }
}
