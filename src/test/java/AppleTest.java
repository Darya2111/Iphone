import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseForTest {
    // наши константы
    private  final static String BASE_URL = "https://appleinsider.ru/";
    private  final static String SEARCH_STRING = "Чем отличается IPhone 13 от IPhone 12";
    // private - наша переменная достпуна Только В Этом классе
    // final - мы неможем переопределить эту переменную и ее изменить
    // static - инициализируется до инициализации класса (т.е. она Всегда есть)

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        //добавляя BASE_URL в скобки - используем второй способ открытия браузера
        //mainPage.openWebSite(BASE_URL); - первый способ открытия браузера

        // ищем поисковую строку и вводим в нее текст
        mainPage.search(SEARCH_STRING);

        // создаем новый экземпляр класса, в котором дальше взаимодействуем с другой страницей
        SearchPage searchPage = new SearchPage();

        // берем из перой статьи атрибут href (ссылка)
        String href = searchPage.getHrefFromFirstArticle();

        // проверяем, что href содержит "IPhone 13"
        Assertions.assertTrue(href.contains("iphone-13"));

    }

}
