Atividade oferecida em sala de aula, conforme enunciado abaixo, e modificada para treino de programação orientada a objetos (interface, polmorfismo e herança)

Você foi contratado para desenvolver um sistema simples de pedidos para uma loja fictícia
chamada "Loja Mala". Sua tarefa é criar um programa em Java que permita ao usuário fazer
pedidos de diferentes categorias de produtos, com base nos conceitos de fila. A loja oferece três
categorias de produtos: Roupas, Eletrônicos e Alimentos. O programa deve seguir as seguintes
especificações:
Requisitos:
1. Ao iniciar, o programa deve exibir uma mensagem de boas-vindas: "Bem-vindo à Loja Mala".
2. O usuário deverá inserir a quantidade de pedidos que deseja realizar.
3. Em seguida, o programa deverá exibir um menu com as três categorias de produtos disponíveis:
- 1: Roupas
- 2: Eletrônicos
- 3: Alimentos
4. Para cada pedido, o programa deverá exibir uma lista de itens disponíveis de acordo com a
categoria escolhida:
- Roupas: Camisa, Bermuda, Meias, Vestidos
- Eletrônicos: TV, DVD Player, Notebook
- Alimentos: Arroz, Feijão, Carne
5. O usuário deve inserir o nome do item que deseja adicionar ao carrinho.
6. O programa deve armazenar os pedidos em uma Fila.
7. Caso o usuário insira uma opção de categoria inválida, o programa deverá exibir a mensagem
"Entrada errada!!!!" e interromper o processo de pedidos.
8. Ao final, o programa deverá exibir o total de itens no carrinho e fila os itens escolhidos.
Exemplo de execução:
```
Bem-vindo à Loja Mala
Insira quantos pedidos você deseja: 2
Quais os pedidos?
1-Roupas
2-Eletrônicos
3-Alimentos
Opção: 1
Camisa
Opção: 2
Notebook
---------------------------
Total de itens no carrinho: 2
Camisa
Notebook
```
Observações:
- Utilize a classe `LinkedList<String>` para armazenar os pedidos.
- Utilize a classe `Scanner` para capturar as entradas do usuário
