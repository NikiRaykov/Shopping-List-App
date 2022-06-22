package bg.softuni.shoppinglist.service.impl;

import bg.softuni.shoppinglist.model.entity.Category;
import bg.softuni.shoppinglist.model.entity.enums.CategoryNameEnum;
import bg.softuni.shoppinglist.repository.CategoryRepository;
import bg.softuni.shoppinglist.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void initCategory() {
        if (categoryRepository.count() == 0) {
            Arrays.stream(CategoryNameEnum.values())
                    .forEach(categoryNameEnum -> {
                        Category category = new Category(categoryNameEnum,
                                "Description for " + categoryNameEnum.name());

                        categoryRepository.save(category);
                    });
        }
    }

    @Override
    public Category findByName(CategoryNameEnum categoryNameEnum) {
        return this.categoryRepository.findByName(categoryNameEnum)
                .orElse(null);
    }
}
