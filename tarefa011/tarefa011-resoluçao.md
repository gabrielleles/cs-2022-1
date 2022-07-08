### Padrões de Codificação

De uma maneira geral é possível inferir que os padrões de codificação, são uma forma de agrupar e descrever algumas práticas de codificação, com o objetivo de manter as implementações inteligíveis, consistentes e com qualidade. O seu uso é considerado como uma boa prática no desenvolvimento de software, e por isso a aprendizagem e utilização desses padrões é vastamente recomendada.

Sua utilização, além de aumentar a produtividade do projeto, ainda auxilia nos processos de desenvolvimento, retirada de bugs, atividades de validação, manutenção, etc. Inclusive, existe uma grande variedade de padrões, sendo que cada organização escolhe qual vai utilizar, ou em alguns casos até cria seu próprio padrão.

Alguns exemplos de padrões bastante utilizados são em relação aos comentários, identação, espaços em branco, quebra de linha, organização de classes e nomenclaturas. No caso da nomenclatura, por exemplo, em javascript, utilizamos o padrão lowerCamelCase, em que as variáveis devem começar com letra minúscula e para cada palavra, a primeira letra deve ser maiúscula. Exemplo:
* let nome;
* let nomeFuncionario;
* let i = 0;

### Reflexão

Dentro do contexto estudado em ciência da computação , a programação reflexiva ou reflexão é a capacidade de um processo de examinar, introspectar e modificar sua própria estrutura e comportamento. É amplamente utilizado no auxílio para a criação de bibliotecas de software genéricas para exibir dados, processar diferentes formatos de dados, realizar serialização e desserialização de dados para comunicação, ou agrupar e desmembrar dados para contêineres e rajadas de comunicação. Como ele permite que ocorra inspeção de classes, métodos, propriedades e tipos de dentro do seu sistema, é muito utilizado no âmbito do paradigma orientado a objetos, permitindo a modificação do código base em tempo de execução.

Um exemplo prático de sua utilização é na realização de testes. Como em uma classe os métodos classificados como private ou protected geralmente não são testáveis, a utilização da reflexão torna esses métodos públicos, permitindo sua testagem. 

Exemplo de utilização utilizando a linguagem Java: 

~~~

using namespace System;
int main() {
  Int32 i = 100;
  Object ^ o = i;
  Console::WriteLine("type of i = '{0}'", o->GetType());
}

~~~

### Programação Defensiva

Geralmente se espera que um software funcione com entradas e saídas de dados de uma determinada maneira. Nem sempre as coisas fluem do jeito que o desenvolvedor pensou, muitas vezes a entrada de dados vêm com um dado formatado diferente do planejado e erros do tipo.

Pensando nisso e, para proteger o software dos possíveis erros do usuário e dos desenvolvedores, se usa a programação defensiva.

A programação defensiva define algumas regras, dentre elas a principal:

- Nunca confie nos dados inseridos pelo usuário: todos os dados enviados por fontes externas têm que passar por um forte critério de formatação caso seja necessário que esse dado possua determinado formato pré-definido.

A tratativa de erros causados por entradas falhas de dados do usuário pode ser feita de diversas maneiras. Se um usuário deve inserir uma data de nascimento no formato DD/MM/AAAA e insere AAAA-MM-DD o software deve: reconhecer o erro e corrigir automaticamente; ou retornar um valor padrão caso seja identificado que a entrada foi errada; ou lançar uma exceção que interrompa o fluxo da aplicação no momento do erro.

  ```c++
  class UserDomain{
    public:
      void CreateUser(std::string name, std::string email, std::string cpf);
  }
  ```
  Neste exemplo, por exemplo, é preciso validar o email e o cpf. 