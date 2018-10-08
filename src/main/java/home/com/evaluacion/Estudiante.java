package home.com.evaluacion;

public class Estudiante {

    private String nombre,codigo,materia;
    private Double parcial1,parcial2,parcial3,promedio;

    public Estudiante(String nombre, String codigo, String materia,
                      Double parcial1, Double parcial2, Double parcial3) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getParcial1() {
        return parcial1;
    }

    public void setParcial1(Double parcial1) {
        this.parcial1 = parcial1;
    }

    public Double getParcial2() {
        return parcial2;
    }

    public void setParcial2(Double parcial2) {
        this.parcial2 = parcial2;
    }

    public Double getParcial3() {
        return parcial3;
    }

    public void setParcial3(Double parcial3) {
        this.parcial3 = parcial3;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }



}
