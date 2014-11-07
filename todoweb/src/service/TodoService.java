package service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import to.Todo;

public interface TodoService {
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Todo> obtenerTodos();
}
