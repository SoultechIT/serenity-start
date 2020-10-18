package stepDefinition.web.google;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.web.google.SearchSteps;

public class SearchDefinitionSteps {

    @Steps
    SearchSteps searchSteps;

    @Given("(.*?) is searching a term on google")
    public void actorIsSearchingATermOnGoogle() {
        searchSteps.procurarTermoNoGoogle();
    }

    @When("ele procura por {string}")
    public void eleProcuraPor(String termo) {
        searchSteps.procurarOTermo(termo);
    }

    @Then("ele então não acha resultados para {string}")
    public void eleEntãoNãoAchaResultadosPara(String resultado) {
        Assert.assertNotEquals(resultado, searchSteps.retornaUrldoPrimeiroRegistroPesquisado());
    }

    @Then("a primeira url encontrada {string} ser {string}")
    public void aPrimeiraUrlEncontradaDeveSer(String escolha, String resultado) {
        if(escolha.equals("deve")){
            Assert.assertEquals(resultado, searchSteps.retornaUrldoPrimeiroRegistroPesquisado());
        }
        else{
            Assert.assertNotEquals(resultado, searchSteps.retornaUrldoPrimeiroRegistroPesquisado());
        }
    }
}
