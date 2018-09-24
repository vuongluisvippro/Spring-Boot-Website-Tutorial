package com.tutorial.genealogy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ResponseBody if didn't have available view, so we can return to 
 * body express by text, long text. By the way, we need to add it. Whitelabel Error Page
 */

@Controller
public class ControllerPublicIndex {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
