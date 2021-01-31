package tests_data;

import objects.Account;
import objects.Contacts;

public interface TestData {
    String USERNAME = "johndoe-znae@force.com";
    String PASSWORD = "1408310a";
    Account account = new Account("Test User", "www.test.by", "Analyst",
            "+375 25 555 55 55", "+375 17 255 55 55", "Chemicals", "5",
            "500", "description", "billing street",
            "billing city", "billing state", "billing zip code",
            "billing country");
    Contacts contacts = new Contacts("Mr.","Mister","Twister",
            "+375 17 555 55 55", "+375 25 555 55 55", "Test User",
            "TestUser@mail.ru", "tets","Mister Twister" , "Independent","Nezavisimosti",
            "Minsk", "Minskaya Oblast", "Smolevichi", "Vitebskaya oblast",
            "12345", "USA", "23654", "Spain", "+375 17 222 22 22",
            "FBI", "+375 17 333 33 33", "In-Store", "+375 29 666 66 66",
            "1/12/1985", "+375 17 333 33 34", "+375 17 888 88 88", "Description");
}
