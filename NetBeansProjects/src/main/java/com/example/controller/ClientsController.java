package com.example.controller;

import com.example.entity.Client;
import com.example.service.IClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Joel Mora
 */
@Controller
public class ClientsController {

    @Autowired
    private IClientService clientService;
           
    
     @GetMapping("/")
     public String index(Model model){
         List<Client> clientsList = clientService.getAllClients();
         model.addAttribute("clientsList", clientsList);
         return "clients";
     }

    @GetMapping("/{surname}")
    public String videosCategory(@PathVariable("surname") String surname, Model model){
        List<Client> clientsList;
        System.out.println(surname);
        if(surname.isEmpty()){
            return "redirect:/";
        }else{
            clientsList = clientService.getClientsBySurname(surname);
        }
        model.addAttribute("clientsList", clientsList);
        return "clients";
    }  
    
}
