package com.lay.web1.controller;

import com.lay.web1.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String list(Model model){
        List<Product> list =  new ArrayList<>();

        Product p = new Product();
        p.setId(1);
        p.setPrice(new BigDecimal(100.00));
        p.setDescription("物美价廉");

        Product p1 = new Product();
        p1.setId(1);
        p1.setPrice(new BigDecimal(100.00));
        p1.setDescription("物美价廉");

        list.add(p);
        list.add(p1);
        model.addAttribute("products", list);
        System.out.println("Returning rpoducts:");
        return "products";
    }

    @RequestMapping("product/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        Product p = new Product();
        p.setId(1);
        p.setPrice(new BigDecimal(100.00));
        p.setDescription("物美价廉");
        model.addAttribute("product", p);
        return "productshow";
    }

    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Product p = new Product();
        p.setId(1);
        p.setPrice(new BigDecimal(100.00));
        p.setDescription("物美价廉");
        model.addAttribute("product", p);
        return "productform";
    }

    @RequestMapping("product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "productform";
    }

    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveProduct(Product product){

        System.out.println("save");

        return "redirect:/product/" + product.getId();
    }

}
