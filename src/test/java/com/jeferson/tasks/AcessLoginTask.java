package com.jeferson.tasks;

import com.jeferson.pages.AcessLoginPage;
import com.jeferson.runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessLoginTask extends RunCucumberTest {

    WebDriver driver = new ChromeDriver();
    AcessLoginPage acessLoginPage = new AcessLoginPage(driver);

    @Dado("^que estou no site da loja$")
    public void que_estou_no_site_da_loja() {
        System.out.println("a");
        acessLoginPage.acessWindowLogin();
//        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Dado("^eu preencho para criar meu email$")
    public void eu_preencho_para_criar_meu_email() {
        System.out.println("b");
        acessLoginPage.createEmailField("teste@gmail.com");
    }

    @Dado("^clico em botao para inicia criar conta$")
    public void clico_em_botao_para_inicia_criar_conta() {
        System.out.println("c");
    }

    @Quando("^eu preencho todos os campos$")
    public void eu_preencho_todos_os_campos() {
        System.out.println("d");
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
