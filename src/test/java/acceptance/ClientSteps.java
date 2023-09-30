package acceptance;

import com.example.bdd_cucumber.domain.Customer;
import com.example.bdd_cucumber.repositories.CustomerRepository;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class ClientSteps {

    private CustomerRepository customerRepository;

    @Given("^Des client existent$")
    public void test(DataTable dataTable){

        List<Map<String, String>> dataMaps = dataTable.asMaps(String.class, String.class);
        dataMaps.forEach(dataMap -> {
            Customer customer = new Customer(dataMap.get("id"), dataMap.get("firstName"), dataMap.get("lastName"));
            customerRepository.add(customer);
        });
    }
}
