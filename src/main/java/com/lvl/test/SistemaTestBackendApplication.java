package com.lvl.test;

import com.lvl.test.entidades.Rol;
import com.lvl.test.entidades.Usuario;
import com.lvl.test.entidades.UsuarioRol;
import com.lvl.test.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaTestBackendApplication  implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;
	public static void main(String[] args) {
		SpringApplication.run(SistemaTestBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario =new Usuario();

		usuario.setNombre("Luifer");
		usuario.setApellido("Villa");
		usuario.setUsername("Lvilla");
		usuario.setPassword("12456");
		usuario.setEmail("vl@gmailñ.com");
		usuario.setTelefono("3217532223");
		usuario.setPerfi("foto.png");

		Rol rol =new Rol();
		rol.setRolId(1l);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles =new HashSet<>();
		UsuarioRol usuarioRol=new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);
		System.out.println(usuarioGuardado.getNombre());*/
	}
}
