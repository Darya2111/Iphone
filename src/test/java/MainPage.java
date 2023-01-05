import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider
 */
public class MainPage {
// обозначим наш локатор, т.е. создадим элемент к которому будем обращаться
    private final SelenideElement textBoxInput = $x("//input[@type='text']");
    // SelenideElement - тип элемента
    // textBoxInput - название
    // "//input[@type='text']" - его локатор

    // мы не можем в методе выше работать с нашим локатором, поэтому нам надо создать
    // еще один метод, в котором появятся доступные функции

    /**
     * выполняется поиск на сайте и нажимается кнопка ентер
     * @param searchString - поисковая строка
     */
    public void search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }

    // первый способ для открытия браузера (не эффективный)
    // public void openWebSite(String url){
    //    Selenide.open(url);
    //}

    // второй способ для открытия браузера
    // используем конструктор
    public MainPage(String url){
        Selenide.open(url);
    }



}
