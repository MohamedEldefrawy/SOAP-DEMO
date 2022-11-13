import org.example.CountryInfoService;
import org.example.CountryInfoServiceSoapType;
import org.example.TCountryCodeAndName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountryUnitTest {
    private CountryInfoServiceSoapType countryInfoServiceSoapType;

    @BeforeAll
    void initialize() {
        this.countryInfoServiceSoapType = new CountryInfoService().getCountryInfoServiceSoap();
    }

    @Test
    public void testListOfCountryNamesByCode() {
        List<TCountryCodeAndName> countries = this.countryInfoServiceSoapType.listOfCountryNamesByCode().getTCountryCodeAndName();
        Assertions.assertTrue(countries.size() > 0);
    }

    @Test
    public void testCapitalCity() {
        var country = this.countryInfoServiceSoapType.capitalCity("EG");
        Assertions.assertEquals("Cairo", country);
    }
}
