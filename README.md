# 🧮 Calculadora Java — Projeto Refatorado

Projeto desenvolvido para praticar lógica, organização de código e princípios de boas práticas em Java.  
A versão final possui melhorias de estrutura, legibilidade e tratamento de erros.

---

## 📁 Estrutura do Projeto

 projeto_calculadora
┣  src
┃ ┗  calculadora
┃ ┣  Calculadora.java
┃ ┗  TesteCalculadora.java
┣  docs
┃ ┗  resultado.png (execução)
┗  README.md

---

## ✨ O que foi melhorado

- Código reorganizado e mais limpo
- Métodos separados para cada operação ➝ **responsabilidade única**
- Troca de `if/else` encadeado por **switch**
- Tratamento de exceções (`IllegalArgumentException`)
- Documentação com JavaDoc
- Facilita manutenção e futuras expansões

---

## 🧠 Conceitos Aplicados

| Conceito | Aplicação |
|---------|-----------|
| SRP (Single Responsibility Principle) | Cada operação está em seu próprio método |
| Clean Code | Nomes claros, métodos curtos e organizados |
| Tratamento de erros | Exceções ao invés de mensagens fixas |
| Testabilidade | Classe de teste isolada |

---

## ▶ Como executar

### 🔹 1) Compilar
```sh
javac src/calculadora/*.java
🔹 2) Rodar
sh
Copy code
java -cp src calculadora.TesteCalculadora
🔹 (Opcional) Gerar JavaDoc
sh
Copy code
javadoc -d docs src/calculadora/*.java

Print do terminal:

<img width="765" height="279" alt="image" src="https://github.com/user-attachments/assets/92907efc-3b5b-4515-b663-9c7d3ac3a280" />

Saída registrada no terminal:

matlab
Copy code
5
3
9
4
Divisão por zero não é permitida.
Operador inválido: %
