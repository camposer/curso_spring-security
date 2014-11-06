package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import to.Todo;
import to.Todo.Status;

@Service
public class TodoDummyServiceImpl implements TodoService {
	private List<Todo> todos;

	public TodoDummyServiceImpl() {
		todos = new ArrayList<Todo>();
		todos.add(new Todo("Hacer la compra", Status.POR_HACER));
		todos.add(new Todo("Ir al médico", Status.POR_HACER));
		todos.add(new Todo("Llamar a casa", Status.POR_HACER));
	}
	
	@Override
	public List<Todo> obtenerTodos() {
		return todos;
	}

}
