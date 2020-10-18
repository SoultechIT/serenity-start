package stepDefinition.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import model.petstore.Pets;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.api.PetStoreSteps;

import java.util.ArrayList;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class PetStoreDefinitiosSteps {

    Pets pet = new Pets();

    @Steps
    PetStoreSteps petStoreSteps;

    @Given("I add a new pet to the store")
    public void iAddANewPetToTheStore() {
        pet.setName("Teste");
        pet.setStatus("available");
        pet.setPhotoUrls(new ArrayList());

        petStoreSteps.addANewPetToTheStore(pet);
    }

    @Then("pet should be available")
    public void petShouldBeAvailable() {
        petStoreSteps.searchForAPetAtTheStore(pet.getId());
        Assert.assertEquals(200, lastResponse().statusCode());
        Assert.assertEquals(pet.getName(), lastResponse().jsonPath().getString("name"));
    }
}