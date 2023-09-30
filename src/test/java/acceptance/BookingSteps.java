package com.example.bdd_cucumber.acceptance;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps {
    @When("je tente de reserver le VTC {string} de {string} a {string}")
    public void je_tente_de_reserver_le_vtc_de_a(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("le solde de mon compte est de {string} euros TTC avec {string} euros TTC d'avoir")
    public void leSoldeDeMonCompteEstDeEurosTTCAvecEurosTTCDAvoir(String arg0, String arg1) {
        
    }

    @Then("la reservation est effective")
    public void laReservationEstEffective() {
        
    }

    @Then("la reservation n'est pas effective")
    public void laReservationNEstPasEffective() {
        
    }

    @And("et une alerte pour solde insufisant")
    public void etUneAlertePourSoldeInsufisant() {
    }
}
