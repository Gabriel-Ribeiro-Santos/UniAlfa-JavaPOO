# Exercícios - AWT, Swing e JavaFX

**Descrição:** Questões sobre bibliotecas gráficas em Java (AWT, Swing e JavaFX).
Clique no título de cada questão para revelar a resposta e uma breve explicação.

---

#### Questão 1:

**O que siginifica a sigla AWT em Java ?**

- a) Abstract Window Toolkit.
- b) Advanced Window Tools.
- c) Application Window Toolkit.
- d) Active Window Technology.

<details>
<sumary>Resposta:</sumary>

- a) Abstract Window Tollkit

**_Explicação:_** AWT é a biblioteca antiga de componentes GUI do Java, cujo nome oficial é **_Abstract Window Tollkit_**.

</details>

---

#### Questão 2:

**Qual classe do AWT representa uma janela principal?**

- a) Frame.
- b) Window.
- c) Dialog.
- d) Panel

<details>
<sumary>Resposta:</sumary>

- a) Frame

**_Explicação:_** 'java.awt.Frame' é a classe que representa uma janela principal com barra de título e bordas no AWT.

</details>

---

#### Questão 3:

**No AWT, qual componente é utilizado para capturar entrada de texto de uma única linha?**

- a) TextArea.
- b) TextField.
- c) Label.
- d) Button.

<details>
<sumary>Resposta:</sumary>

- b) TextField.

**_Explicação:_** 'TextField' é para uma única linha; 'TextArea' é para múltiplas linhas.

</details>

---

#### Questão 4:

**Em Swing, todos os componentes são derivados de qual classe base ?**

- a) Component.
- b) JComponet.
- c) Container.
- d) JFrame.

<details>
<sumary>Resposta:</sumary>

- b) JComponent

**_Explicação:_** Em Swing, a maioria dos componentes visuais herda de 'javax.swing.JComponent'. (Alguns ainda derivam de AWT 'Component' por compatilibilidade.)

</details>

---

#### Questão 5:

**Qual é a diferença principal entre AWT e Swing?**

- a) Swing é multiplataforma, AWT não é.
- b) Swing é baseado em AWT, mas é leve e mais personalizável.
- c) AWT possui mais componentes que Swing.
- d) AWT é mais rápido que Swing.

<details>
<sumary>Resposta:</sumary>

- b) Swing é baseado em AWT, mas é leve e mais personalizável.

**_Explicação:_** Swing foi construído sobre AWT, oferece _lightweight components_ (renderizados em Java) e maior capacidade de customização.

</details>

---

#### Questão 6:

**Em Swing, qual componente representa uma caixa de seleção (checkbox)?**

- a) JCheckBox.
- b) JRadioButton.
- c) JComboBox.
- d) JTextField.

<details>
<sumary>Resposta:</sumary>

- a) JCheckBox.

**_Explicação:_** 'JCheckBox' é o componente checkbox; 'JRadioButton' é para seleção exclusiva.

</details>

---

#### Questão 7:

**O método 'setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)' em um JFrame define:**

- a) O tamanho inicial da janela.
- b) A ação ao clicar no botão de fechar.
- c) A cor de fundo da janela.
- d) O título da janela.

<details>
<sumary>Resposta:</sumary>

- b) A ação ao cliclar no botão de fechar.

**_Explicação:_** Esse método define o comportamento (por exemplo, encerrar a aplicação) quando usuário fechar a janela.

</details>

---

#### Questão 8:

**Em JavaFX, qual classe é obrigatória para iniciar uma aplicação gráfica?**

- a) Application.
- b) Stage.
- c) Scene.
- d) Node.

<details>
<sumary>Resposta:</sumary>

- a) Application.

**_Explicação:_** Você estende 'javafx.application.Application' e sobrescreve 'start(stage primaryStage)'.

</details>

---

#### Questão 9:

**Em JavaFX, o objeto Stage representa:**

- a) Um container de elementos gráficos (janela principal).
- b) Uma cena dentro da janela.
- c) Um botão interativo.
- d) Um layout de grid.

<details>
<sumary>Resposta:</sumary>

- a) Um container de elementos gráficos (janela principal).

**_Explicação:_** 'Stage' é a janela; 'Scene' contém os elementos (nós) dentro do Stage.

</details>

---

#### Questão 10:

**No JavaFX, qual é o papel da classe Scene?**

- a) Controlar a execução da aplicação.
- b) Definir a estrutura e os elementos exibidos no Stage.
- c) Carregar bibliotecas externas.
- d) Manipular eventos de mouse e teclado.

<details>
<sumary>Resposta:</sumary>

- b) Definir a estrutura e os elementos exibidos no Stage.

**_Explicação:_** 'Scene' contém a árvore de nós (controls, layouts) que serão exibidos no 'Stage'.

</details>

---

#### Questão 11:

**Para criar uma aplicação JavaFX, qual método da classe Application deve ser sobrescrito?**

- a) start(Stage primaryStage).
- b) init().
- c) launch(String[] args).
- d)main(String[] args).

<details>
<sumary>Resposta:</sumary>

- a) start(Stage primaryStage).

**_Explicação:_** 'start' recebe o 'Stage' principal; 'init' e 'main' têm papéis secundários.

</details>

---

#### Questão 12:

**No Swing, qual layout organiza componentes em linha, da esquerda para a direita ?**

- a) FlowLayout.
- b) BorderLayout.
- c) GridLayout.
- d) BoxLayout.

<details>
<sumary>Resposta:</sumary>

- a) FlowLayout.

**_Explicação:_** 'FlorLayout' posiciona componentes em linha (flow), normalmenteda esuqerda para a direita.

</details>

---

#### Questão 13:

**Em JavaFX, qual pacote contém os controles de interface (como Button, Label, TextField)?**

- a) javafx.stage.
- b) javafx.scene.control.
- c) javafx.secene.layout.
- d)javafx.event.

<details>
<sumary>Resposta:</sumary>

- b) java.scene.control.

**_Explicação:_**

</details>

---

#### Questão 14:

**Qual destes é um exemplo de evento em JavaFX?**

- a) ActionEvent.
- b) WindowListener.
- c) KeyAdapter.
- d) MouseMotionListener.

<details>
<sumary>Resposta:</sumary>

- a) ActionEvent.

**_Explicação:_** 'ActionEvent' é usado em controles (ex: botão). As outras opções são tipos de listeners/AWT/Swing.

</details>

---

#### Questão 15:

**Qual biblioteca Java foi criado mais reventemente para GUIs e subtitui gradualmente Swing e AWT?**

- a) SWT.
- b) JavaFX.
- c) JDK UI.
- d) JApplet.

<details>
<sumary>Resposta:</sumary>

- b) JavaFX.

**_Explicação:_** JavaFX é a biblioteca mais nova (desde Java 8 ganhou suporte amplo) para GUIs modernas em Java.

</details>

---
