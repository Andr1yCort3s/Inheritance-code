package Library;
public class Account {
    private int id;
    private String nombre;
    private String correo;

    public void Usuario(int id, String nombre, String correo){
        this.correo = correo;
        this.id=id;
        this.nombre=nombre;
    }

    public Account(int id, String nombre, String correo) {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }


}