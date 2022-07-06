package ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.web;

import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.logica.ServicioJugador;
import ar.edu.utn.frvm.sistemas.daw2022.servidorjugadores.modelo.Jugador;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping(value = "/jugadores")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControladorJugador {
    private ServicioJugador servicio;

    public ControladorJugador(ServicioJugador servicio) {
        this.servicio=servicio;
    }

    //GET todos
    @RequestMapping
    public Iterable<Jugador> getJugadores(){
        return this.servicio.getJugadores();
    }

    @RequestMapping(params = {"filtro"})
    public Iterable<Jugador> getJugadores(@RequestParam(name = "filtro") String filtro){
        log.info(filtro);
        return this.servicio.getJugadores(filtro);
    }

    //GET 1
    @RequestMapping(value = "/{id}")
    public Jugador getJugadores(@PathVariable("id") Integer id){
        return this.servicio.getJugadores(id);
    }

    //POST
    @RequestMapping(method = RequestMethod.POST)
    public Jugador guardar(@RequestBody Jugador j){
        return this.servicio.guardar(j);
    }

    //PUT
    @RequestMapping(method = RequestMethod.PUT)
    public Jugador actualizar(@RequestBody Jugador j){
        return this.servicio.actualizar(j);
    }

    // DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        this.servicio.eliminar(id);
    }
}
