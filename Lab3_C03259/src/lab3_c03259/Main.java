
package lab3_c03259;
import logic.*;
/**
 *
 * @author alvin
 */
public class Main {
     public static void main(String[] args) {
     
         //creacion de clientes
         Client c1 = new Client("Alvin", "1", "8888-9999", "Limon, Costa Rica");
         Client c2 = new Client("Taily", "2", "9999-1010", "Cartago, Costa Rica");
         
         //Creacion de cuentas
         SavingAccount sa = new SavingAccount("CR0555", 1000, c1, "16-09-2025", 6, 0.05);
         CheckingAccount ca = new CheckingAccount("CR0111", 2000, c2, 0.03);

        // Probar depósitos y retiros
        sa.deposit(500);          // Alvin deposita
        ca.withdraw(300);         // María retira

        // Calcular intereses
        sa.calculateInterest();
        ca.calculateInterest();

        // Crear banco y probar transferencia (simulación de SINPE
        Bank banco = new Bank("Banco de Costa Rica");
        banco.transfer(sa, ca, 200);

        // Crear bitácora de eventos
        Log log1 = new Log("Deposit", sa);
        Log log2 = new Log("Withdrawal", ca);
        Log log3 = new Log("Transfer", sa);

        // Mostrar resultados
        System.out.println("\n------- CLIENTES --------");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("\n------ CUENTAS -------");
        System.out.println(sa);
        System.out.println(ca);

        System.out.println("\n------- BANCO -------");
        System.out.println(banco);

        System.out.println("\n------- BITACORA -------");
        System.out.println(log1);
        System.out.println(log2);
        System.out.println(log3);
     }
}
