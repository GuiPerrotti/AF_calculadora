# 🧮 Calculadora — Versão Refatorada

## 📌 Descrição Geral
Este repositório contém a versão refatorada da calculadora desenvolvida em Java.  
O objetivo desta etapa foi aplicar conceitos de código limpo, boas práticas e princípios de orientação a objetos, tornando o código mais organizado, legível e fácil de manter.

---

## 🗂 Estrutura do Projeto

src/
└── calculadora/
├── Calculadora.java # Classe principal com operações isoladas
└── TesteCalculadora.java # Classe de execução e validação no console

docs/
└── javadoc/ # Documentação gerada automaticamente

yaml
Copy code

---

## 🧠 Melhorias Implementadas na Refatoração

- ✔ **Responsabilidade única (SRP):** cada operação matemática possui seu próprio método.
- ✔ **Código mais limpo:** remoção de `if/else` encadeados, substituindo por `switch`.
- ✔ **Métodos puros:** sem alteração de estado e sem variáveis globais desnecessárias.
- ✔ **Tratamento de erros:** agora operações inválidas disparam exceções claras.
- ✔ **Documentação:** JavaDoc aplicado sobre métodos e classes.
- ✔ **Testabilidade:** lógica isolada e facilitando expansão futura (por exemplo, módulo, potência, raiz etc).

---

## ▶ Como Compilar e Executar

### 🔧 Compilar o Projeto
```sh
javac src/calculadora/*.java
▶ Executar a Calculadora
sh
Copy code
java -cp src calculadora.TesteCalculadora
📝 Gerar JavaDoc
sh
Copy code
javadoc -d docs src/calculadora/*.java
📷 Saída Obtida Após a Execução
matlab
Copy code
5
3
9
4
Divisão por zero não é permitida.
Operador inválido: %
<img width="765" height="279" alt="image" src="https://github.com/user-attachments/assets/1ca5b07e-b74f-4695-9507-6a0825e0b67d" />
