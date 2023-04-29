package museosarapalomares;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Artista {
    private int codArtista;
    private String nombre;
    private String fnacimiento;
    private String ffallecimiento;
    private String nacionalidad;

    public Artista() {
        codArtista=0;
        nombre=null;
        fnacimiento=null;
        ffallecimiento=null;
        nacionalidad=null;
    }

    public Artista(int codArtista, String nombre, String fnacimiento, String ffallecimiento, String nacionalidad) {
        this.codArtista = codArtista;
        this.nombre = nombre;
        this.fnacimiento = fnacimiento;
        this.ffallecimiento = ffallecimiento;
        this.nacionalidad = nacionalidad;
    }

    public int getCodArtista() {
        return codArtista;
    }

    public void setCodArtista(int codArtista) {
        this.codArtista = codArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getFfallecimiento() {
        return ffallecimiento;
    }

    public void setFfallecimiento(String ffallecimiento) {
        this.ffallecimiento = ffallecimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Artista{" + "codArtista=" + codArtista + ", nombre=" + nombre + ", fnacimiento=" + fnacimiento + ", ffallecimiento=" + ffallecimiento + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
