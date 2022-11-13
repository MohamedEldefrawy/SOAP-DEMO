package org.example;

import org.example.CountryInfoService;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        CountryInfoService countryInfoService = new CountryInfoService();
        var countries = countryInfoService.getCountryInfoServiceSoap().listOfCountryNamesByCode().tCountryCodeAndName;
        for (var country: countries
             ) {
            System.out.println(country.sName);
        }
    }
}
