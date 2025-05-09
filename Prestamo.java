package Library;
import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private boolean estado;
    private Libro libro;
    private Account account;

    public Prestamo(LocalDate fechaInicio, LocalDate fechaDevolucion, boolean estado, Libro libro, Account usuario) {
        this.fechaInicio=fechaInicio;
        this.fechaDevolucion=fechaDevolucion;
        this.estado=estado;
        this.libro=libro;
        this.account =getAccount();
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean getEstado() {
        return estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public Account getAccount() {
        return account;
    }
}