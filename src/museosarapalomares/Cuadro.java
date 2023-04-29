/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museosarapalomares;

/**
 *
 * @author User
 */
public class Cuadro {
    private int cod;
    private String nombre;
    private int fecha;
    private String estilo;
    private int codArtista;

    public Cuadro() {
        cod=0;
        nombre=null;
        fecha=0;
        estilo=null;
        codArtista=0;
    }

    public Cuadro(int cod, String nombre, int fecha, String estilo, int codArtista) {
        this.cod = cod;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estilo = estilo;
        this.codArtista = codArtista;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getCodArtista() {
        return codArtista;
    }

    public void setCodArtista(int codArtista) {
        this.codArtista = codArtista;
    }

    @Override
    public String toString() {
        return "Cuadro{" + "cod=" + cod + ", nombre=" + nombre + ", fecha=" + fecha + ", estilo=" + estilo + ", codArtista=" + codArtista + '}';
    }
    
}
