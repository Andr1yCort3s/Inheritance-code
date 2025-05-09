package Library;

import java.time.LocalDate;
import java.util.*;

public class Ejecutador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Administrador admin = new Administrador(1093594867, "Carter Montour", "cristal@gmail.com");

        while (true) {
            System.out.println("::::::::!Welcome to Smokeynas Library!::::::::");
            System.out.println("1.Clients  2.Books  3.Loan  4.Leave");
            int op = entrada.nextInt(); entrada.nextLine();

            if (op == 1) {
                ArrayList<Cliente> clientes = new ArrayList<>();
                do {
                    System.out.print("Client ID: ");
                    int id = entrada.nextInt();
                    System.out.print("Enter your name: ");
                    String nombre = entrada.next();
                    System.out.print("Enter your email: ");
                    String correo = entrada.next();
                    clientes.add(new Cliente(id, nombre, correo));
                    System.out.print("Would you like to add more? (s/n): ");
                } while (entrada.next().toLowerCase().charAt(0) == 's');
                admin.registrarCliente(clientes);

            } else if (op == 2) {
                ArrayList<Libro> libros = new ArrayList<>();
                do {
                    System.out.print("Book title: ");
                    String titulo = entrada.next();
                    System.out.print("Book author: ");
                    String autor = entrada.next();
                    System.out.print("Book ISBN: ");
                    String isbn = entrada.next();
                    System.out.print("Is the book available (true/false): ");
                    boolean disponible = entrada.nextBoolean();
                    libros.add(new Libro(titulo, autor, isbn, disponible));
                    entrada.nextLine();
                    System.out.print("Would you like to add more? (s/n): ");
                } while (entrada.next().toLowerCase().charAt(0) == 's');
                admin.registrarLibro(libros);

            } else if (op == 3) {
                Cliente c = new Cliente(1034538612, "Dehya", "Mikoska@gmail.com");
                Libro l = new Libro("asfawdfsa", "The Fragance of your hands", "Hoyoverse", true);
                LocalDate inicio = LocalDate.now();
                admin.realizarPrestamo(new Prestamo(inicio, inicio.plusDays(9), true, l, c));

            } else if (op == 4) {
                System.out.println("Thanks for visiting! Have a great day!");
                break;
            }
        }
    }
}
