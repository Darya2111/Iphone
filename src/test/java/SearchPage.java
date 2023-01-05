import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    // в этом классе нам необходимо получить атрибут href первой найденной статьи
    // создаем коллекцию элементов (в коллекциях ставим 2 $)
    private final ElementsCollection articleTitles = $$x("//h2//a");
    // нам нужно получить первый элемент из коллекции

    /**
     * Возвращает href из первой статьи
     */
    public String getHrefFromFirstArticle(){
        return articleTitles.first().getAttribute("href");
    }
}
