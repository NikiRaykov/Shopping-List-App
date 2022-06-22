package bg.softuni.shoppinglist.web;

import bg.softuni.shoppinglist.model.entity.enums.CategoryNameEnum;
import bg.softuni.shoppinglist.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("user") == null) {
            return "index";
        }

        model.addAttribute("totalSum", productService.getTotalSum());
        model.addAttribute("drinks", productService.findAllProductsByCategoryName(CategoryNameEnum.Drink));
        model.addAttribute("foods", productService.findAllProductsByCategoryName(CategoryNameEnum.Food));
        model.addAttribute("households", productService.findAllProductsByCategoryName(CategoryNameEnum.Household));
        model.addAttribute("other", productService.findAllProductsByCategoryName(CategoryNameEnum.Other));

        return "home";

    }
}
