# mutation-test
***Projeto simulando cenários de cobertura de teste unitários e utilização do pitest(teste de mutação) para analise dos testes unitários (efetividade, eficiência e/ou suficientes).*** 

### Exemplo dos cenários para os testes
Uma aplicação onde são vendidos vários produtos seguindo as seguintes regras: 
> Se comprar menos de 10 unidades
> > O valor do produto será 23,00

> Se comprar 10 ou mais unidades
> > O valor do produto será 17,00
 
> Se possir um cupom de desconto
> > O valor do produto será 17,00

## For running jacoco (Java Code Coverage):
***Biblioteca do java para cobertura de teste***
>> ./gradlew build jacocoTestReport
#### ***build/reports/jacoco***

## For running mutation tests run:
***Ferramenta para realização de testes de mutação***
>> ./gradlew clean pitest
#### ***build/reports/pitest***

### Analise de Código
Projeto configurado no sonarCloud 
* [Sonar Cloud](https://sonarcloud.io/project/overview?id=diegomachadoti_python-api-test)

### Referência
* [Kotlin](https://kotlinlang.org/)
* [Jacoco](https://www.eclemma.org/jacoco/)
* [Pitest](https://gradle-pitest-plugin.solidsoft.info/)