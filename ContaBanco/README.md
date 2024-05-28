Descrição do Desafio
Neste desafio, separei o código em dois arquivos: um para a classe principal (Contador) e outro para a definição da exceção personalizada (ParametrosInvalidosException).

Arquivo Contador:
Criei o método ContaNumeros, que recebe dois parâmetros inteiros. Esse método realiza a iteração do primeiro parâmetro até o segundo e contém a lógica para lançar a exceção ParametrosInvalidosException se o primeiro parâmetro for maior que o segundo.

- Arquivo ParametrosInvalidosException:
Defini uma exceção personalizada que é lançada quando a condição de parâmetros inválidos é detectada.

- Entrada do Usuário:
Utilizei a classe Scanner para capturar os números digitados pelo usuário.

- Repetição da Entrada:
Implementei um loop while que permite ao usuário tentar novamente caso o primeiro parâmetro digitado seja maior que o segundo. O loop continua até que uma entrada válida seja fornecida, momento em que a contagem dos números é exibida.

- Tratamento de Erros:
Usei um bloco try-catch para capturar e tratar a exceção ParametrosInvalidosException caso o usuário insira um primeiro parâmetro maior que o segundo.

## Tecnlogia utilizada

<img align="center" alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
