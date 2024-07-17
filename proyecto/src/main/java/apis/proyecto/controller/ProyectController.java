package apis.proyecto.controller;

import apis.proyecto.models.ProyectModel;
import apis.proyecto.services.ProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping
public class ProyectController {
    @Autowired
    private ProyectService proyectService;
    @GetMapping
    public ArrayList<ProyectModel> getProyects(){
        return this.proyectService.getProyects();
    }
    @PostMapping
    public ProyectModel saveProyect(@RequestBody ProyectModel proyect){
        return this.proyectService.saveProyect(proyect);
    }
    @PutMapping(path = "/{id}")
    public ProyectModel updateProyectById(@RequestBody ProyectModel request,@PathVariable ("id")String id){
    return this.proyectService.updateById(request,id);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") String id){
        boolean borrar = this.proyectService.deleteById(id);
        if (borrar){
            return "proyect whit id " + id + "delete";
        }else {
            return "proyect don´t delte";
        }
    }

}
