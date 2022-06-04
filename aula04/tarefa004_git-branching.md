1. Qual o nome do branch padrão do Git?

main

2. O que o comando **<code>git branch nome</code>** realiza?

Mostra as branchs existentes

3. Como criar um branch a partir de um commit específico?

git checkout -b BRANCH_NAME COMMIT_ID
Com isso, um novo branch "BRANCH_NAME" será criado baseado no commit

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?

Cria e muda para uma nova branch chamada 'bugfix/234'

5. Qual o comando para se alternar para um branch de nome **experimento2**?

git checkout experimento2. Caso essa branch nao exista haverá um erro dizendo que nao há nenhuma branch com tal nome conhecida para o git

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?

O comando git branch mostra todas as branchs do repositório. nesse caso b1 e b2. A branch atual b1 será mostrada primeiro e destacada

7. O que o comando **<code>git checkout -b</code>** nome faz?

Sozinho nada. Esse comando requer um valor (colocado após o -b) para criar uma branch cujo nome será baseado nele

8. Qual a função do **<code>comando git branch -d teste</code>**?

Deleta a branch chamada teste

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.
	
	passo 1: git pull (atualiza o repositório local com o que estiver no remoto)
	
	passo 2: git checkout -b dev (cria e muda para a branch dev)
	
	passo 3: (cria o arquivo do experimento e faz as alterações necessarias)
	
	passo 4: git add experimento.txt (adiciona o arquivo experimento.txt para a staging area)
	
	passo 5: git commit -m "__MENSAGEM__" (realiza o commit)
	
	passo 6: git push (atualiza o repositório remoto com o que estiver no local)
	
	passo 8: git checkout -b dev2 (cria e muda para a branch dev2)
	
	passo 9: (arquivo experimento.txt é alterado) 
	
	passo 10: git add -A (adiciona todos os arquivos alterados para a staging area)
	
	passo 11: git commit -m "__MENSAGEM__" (realiza o commit)
   	
	passo 12: git checkout master (muda sua branch atual para a branch master)
	
	passo 13: git request-pull main dev (gera o pull request comparando a main com sua dev)
	
	passo 14: git merge dev (faz o merge da branch dev na main)
	
	passo 15: git request-pull main dev2 (gera o pull request comparando a main com sua dev)
	
	passo 16: git merge dev2 (faz o merge da branch dev2 na main)
	
	os passos de 3 a 5 podem ser repetidos o quanto for necessário assim como de 9 a 11 
