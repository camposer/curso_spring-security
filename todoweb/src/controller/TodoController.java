package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TodoService;
import to.Todo;

@Controller
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	// http://localhost:8080/todoweb/index.do
	@RequestMapping("/index")
	public String index(Model model) {
		List<Todo> todos = todoService.obtenerTodos();
		model.addAttribute("todos", todos);
		return "/WEB-INF/jsps/index.jsp";
	}
	
	@RequestMapping(value={"/admin/index", ""})
	public String adminIndex() {
		return "/WEB-INF/jsps/admin/index.jsp";
	}

	@RequestMapping("/sesion/cerrar")
	public String sesionCerrar(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/index.do";
	}
}
