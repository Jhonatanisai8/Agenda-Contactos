package org.Jhonatan.Agenda.Modelo;

public class Nombre {
    private String nombrePrefijo;
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String sufijoApellido;
    private String alias;

    public Nombre() {
    }

    public Nombre(String nombrePrefijo, String nombre, String segundoNombre, String apellido, String sufijoApellido,
            String alias) {
        this.nombrePrefijo = nombrePrefijo;
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.sufijoApellido = sufijoApellido;
        this.alias = alias;
    }

    public String getNombrePrefijo() {
        return nombrePrefijo;
    }

    public void setNombrePrefijo(String nombrePrefijo) {
        this.nombrePrefijo = nombrePrefijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSufijoApellido() {
        return sufijoApellido;
    }

    public void setSufijoApellido(String sufijoApellido) {
        this.sufijoApellido = sufijoApellido;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
