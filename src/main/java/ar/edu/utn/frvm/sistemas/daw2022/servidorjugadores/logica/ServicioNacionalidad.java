package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Nacionalidad;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.persistencia.RepositorioNacionalidad;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioNacionalidad {
    private RepositorioNacionalidad repositorio;
    public ServicioNacionalidad(RepositorioNacionalidad repositorio){
        this.repositorio = repositorio;
    }
    public Nacionalidad getNacionalidad(Integer id){
        //return new Facultad("Mendoza","FRM");
        Optional<Nacionalidad> rta = this.repositorio.findById(id);
        if (rta.isPresent()){
            return rta.get();
        }
        return null;
    }
    public Iterable<Nacionalidad> getNacionalidades(){
        return this.repositorio.findAll();
    }
    public Iterable<Nacionalidad> getNacionalidades(String filtro){
        return this.repositorio.findByNombreContainingIgnoreCase(filtro);
    }

    public Nacionalidad guardar(Nacionalidad n) {
        return this.repositorio.save(n);
    }

    public Nacionalidad actualizar(Nacionalidad n) {
        return this.guardar(n);
    }

    public void eliminar(Integer id) {
        this.repositorio.deleteById(id);
    }
}