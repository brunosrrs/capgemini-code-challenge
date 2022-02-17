<h1 align="center">Desafio de programação - Academia Capgemini</h1>

Primeiros passos: 

1. Requerimentos 

    - JDK 11    
    - Maven
    
2. As questões estão dividas em pastas separadas.

## 🛠️ Abrir e rodar o projeto

- Após clonar o repositório, você pode abrir com a IDE de escolha, cada questão separadamente.
- Inicialmente a IDE deve executar algumas tasks, para a configuração do ambiente.

## 📁 Question 1 - Stair

- Dado um valor de entrada n(inteiro), o algoritmo mostra na tela uma escada de base e altura iguais a n.
- Exemplo:

Entrada:
```java
Enter an integer : 6
```
Saída:
```
You entered 6

--- Building up stairs 📏 ---
     *
    **
   ***
  ****
 *****
******
```

## 📁 Question 2 - Password

- Dado uma string aleatória no campo de senha, o algoritmo retorna o número mínimo de caracteres que devem ser adicionados para a string ser considerada uma senha segura. Uma senha é considerada segura quando: possui no mínimo 6 caracteres, contém 1 dígito, contém no mínimo 1 letra em maiúsculo, contém no mínimo 1 letra em minúsculo e contém no mínimo 1 caractere especial. Os caracteres especiais são: **!@#$%^&*()-+**

- Exemplo: 

Entrada:
```java
Type your password: Ya3
```
Saída:
```
Missing special character.
Not safe password! ❌
Add 3 more character(s).
```
Entrada:
```java
Type your password: Ya3%ab
```
Saída:
```
Safe password! ✔
```

## 📁 Question 3 - Anagram

- Dado uma string, o algoritmo deve retornar a quatidade de substrings pares que são anagramas.
- Exemplo: 

Entrada:
```java
Type a word: ifailuhkqq
```
Saída: 
```
3
```
*Explicação - As substrings pares que são anagramas são: [i,i], [q,q], [ifa, fai].*

