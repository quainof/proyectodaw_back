package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

public class Facultad {
    @Id
    @GeneratedValue
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private String codigo;
    private String descripcion;

    //@OneToMany(mappedBy = "facultad")
    //private List<Jugador> jugador= new ArrayList<Jugador>();
}
