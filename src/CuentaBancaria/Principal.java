
package CuentaBancaria;

public class Principal {
    public static void main(String[] args) {

        // Crea dos objetos de tipo CuentaBancaria., utilizando los dos construtores
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria("Damián", 86234.54);
        
        // Muestra la información inicial de las cuentas
        System.out.println(c1.toString());
        System.out.println(c2.mostrarInfo());
        
        // Realiza un depósito en una de ellas.
        c1.depositar(190);
        System.out.println("Actualización: "+c1.toString());
        
        // Intenta hacer dos retiradas: una con saldo suficiente y otra sin saldo suficiente.
        if(c1.retirar(100))
            System.out.println("Dinero retirado correctamente");
        else
            System.out.println("No se ha podidio realizar la operación");
        System.out.println("Actualización: "+c1.toString());
        
        double pasta = 300.54;
        if(c1.retirar(pasta))
            System.out.println("Dinero retirado correctamente");
        else
            System.out.println("No tienes "+pasta+"€ en el banco, trabaja más o gasta menos");
        System.out.println("Actualización: "+c1.toString());
        
    }

}