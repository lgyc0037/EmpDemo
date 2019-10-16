package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String toIndex(){
    return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(Model m, HttpServletRequest request){
        System.out.println("sssssssssssssss");
        List<Employee> eployeeAll = employeeService.getEployeeAll();
        m.addAttribute("eployeeAll",eployeeAll);
        return "index";
    }
    @RequestMapping("/doDelete")
    public String doDelete(HttpServletRequest request){
        String id = request.getParameter("id");

        Integer result = employeeService.deleteEployee(id);
        if(result>0){
            return "redirect:/index";
        }else {

            return "redirect:/index";
        }

    }
    @RequestMapping("/toAdd")
    public String toAdd(HttpServletRequest request){
        return "add";
    }
    @RequestMapping("/doAdd")
    public String doAdd(HttpServletRequest request) throws ParseException {
        Employee employee=new Employee();
        employee.setXb(request.getParameter("xb"));
        employee.setId(request.getParameter("id"));
        employee.setXm(request.getParameter("xm"));
        employee.setNl(Integer.parseInt(request.getParameter("nl")));
        employee.setCsrq(sdf.parse(request.getParameter("csrq")));
        Integer result = employeeService.addEmployee(employee);
        if(result>0){
            return "redirect:/index";
        }else {
            return "redirect:/toAdd";
        }
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(HttpServletRequest request,Model m){
        String id = request.getParameter("id");
        Employee employee = employeeService.getEployeeById(id);
        m.addAttribute("employee",employee);
        return  "update";
    }
    @RequestMapping("/doUpdate")
    public String doUpdate(HttpServletRequest request) throws ParseException {
        Employee employee=new Employee();
        employee.setXb(request.getParameter("xb"));
        employee.setId(request.getParameter("id"));
        employee.setXm(request.getParameter("xm"));
        employee.setNl(Integer.parseInt(request.getParameter("nl")));
        employee.setCsrq(sdf.parse(request.getParameter("csrq")));
        Integer result = employeeService.updateEmployee(employee);
        if(result>0){
            return "redirect:/index";
        }else {
            return "redirect:/toAdd";
        }
    }
}
