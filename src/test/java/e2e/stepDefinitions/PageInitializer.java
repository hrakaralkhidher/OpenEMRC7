package e2e.stepDefinitions;

import e2e.pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();

    }
}