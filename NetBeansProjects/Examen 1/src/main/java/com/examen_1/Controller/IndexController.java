package com.examen_1.Controller;



import com.examen_1.Service.VehiculoService;
import com.examen_1.domain.Vehiculo;
import lombok.extern.slf4j.Slf4j;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/")
    public String inicio(Model model) {
        //log.info("Estamos usando una arquitectura mvc");
        var vehiculo = vehiculoService.getVehiculo();
        model.addAttribute("vehiculo", vehiculo);
        return "index";
    }

    @GetMapping("/nuevoVehiculo")
    public String nuevoVehiculo(Vehiculo vehiculo) {
        return "modificarCliente";
    }

    @PostMapping("/guardarVehiculo")
    public String guardarVehiculo(Vehiculo vehiculo) {
        vehiculoService.save(vehiculo);
        return "redirect:/";
    }
    
    

    @GetMapping("/eliminarEstado/ {id_vehiculo}")
    public String eliminarEstado(Vehiculo vehiculo) {
        vehiculoService.delete(vehiculo);
        return "redirect:/";
    }
}
