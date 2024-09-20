package org.example.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.example.ui.datas.BankAccount;
import org.example.ui.pages.MainPage;
import org.example.ui.pages.RegisterAccountPage;
import org.example.ui.utils.RandomData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UiTest {
    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "https://parabank.parasoft.com";
    }

    @Test
    public void userCantCreateAccountWithOnlyName() {
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();

        BankAccount bankAccount = BankAccount.builder()
                .firstName(RandomData.randomString())
                .build();
        registerAccountPage.register(bankAccount);

        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }
    @Test
    public void userCantCreateAccountWithOnlyAddress() {
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        BankAccount bankAccount = BankAccount.builder()
                .address(RandomData.randomString())
                .build();
        registerAccountPage.register(bankAccount);

        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }
    @Test
    public void userSuccessfulRegistration() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        String password = RandomData.randomString();
        BankAccount bankAccount = BankAccount.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString())
                .city(RandomData.randomString())
                .state(RandomData.randomString())
                .zipCode(RandomData.randomString())
                .address(RandomData.randomString())
                .ssn(RandomData.randomString())
                .userName(RandomData.randomString())
                .password(password)
                .confirmPassword(password)
                .build();
        registerAccountPage.register(bankAccount);
        MainPage mainPage = new MainPage();
        mainPage.getWelcomeTitle().shouldHave(Condition
                .exactText("Welcome " + bankAccount.getUserName()));
        mainPage.getWelcomeText().shouldHave(Condition
                .exactText("Your account was created successfully. You are now logged in."));
        mainPage.getWelcomeFirstLastName()
                .shouldHave(Condition
                        .exactText("Welcome " + bankAccount.getFirstName() + " " + bankAccount.getLastName()));

    }
}

