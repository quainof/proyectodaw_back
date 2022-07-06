package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.persistencia;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Rol;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RepositorioRol extends CrudRepository<Rol, Integer> {
    Iterable<Rol> findByNombreContainingIgnoreCase(String nombre);
}
