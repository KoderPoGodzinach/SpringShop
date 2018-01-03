package dziedzic.rafal.hibernateHelloWorld.controller;

import dziedzic.rafal.hibernateHelloWorld.dao.ProductDao;
import dziedzic.rafal.hibernateHelloWorld.model.Product;
import dziedzic.rafal.hibernateHelloWorld.services.BasketServices;
import dziedzic.rafal.hibernateHelloWorld.servicesImpl.BasketServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class StartController {
    @Autowired
    ProductDao productDao;
    @Autowired
    BasketServices basketServices;

    @GetMapping(value="/map")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("product",new Product());
        return "map";
    }

    @PostMapping(value="/map")
    public String addProduct(@ModelAttribute Product product, ModelMap modelMap) {
        modelMap.addAttribute("product",product);

        productDao.save(product);

        return "redirect:/map";
    }


    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public String showAllProduct(ModelMap modelMap) {
        modelMap.addAttribute("productList",productDao.getAll());


        return "product";
    }

    @RequestMapping(value = "/product")
    public String prepareBasket(@RequestParam("id") String id, ModelMap modelMap) {

        System.out.println(id);

       // basketServices.addProduct(productDao.getAll().get((Integer.valueOf(id))));

        return "redirect:/productList";
    }

}
