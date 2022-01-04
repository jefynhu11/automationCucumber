package com.jeferson.tasks;

import com.jeferson.framework.support.BaseTest;
import com.jeferson.pages.AccountPage;
import cucumber.api.java.pt.Então;

public class AccountTask extends BaseTest {

    AccountPage accountPage = new AccountPage(driver);

    @Então("^verificado se cadastrar com sucesso$")
    public void verificado_se_cadastrar_com_sucesso() {
        System.out.println("f");
        accountPage.valideAccount();
        accountPage.signOut();
    }
}
