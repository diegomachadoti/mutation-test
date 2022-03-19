#mutation-test
Projeto simulando testes de mutação

###Exemplo dos cenários para os testes
Uma aplicação onde são vendidos vários produtos seguindo as seguintes regras: 
> Se comprar menos de 10 unidades
> > O valor do produto será 23,00

> Se comprar 10 ou mais unidades
> > O valor do produto será 17,00
 
> Se possir um cupom de desconto
> > O valor do produto será 17,00

## For running mutation tests run:
>> ./gradlew clean pitest

## Reports are generated under 
>> 'build/reports/pitest'

### Analise de Código
Projeto configurado no sonarCloud
> https://sonarcloud.io/project/overview?id=diegomachadoti_python-api-test