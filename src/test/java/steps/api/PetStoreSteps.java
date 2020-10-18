package steps.api;

import model.petstore.Pets;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class PetStoreSteps {

    @Step
    public void addANewPetToTheStore(Pets pet) {
        SerenityRest.given().contentType("application/json")
                .with().body(pet)
                .baseUri("https://petstore.swagger.io")
                .basePath("v2/pet")
                .when().post().then().statusCode(200);

        pet.setId(Long.parseLong(lastResponse().jsonPath().getString("id"))) ;
    }

    @Step
    public void searchForAPetAtTheStore(long id){
        SerenityRest.get("https://petstore.swagger.io/v2/pet/{id}", id);
    }
}
