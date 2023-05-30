package com.lvl.test.servicios.impl;

import com.lvl.test.entidades.Usuario;
import com.lvl.test.entidades.UsuarioRol;
import com.lvl.test.repositorios.RolRepository;
import com.lvl.test.repositorios.UsuarioRepository;
import com.lvl.test.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByusername(usuario.getApellido());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByusername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
            usuarioRepository.deleteById(usuarioId);
    }
}
