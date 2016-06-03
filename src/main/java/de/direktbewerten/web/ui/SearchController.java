package de.direktbewerten.web.ui;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class SearchController implements ErrorController {
	private final static Logger log=Logger.getLogger(SearchController.class);

	/** The landing page.
	 * @return index
	 */
	@RequestMapping(value={ "/", "/index.htm", "index.html" }, method=RequestMethod.GET)
	public String index(Model model) {
		log.info(".index() was called");
		model.addAttribute("username", "Frank");
		return "index";
	}

	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String show_404(Model model) {
		log.info("show_404() was called");
		return "404";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
