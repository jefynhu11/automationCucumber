# language: pt
  @cadastrar
  Funcionalidade: Cadastrado no site loja AutomaticonPraticon

    @cadastrar-login
    Cenário: Fazer cadastrar na conta da loja
      Dado que estou no site da loja
      E eu preencho para criar meu email
      E clico em botao para inicia criar conta
      Quando eu preencho todos os campos
      E clico em botao para registrar da conta
      Então verificado se cadastrar com sucesso