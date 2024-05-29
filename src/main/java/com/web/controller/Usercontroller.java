package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Users;
import com.web.repo.UserRepo;

@Controller
public class Usercontroller {


	@Autowired	
	private UserRepo repo;
	

	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}

	@RequestMapping("/addUser")
	public String registerForm()
	{
		return "register";
	}
	@RequestMapping("/save")
	public String saveUser(Users users,ModelMap model)
	{
		repo.save(users);
		return "success";
	}
	
	@RequestMapping(value="/viewUsers",method=RequestMethod.GET)
	public String viewUsers(ModelMap model)
	{
		model.put("users",repo.findAll());
		return "viewusers";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		repo.deleteById(id);
		return "/viewusers";
	}
	
	@RequestMapping(value="/update/{id}")
	public String edit(@PathVariable int id,ModelMap model)
	{
		Users users=repo.findById(id).get();
		model.addAttribute("command",users);
		return "editUser";
	}
	
	@RequestMapping(value="/editu",method=RequestMethod.POST)
	public String editsave(@RequestParam String name,@RequestParam String email,@RequestParam String password,@RequestParam String gender,@RequestParam String country,Users users,ModelMap model)
	{
		repo.save(users);
		return "redirect:/viewUsers";
	}

}
