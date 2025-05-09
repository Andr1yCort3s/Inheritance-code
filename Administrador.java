package Library;

import java.util.ArrayList;

public class Administrador extends Account {
    private final ArrayList<Libro> libros = new ArrayList<>();
    private final ArrayList<Cliente> clientes = new ArrayList<>();
    private final ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void registrarCliente(ArrayList<Cliente> nuevos) {
        for (Cliente c : nuevos) {
            clientes.add(c);
            System.out.println("Cliente registrado: ID " + c.getId() + ", Nombre: " + c.getNombre() +
                    ", Correo: " + c.getCorreo());
        }
    }

    public void registrarLibro(ArrayList<Libro> nuevos) {
        for (Libro l : nuevos) {
            libros.add(l);
            System.out.println("Libro registrado: ISBN " + l.getIsbn() + ", Título: " + l.getTitulo() +
                    ", Autor: " + l.getAutor() + ", Disponible: " + l.isDisponible());
        }
    }

    public void realizarPrestamo(Prestamo p) {
        prestamos.add(p);
        System.out.println("Préstamo realizado - Fecha inicio: " + p.getFechaInicio() +
                ", Fecha devolución: " + p.getFechaDevolucion() + ", Estado: " + p.getEstado());
    }
}
