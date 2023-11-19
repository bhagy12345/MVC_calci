 package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calculator {
//	@RequestMapping("add")
//	void add(HttpServletRequest request,HttpServletResponse response) throws IOException {
//		int num1=Integer.parseInt(request.getParameter("num1"));
//		int num2=Integer.parseInt(request.getParameter("num2"));
//		int sum=num1+num2;
//		response.getWriter().print("<h1>TheThe <span style='color:blue'> sum is "+sum+"</h1>");
//	}
//	@PostMapping("sub")
//	@ResponseBody
//	String sub(@RequestParam int num1,@RequestParam int num2)
//	{
//		int diff=num1-num2;
//		return "<h1> The <span style='color:blue'> difference </span> of <span style='color:blue'>" + num1 +"</span> and  <span style='color:blue'>"+ num2 +" </span> is <span style='color:blue'>"+diff+"</span></h1>";
//	}
//	@PostMapping("mul")
//	@ResponseBody
//	String mul(@RequestParam int num1,@RequestParam int num2)
//	{
//		int mul=num1*num2;
//		return "<h1> The <span style='color:red'> product </span> of <span style='color:red'>" + num1 +"</span> and  <span style='color:red'>"+ num2 +" </span> is <span style='color:red'>"+mul+"</span></h1>";
//	
@PostMapping("add")
String add(HttpServletRequest request,HttpServletResponse response,ModelMap map) {	
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
int sum=num1+num2;
map.put("num1", num1);
map.put("num2", num2);
map.put("res",sum);
map.put("action", "sum");
return "Result.jsp";
}
@PostMapping("sub")
String sub(HttpServletRequest request,HttpServletResponse response,ModelMap map) {	
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
int sub=num1-num2;
map.put("num1", num1);
map.put("num2", num2);
map.put("res",sub);
map.put("action", "sub");
return "Result.jsp";
}
@PostMapping("mul")
String mul(HttpServletRequest request,HttpServletResponse response,ModelMap map) {	
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
int mul=num1*num2;
map.put("num1", num1);
map.put("num2", num2);
map.put("res",mul);
map.put("action", "mul");
return "Result.jsp";
}

@PostMapping("div")
String div(HttpServletRequest request,HttpServletResponse response,ModelMap map) {	
int num1=Integer.parseInt(request.getParameter("num1"));
int num2=Integer.parseInt(request.getParameter("num2"));
int div=num1/num2;
map.put("num1", num1);
map.put("num2", num2);
map.put("res",div);
map.put("action", "div");
return "Result.jsp";
}
}