package com.jeferson.tasks;

import com.jeferson.framework.support.BaseTest;
import com.jeferson.pages.AcessLoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AcessLoginTask extends BaseTest {

    AcessLoginPage acessLoginPage = new AcessLoginPage(driver);

    @Dado("^que estou no site da loja$")
    public void que_estou_no_site_da_loja() {
        System.out.println("a");
        acessLoginPage.acessWindowLogin();
    }

    @Dado("^eu preencho para criar meu email$")
    public void eu_preencho_para_criar_meu_email() {
        System.out.println("b");
        acessLoginPage.createEmailField("testes1@gmail.com");
    }

    @Dado("^clico em botao para inicia criar conta$")
    public void clico_em_botao_para_inicia_criar_conta() {
        System.out.println("c");
        acessLoginPage.createAnAccountButton();
    }

    @Quando("^clico em botao para registrar da conta$")
    public void clico_em_botao_para_registrar_da_conta() {
        System.out.println("e");
    }

    @Então("^verificado se cadastrar com sucesso$")
    public void verificado_se_cadastrar_com_sucesso() {
        System.out.println("f");
    }

}
