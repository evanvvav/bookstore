package com.example.bookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bookStoreController {

	@GetMapping("/index")
	public String getIndex(Model model) {
		return "index";
	}

}