package com.onlineshopping.controller;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.onlineshopping.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.onlineshopping.dao.CategoryDao;
import com.onlineshopping.dao.ProductDao;
import com.onlineshopping.dao.UserDao;

import com.onlineshopping.model.Product;
import com.onlineshopping.service.ProductService;

@RestController
@RequestMapping("api/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CategoryDao categoryDao;
	


	@Autowired
	private UserDao userDao;
	

	@GetMapping("all")
	public List<Product> getAllProducts() {
		

		return productDao.findAll();
		
	}
	@GetMapping("getProd/{id}")
	public Product getProduct(@PathVariable int id){
		return productDao.findById(id).get();
	}
	


	


}
