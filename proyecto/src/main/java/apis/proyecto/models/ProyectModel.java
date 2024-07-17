package apis.proyecto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class ProyectModel {

    private String id;
    private String nombreProyecto;
    private String fechaInicion;
    private String estado;
    private String fechaFinalizacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getFechaInicion() {
        return fechaInicion;
    }

    public void setFechaInicion(String fechaInicion) {
        this.fechaInicion = fechaInicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

}

