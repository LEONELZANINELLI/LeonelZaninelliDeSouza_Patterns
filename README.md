Design Patterns — Estilos Arquiteturais
Implementação prática de três padrões de projeto (GoF) em Java, contemplando uma solução para cada categoria clássica: Criacional, Estrutural e Comportamental.
Estrutura do Projeto
Categoria	Pattern	Pacote / Pasta	Cenário Implementado
Creational (Criacional)	Builder	`Creational_builder/`	Montagem passo a passo de computadores personalizados (Básico e Gamer) com componentes opcionais.
Structural (Estrutural)	Decorator	`Structural_Decorator/`	Composição dinâmica de canais de notificação (Email, SMS e Slack) em tempo de execução.
Behavioural (Comportamental)	Observer	`Behavioural_Observer/`	Estação meteorológica (`WeatherStation`) notificando automaticamente múltiplos módulos (`ConsoleDisplay` e `FanController`) com inscrição e remoção dinâmica.
Como Executar
Pelo IntelliJ IDEA
Abra a pasta do projeto (ou importe a pasta `src` como Sources Root).
Abra a classe `Main.java` dentro do pacote desejado (`Creational_builder`, `Structural_Decorator` ou `Behavioural_Observer`).
Clique no ícone verde de Run ao lado do método `main`.
Pelo Terminal
A partir da raiz dos pacotes (`src/`):
```bash
# Compilar todos os pacotes
javac Creational_builder/*.java Structural_Decorator/*.java Behavioural_Observer/*.java

# Executar cada padrão
java Creational_builder.Main
java Structural_Decorator.Main
java Behavioural_Observer.Main
```
