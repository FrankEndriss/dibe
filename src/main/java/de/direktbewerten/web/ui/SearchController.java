package de.direktbewerten.web.ui;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class SearchController {
	private final static Logger log=Logger.getLogger(SearchController.class);

	/** The landing page.
	 * @return index.html
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		log.info(".index() was called");
		model.addAttribute("username", "Frank");
		return "index";
	}

}
