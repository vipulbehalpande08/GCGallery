package com.gcg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gcg.app.beans.Product;
import com.gcg.app.service.ProductService;
import com.gcg.app.util.Constants;
import com.gcg.app.util.Utils;
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/api/product")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public int addProduct(@RequestBody Product product){
		return productService.addProduct(product).getId();
	}
	
	@RequestMapping(value="/updateProduct", method=RequestMethod.POST)
	public void updateProduct(@RequestBody Product product){
		productService.updateProduct(product);
	}
	
	@RequestMapping(value="/getProductBy/{categoryId}", method=RequestMethod.GET)
	public Product getProductByCategoryId(@PathVariable int categoryId){
		return productService.getProductByCategoryId(categoryId);
	}
	@RequestMapping(value="/remove/{productId}", method=RequestMethod.DELETE)
	public void removeProductById(@PathVariable int productId){
		productService.removeProductById(productId);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}
	@RequestMapping(value="/uploadFile/{productId}", method=RequestMethod.POST)
	public void uploadFiles(@RequestParam("file") MultipartFile file, @PathVariable String productId){
		
		Utils.uploadFile(Constants.PRODUCT_UPLOAD_PATH+productId+"/", file, "product");
	}
}
