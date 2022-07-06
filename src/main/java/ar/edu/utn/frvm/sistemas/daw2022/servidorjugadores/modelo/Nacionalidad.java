package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Nacionalidad {

    @Id
    @GeneratedValue
    private Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private String codigo;
}