package pages.google;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.br")
public class HomePage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchInput;

    @FindBy(css = "input[type=submit]")
    WebElementFacade searchButton;

    @FindBy(css = ".rc > div > a")
    WebElementFacade firstLink;

    public void buscaPorTermo(String termo) {
        searchInput.type(termo);
        searchInput.submit();
        //searchButton.click();
    }

    public String retornaUrldoPrimeiroRegistroPesquisado(){
        return firstLink.getAttribute("href");
    }
}
