# DMchallenge


### Tecnologia
Tecnologias usadas para desenvolvimento:
- [Java](https://www.oracle.com/technetwork/pt/java/index.html)
- [RestAssured](http://rest-assured.io)
- [TestNG](https://testng.org/doc/)
- [Owner](http://owner.aeonbits.org/docs/welcome/)
- [Maven](https://maven.apache.org)

### Bug

Os bugs estão reportados nas [Issues](https://github.com/PericlesFeltrin/DMchallenge/issues)

### Report
  Após a execução o report estará disponivel na pasta `target/report/test_execution.html`
  Obs.: Os últimos reports na versão PT e EN que rodei estão na na pasta `report`
  
### Execução
Para executar via maven:

| execução | comando |
|-----|---------|
| Teste de healthcheck | `mvn test -Dsuite=healthcheck` |
| Teste de contrato | `mvn test -Dsuite=contrato` |
| Teste funcional | `mvn test -Dsuite=funcional` |
| Todos testes | `mvn test` |
| Passando o ambiente | `mvn test -Denv=en` |

Obs.: O ambiente de execução default é a versão PT, para executar na versão EN o parametro -Denv=en deve ser adicionado na chamada.
