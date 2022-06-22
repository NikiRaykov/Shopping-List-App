package bg.softuni.shoppinglist.model.entity.binding;

import bg.softuni.shoppinglist.model.entity.enums.CategoryNameEnum;
import bg.softuni.shoppinglist.model.entity.service.ProductServiceModel;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductAddBindingModel {

    public ProductAddBindingModel(){}

    @Length(min = 3, max = 20, message = "Name length must be between 3 and 20 characters!")
    private String name;

    @Length(min = 5, message = "Description length must be more than 5 characters!")
    private String description;

    @FutureOrPresent(message = "The date cannot be in the past")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime neededBefore;

    @DecimalMin(value = "0", message = "Price must be positive number!")
    private BigDecimal price;

    @NotNull(message = "Category cannot be empty")
    private CategoryNameEnum category;

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

    public LocalDateTime getNeededBefore() {
        return neededBefore;
    }

    public void setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }

}
