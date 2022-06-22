package bg.softuni.shoppinglist.service;

import bg.softuni.shoppinglist.model.entity.Product;
import bg.softuni.shoppinglist.model.entity.enums.CategoryNameEnum;
import bg.softuni.shoppinglist.model.entity.service.ProductServiceModel;
import bg.softuni.shoppinglist.model.entity.view.ProductViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);

    BigDecimal getTotalSum();

    List<ProductViewModel> findAllProductsByCategoryName(CategoryNameEnum categoryNameEnum);


    void buyProduct(Long id);

    void buyAll();
}
