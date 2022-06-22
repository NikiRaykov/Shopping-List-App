package bg.softuni.shoppinglist.model.entity.service;

import bg.softuni.shoppinglist.model.entity.enums.CategoryNameEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductServiceModel {

    public ProductServiceModel(){}

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime neededTime;
    private CategoryNameEnum category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getNeededTime() {
        return neededTime;
    }

    public void setNeededTime(LocalDateTime neededTime) {
        this.neededTime = neededTime;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }
}
