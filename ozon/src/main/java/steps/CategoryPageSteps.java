package steps;

import io.qameta.allure.Step;
import pages.CategoryPage;
import pages.MainPage;

public class CategoryPageSteps {
    @Step("Выбираем тип категории {0}")
    public void clickToTypeCategory(String categoryName){
        new CategoryPage().clickToType(categoryName);
    }
}
