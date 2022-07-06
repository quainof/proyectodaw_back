package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {
    @Id
    @GeneratedValue
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private String apellido;
    @NonNull
    private String dni;
    @NonNull
    private Integer legajo;

    @NonNull
    private Date fechaNacimiento;

    private String email;

    private String telefono;

    @NonNull
    @ManyToOne()
    private Facultad facultad;

    @NonNull
    @ManyToOne()
    private Rol rol;

    @NonNull
    @ManyToOne()
    private Disciplina disciplina;

    @NonNull
    @ManyToOne()
    private Nacionalidad nacionalidad;
}
