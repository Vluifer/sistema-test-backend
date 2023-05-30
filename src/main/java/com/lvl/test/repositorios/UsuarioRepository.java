package com.lvl.test.repositorios;

import com.lvl.test.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByusername(String username);
}
