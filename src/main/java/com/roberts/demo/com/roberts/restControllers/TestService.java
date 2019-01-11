package com.roberts.demo.com.roberts.restControllers;

import com.roberts.demo.com.roberts.dataAccess.BlogRepository;
import com.roberts.demo.com.roberts.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * A test/demo REST controller that is hosted at '/'
 * This class and the methods within are called when an HTTP request is sent to the url corresponding to the
 * path (URI) contained within the RequestMapping annotation.
 *
 * e.g. when a get request is sent to '/blog', this class is instantiated by the Spring Boot framework, and the index()
 * method is called. Whatever is returned by the index method, is sent back through the Spring Boot framework, and to the
 * browser as a JSON object.
 */
@RequestMapping("/")
@RestController
public class TestService {

	/**
	 * Creates an autowired blog repository (blog is just bullshit database stuff. doesn't matter what as long
	 * as you know this is a class that connects to the database.)
	 *
	 * This should be done in a constructor but this is simpler for a demo.
	 *
	 * The autowired annotation takes the blogRepo Interface and automagically generates a proper class with all of the
	 * methods defined in the interface. Each method defined in the interface is a query. These methods are then made
	 * available to this class.
	 */
	@Autowired
	BlogRepository blogRepo;

	/**
	 * A method that responds to get requests at '/blog'. This method uses the GetMapping annotation rather than the
	 * RequestMapping annotation. They both accomplish effectively the same thing
	 *
	 * @return list of blog posts as gotten from the database. These posts are Blog objects represented as JSON
	 */
	@GetMapping("/blog")
	public List<Blog> index() {
		//Gets a list of all blog objects and returns them to the browser
		return blogRepo.findAll();
	}


	/*
	The point of the next two methods is to demonstrate that two methods can exist that respond to requests at the same
	path. While both of the following methods respond to requests at localhost:8080/test, one method responds to GET
	requests, and the other method responds to POST requests.
	 */

	/**
	 * A method that responds to get requests at '/test'
	 *
	 * @return String
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain")
	public String listenGet() {
		return "GET at test OK";
	}

	/**
	 * A method that responds to post requests at '/test'
	 *
	 * @return String
	 */
	@RequestMapping(value = "/test", method = RequestMethod.POST, produces = "text/plain")
	public String listenPost() {
		return "POST at test OK";
	}

}
