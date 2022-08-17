# Tarefa 018 - State Pattern - 10/08/2022

1. Considerando os links de pesquisa e exemplos de implementação do padrão de projeto State, solicita-se:
2. Identificação no projeto de API Rest, do seu grupo, quais funcionalidades poderão ter sua implementação melhorada através da utilização deste padrão de projeto.

Considerando os links de pesquisa e os exemplos de implementação. Identificamos que o padrão de projeo State pode ser implementado no objeto que representa um agendamento em nosso sistema. Um agendamento possui os seguintes estados: disponível, indisponível e concluído. A alteração e verificação do estado poderá ocorrer no momento em que um novo agendamento estiver sendo cadastrado, caso o horário solicitado esteja indisponível o agendamento não é realizado. Se o horário solicitado estiver disponível ou concluído o estado é então alterado para indisponível e o agendamento é realizado.

*INSTRUÇÕES*
1. Criar a pasta "tarefa018", na branch de algum dos componentes do grupo.
2. Criar um arquivo chamado "tarefa018_internacionalizacao.md", neste arquivo deverão estar descritas as funcionalidades.
2. Commitar nesta branch o arquivo desta tarefa e fazer o merge com a branch develop.
2. O prazo para entrega desta tarefa é as 23h59min do dia 17/08/2022.