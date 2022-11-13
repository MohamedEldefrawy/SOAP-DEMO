package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CountryInfoService countryInfoService = new CountryInfoService();
        var countries = countryInfoService.getCountryInfoServiceSoap().listOfCountryNamesByCode().tCountryCodeAndName;
        for (var country: countries
        ) {
            System.out.println(country.sName);
        }
    }
}
