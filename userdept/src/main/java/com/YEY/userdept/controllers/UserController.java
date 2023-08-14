package com.YEY.userdept.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.YEY.userdept.entities.User;
import com.YEY.userdept.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Responder requisições
@RequestMapping(value = "/users") // Mapear uma solicitação HTTP geral para o controlador!
public class UserController {

	// End-Points É a nossa ponte para acessar dados do banco!

	@Autowired // Injeção de dependencia!
	private UserRepository repository;

	// End-point para encontrar todos os users
	@GetMapping // Mapear uma solicitação HTTP especifica para o controlador!
	public List<User> findAll() {
		return repository.findAll();
	}

	// End-point para encontrar um user especifico
	@GetMapping(value = "/{id}") // PathVariable vincula placeholders em uma URL de solicitação a parâmetros de
									// método em um controlador.
	public User findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	// End-point para salvar user
	// PostMapping é usada para capturar solicitações POST e executar a lógica
	// correspondente no método do controlador.
	// RequestBody indica que o corpo de uma solicitação HTTP deve ser convertido em
	// um objeto Java.
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);
	}
}
