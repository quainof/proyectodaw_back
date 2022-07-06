package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.web;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica.ServicioNacionalidad;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Nacionalidad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping(value="/nacionalidades")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControladorNacionalidad {

    private ServicioNacionalidad servicio;

    public ControladorNacionalidad(ServicioNacionalidad servicio){
        this.servicio = servicio;
    }

    //GET todas
    @RequestMapping
    public Iterable<Nacionalidad> getNacionalidades(){
        return this.servicio.getNacionalidades();
    }

    @RequestMapping(params = {"filtro"})
    public Iterable<Nacionalidad> getNacionalidades(@RequestParam(name = "filtro") String filtro){
        log.info(filtro);
        return this.servicio.getNacionalidades(filtro);
    }

    //GET 1
    @RequestMapping(value="/{id}")
    public Nacionalidad getNacionalidad(@PathVariable("id") Integer id){
        return this.servicio.getNacionalidad(id);
    }

    //POST
    @RequestMapping(method = RequestMethod.POST)
    public Nacionalidad guardar(@RequestBody Nacionalidad n){
        return this.servicio.guardar(n);
    }

    //PUT
    @RequestMapping(method = RequestMethod.PUT)
    public Nacionalidad actualizar(@RequestBody Nacionalidad n){
        return this.servicio.actualizar(n);
    }

    //DELETE
    @RequestMapping(method = RequestMethod.DELETE)
    public void eliminar(@RequestBody Integer id){
        this.servicio.eliminar(id);
    }

}