# Métodos Avançados de Programação

## UNIESP Faculdades

### Professora

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno
Rafael Ewerton F. de O. Coutinho


### Padrão Comportamental: 

## Padrão Template method
  Template Method - Define um esqueleto de um algoritmo dentro de um metodo,ele permite que as subclasses possam
redefinir alguns passos de um algoritmo sem alterar a sua forma estrutural, basicamente o template method,oferece
a definição de um algoritmo, no qual ele pode ser abstrato e possa ser implementado posteriomente por uma subclasse.


### Problema: 
  Em uma criação de aplicação de extração de dados coorporativos por exemplo, onde podera ser baixados em varios formatos
(pdf,doc,csv), e foi observado nessa aplicação que cada uma das classes criadas possuiam codigos parecidos,
embora a finalidade de lidar com os formatos seja m diferentes, mas para o processamento de dados e analise,
são quase identicos,seria melhor se livrar de vez dessas duplicações.

### Solução: 
  Com o padrão template method, ele sugere que você quebre o algoritmo em varias etapas, e transforme essas etapas
em metodos,colocando tambem uma serie de chamadas para esses metodos criados dentro de um unico "metodo padrão".
Essas etapas podem ser ABSTRATAS ou ter alguma implementação padrão.

### Consequências: 
  Quando transformado o algoritmo em um template method ele permite a transformação de um algoritmo monolitico,
em uma serie de etapas individuais, que podem ser facilmente estendidas por subclasses enquanto mantem a
estrutura consolidada por uma superclasse.

### Exemplo: 
  No exemplo a classe abstrata Treino, possui um metodo chamado de treinoDiario(), e seu maior objetivo é ser
 seguido por outras classes que lhe estende. O metodo final, ele não pode ser alterado ao decorrer do projeto, todos 
 os treinos deverão seguir as etapas. Portanto, nas classes concretas TreinoMeiaTemporada e TreinoInicioTemporada,
 implementam os metodos abstratos, preparoFisico(); e jogoTreino(); Os metodos podem ser alterados dependendo se o 
 treino for no inicio ou no meio da temporada, com isso cada metodo é implementado por sua classe especifica,sempre
 seguindo o esqueleto do algoritmo.
