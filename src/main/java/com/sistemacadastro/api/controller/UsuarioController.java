package com.sistemacadastro.api.controller;
import com.sistemacadastro.api.entity.Usuario;
import com.sistemacadastro.api.repository.UsuarioRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @GetMapping("/notificacao")
    public String Notificacao(){
       return "Bem Vindo ao Cefet Play! ";
    }

    @Autowired
    private UsuarioRepository usuariorepository;

    @PostMapping("/usuarios")
    public Usuario CadastrarUsuario(@RequestBody Usuario usuario){
        return usuariorepository.save(usuario);
    }

    @GetMapping("/usuarios")
    public List <Usuario> ListarUsuarios(){
      return usuariorepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario EncontrarUsuario(@PathVariable Long id){
    return usuariorepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void RemoverUsuario(@PathVariable Long id){
        usuariorepository.deleteById(id);
    }

}



