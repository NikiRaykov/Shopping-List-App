package bg.softuni.shoppinglist.service;

import bg.softuni.shoppinglist.model.entity.Category;
import bg.softuni.shoppinglist.model.entity.enums.CategoryNameEnum;

public interface CategoryService {
    void initCategory();

    Category findByName(CategoryNameEnum categoryNameEnum);
}
