package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String showHomePage() {
		return "header";
	}

	@RequestMapping("/login")
	public String showLoginForm() {
		return "login_form";
	}

	@RequestMapping(value = "/login_action", method = RequestMethod.POST)
	public void checkCreds(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response) throws IOException {

		if (username.equals("Harish") && password.equals("HARISH@123")) {

			request.getSession().setAttribute("username", username);

			response.sendRedirect("dashboard");
		} else {
			response.sendRedirect("login");
		}
	}

	@RequestMapping("/dashboard")
	public String showDashboard() {
		return "dashboard";
	}

	@RequestMapping("/logout")
	public void logoutAdminUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().invalidate();

		resp.sendRedirect("login");
	}

}
