package steps.web.google;

import net.thucydides.core.annotations.Step;
import pages.google.HomePage;

public class SearchSteps {

    HomePage homePage;

    @Step
    public void procurarTermoNoGoogle() {
        homePage.open();
    }

    @Step
    public void procurarOTermo(String termo) {
        homePage.buscaPorTermo(termo);
    }

    @Step
    public String retornaUrldoPrimeiroRegistroPesquisado() {
        return homePage.retornaUrldoPrimeiroRegistroPesquisado();
    }
}
