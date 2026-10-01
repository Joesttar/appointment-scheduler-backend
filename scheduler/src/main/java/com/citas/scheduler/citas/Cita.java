import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "citas")

public class Cita {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombreCliente;
    private String apellidosCliente;
    private String descripcion;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    
    //Constructor
    public Cita(String nombreCliente, String apellidosCliente, String descripcion, String decripcion,
        LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin){
            this.nombreCliente = nombreCliente;
            this.apellidosCliente = apellidosCliente;
            this.descripcion = decripcion;
            this.fechaHoraInicio = fechaHoraInicio;
            this.fechaHoraFin = fechaHoraFin;
    }

    /*Getters */
    public Long getId(){
        return this.id;
    }

    public String getNombreCliente(){
        return this.nombreCliente;
    }

    public String getApellidosCliente(){
        return this.apellidosCliente;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public LocalDateTime getFechaHoraInicio(){
        return this.fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin(){
        return this.fechaHoraFin;
    }

    /*Setters */
    public void setId(Long id){
        this.id = id;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setApellidosCliente(String apellidosCliente){
        this.apellidosCliente = apellidosCliente;
    }

    public void setDescipcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio){
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin){
        this.fechaHoraFin = fechaHoraFin;
    }
}