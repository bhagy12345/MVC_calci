package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculator1 {
	@GetMapping("add1")
	public String add(@RequestParam int x,@RequestParam int y, ModelMap map){
	map.put("ans",( x + y));
		return "calculator1.jsp";
}
}
