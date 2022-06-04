1. Qual o comando para obter a versão instalada do Git?

	git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?

  a. git help
  
	Mostra alguns comandos comumente usados
	
  b. git help checkout
  
	Mostra o manual do checkout
	
  c. git help merge
  
	Mostra o manual do merge
	
  d. git init
  
	Cria um repositório Git vazio ou reinicializa um já existente
	
  e. git add --all
  
	Adiciona todos arquivos ou mudanças no repositorio para a staging area
	
  f. git add -u
  
	Adiciona apenas os arquivos atualmente modificados a 'staging' area e checa se foram deletados, se sim eles sao removidos da area
	
  g. git config -l
  
	Lista todas as variáveis definidas no arquivo de configuração, junto com seus valores.
	
  h. git mv a.txt b.txt
  
	Renomeia de a para b
	
  i. git reset --hard
  
	Reverte todas as alterações no diretorio para o ultimo commit
	
  j. git log -27
  
	Exibe os ultimos 27 commits
	
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

	git add --all para adicionar todas as mudanças ou git add "nome-do-arquivo" para adicionar apenas eles e git commit pra commitar tudo que foi adicionado

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
	
	git show

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
	
	git status

6. Qual o comando para efetuar um _commit_?
	
	git commit -m "comentário do commit"

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
	
	git checkout --teste.txt
	
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
	
	Você pode criar um arquivo .gitignore arquivo no diretório-raiz do seu repositório para dizer ao Git quais arquivos e diretórios devem ser ignorados ao fazer um commit.
	
9. O que acontece se o seu repositório local for acidentalmente removido?
	
	Caso tenha sido commitado você perdeu seu repositório, deve clonar o remoto para seu local novamente. Caso não, voce pode utilizar git reset e git checkout para recuperar

10. Como clonar um repositório remoto?
	
	git clone link-do-repositorio

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
	
	git log --pretty=oneline

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
	
	.gitconfig 

13. Qual o comando para criar um repositório local?
	
	git init "nome_do_repositório"

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
	
	.git

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
	
	git add -u

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
	
	O git usa SHA1 com o propósito de segurança e de identificação de alterações nos arquivos. SHA1 é um algoritmo que recebe alguns dados como entrada e gera uma string única de 40 caracteres através desses dados. Ou seja, nenhuma outra entrada de dados deveria produzir o mesmo hash. Porém, caso a mesma entrada de dados seja usada, ela sempre irá produzir o mesmo hash.
	Isso é extremamente importante, pois o número de revisão do git é nessa hash SHA1, então mesmo que várias pessoas estejam usando o mesmo repositório, se o número de revisão for igual para todas elas, isso significa que todos estão trabalhando naquele mesmo conjunto de arquivos. Isso traz maior segurança, pois se qualquer alteração for realizada em qualquer bit que seja, ou mesmo durante a transferência dos arquivos, se ocorrer qualquer perda de bits, o git irá identificar.
	
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
	
	-abbrev-commit

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
	
	Nao pois os arquivos nao estão sendo monitorados pelo git

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
	
	**git reset --soft HEAD~1**: Reverte o ultimo commit da branch atual mas mantém as mudanças na sua arvore
	**git reset --hard**: Reverte todas as alterações no diretorio para o ultimo commit

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
	
	git clean -f

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
	
	.gitignore
	
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
	
	deve-se colocar a regra "*.class" no arquivo .gitignore

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando **git shortlog -sne**?
	
	Retorna as mensagens de log da saída padrão, mostrando somente o resumo da contagem do commit, ordenadas pelo número de commits por autor e mostrando o nome e email de cada autor

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
	
	Mostra o endereço do repositório remoto

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
	
	git tag 
	
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
	
	git tag -l "2.0*"
	
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
	
	Cria uma annotated tag ‘3.4-gold’ com a mensagem de tagging “minha versão ouro”

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
	
	Mostra os dados da tag e do commit

30. O que o comando **git push origin 3.4-gold** teria como efeito?
	
	Atualizaria o repositório remoto com o repositório local sob a tag 3.4-gold

31. Após executar um commit, qual o efeito de **git commit --amend**?
	
	Adiciona alterações ao ultimo commit

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
	
	Não commitará as mudanças no arquivo

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
	
	Descarta as mudanças que acabei de fazer

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
	
	o primeiro retira da staging area e o ultimo descarta as mudanças
