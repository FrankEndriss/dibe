package de.direktbewerten.web.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class SearchController {

	/** The landing page.
	 * @return index.html
	 */
	@RequestMapping(value="/index.html", method=RequestMethod.GET)
	public String index(Model model) {
		System.out.println(""+getClass().getName()+".index() was called");
		model.addAttribute("username", "Frank");
		return "index";
	}

}
