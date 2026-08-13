# Sistema de Pipeline de Processamento Financeiro

Este projeto demonstra a aplicação de três padrões de projeto clássicos em Java:

- **[Chain of Responsibility](ca://s?q=Explicar_Chain_of_Responsibility_em_Java)** → Pipeline de validações de transações.
- **[Strategy](ca://s?q=Explicar_Strategy_em_Java)** → Estratégias de cálculo de taxas.
- **[Factory Method](ca://s?q=Explicar_Factory_Method_em_Java)** → Criação de processadores de acordo com a origem dos dados.

## 🚀 Tecnologias
- Java 17+
- VS Code ou qualquer IDE compatível

## 📂 Estrutura de Diretórios


src/
├── chain/        # Padrão Chain of Responsibility
├── strategy/     # Padrão Strategy
├── factory/      # Padrão Factory Method
└── Main.java     # Classe principal


## ▶️ Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/PedroFrancelino/pipeline-financeiro.git


Compile os arquivos:

javac src/**/*.java



Execute o programa:
java -cp src Main


📊 Exemplo de Saída

Saldo suficiente validado.
Limite diário validado.
Nenhuma fraude detectada.
Transação aprovada!
Taxa calculada: R$ 5.0
Processando transação via JSON: {"amount":100}


📖 Aprendizado
Este projeto é ideal para estudantes e desenvolvedores que desejam:

Entender como aplicar padrões de projeto em cenários reais.

Criar sistemas modulares e extensíveis.

Usar boas práticas de engenharia de software em Java.


