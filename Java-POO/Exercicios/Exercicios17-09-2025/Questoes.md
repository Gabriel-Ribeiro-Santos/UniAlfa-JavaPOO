# Lista de Questões de Programação em Java

## Questões

1. **BufferedReader - Cálculo de Desconto**  
   Usando a classe **BufferedReader** para entrada de dados, crie uma classe que receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto.
   - Fórmula: `valor do desconto = valor do produto * percentual de desconto / 100`

---

2. **Scanner - Diferença de Pontos no Campeonato**  
   Usando a classe **Scanner** para entrada de dados, faça uma classe que receba dois valores inteiros:

   - O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol.
   - O segundo valor corresponde à quantidade de pontos do time lanterna.

   Considerando que cada vitória vale 3 pontos, calcule o número de vitórias necessárias para que o time lanterna alcance (ou ultrapasse) o líder.

   - Exemplo: se os pontos forem **40** (líder) e **22** (lanterna), o resultado deve ser **6**, pois `(40 - 22) / 3 = 6`.

---

3. **JOptionPane - Cálculo do ITBI**  
   O **ITBI** é aplicado sobre o valor de um imóvel a ser negociado.

   - A base de cálculo será o **maior valor** entre:
     - o valor da transação (valor negociado)
     - o valor venal de referência (fornecido pela Prefeitura).

   Crie uma classe que receba:

   - Valor da transação
   - Valor venal
   - Percentual de imposto

   Após isso:

   - Encontre o **maior valor**
   - Aplique o percentual sobre ele
   - Mostre o **valor do imposto a ser pago**

   - Fórmula: `valor do imposto = maior valor * percentual / 100`

---

4. **JOptionPane - Cálculo de Média Escolar**  
   Usando a classe **JOptionPane** para entrada de dados, elabore uma classe que receba:

   - Nota da prova 1
   - Nota da prova 2
   - Nota de um trabalho

   Calcule e mostre:

   - A **média**
   - O **resultado final** (aprovado ou reprovado)

   - Fórmula: `média = (nota1 + nota2 + trabalho) / 3`
   - Critério: média mínima para aprovação é **6**.

---

5. **Aposentadoria - Idade e Tempo de Contribuição**  
   Regras:

   - **Idade mínima**:
     - Mulheres: 60 anos
     - Homens: 65 anos
   - **Tempo de contribuição mínimo**:
     - Mulheres: 30 anos
     - Homens: 35 anos

   Elabore uma classe que receba:

   - Idade da pessoa
   - Sexo
   - Anos de contribuição

   O programa deve:

   - Calcular quantos anos faltam para se aposentar, **ou**
   - Mostrar a mensagem: `"Você já tem o direito a aposentadoria"`.
