package com.jeferson.tasks;

import com.jeferson.framework.support.BaseTest;
import com.jeferson.pages.CreateAccountPage;
import cucumber.api.java.pt.Quando;

public class CreateAccountTask extends BaseTest {

    CreateAccountPage createAccountPage = new CreateAccountPage(driver);

    @Quando("^eu preencho todos os campos$")
    public void eu_preencho_todos_os_campos() {
        System.out.println("d");
        createAccountPage.title(1);
        createAccountPage.firstNameField();
        createAccountPage.lastNameField();
        createAccountPage.passwordField();
        createAccountPage.dateSelect();
        createAccountPage.monthSelect();
        createAccountPage.yearSelect();
        createAccountPage.adressField();
        createAccountPage.cityField();
        createAccountPage.stateSelect();
        createAccountPage.codeField();
        createAccountPage.mobileField();
    }

    @Quando("^clico em botao para registrar da conta$")
    public void clico_em_botao_para_registrar_da_conta() {
        System.out.println("e");
//        createAccountPage.registerButton();
    }

}
