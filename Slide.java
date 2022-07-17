//Modelo para Padronização dos Materiais de Apoio das Linguagens

/*

        COMPILAR

    Linux:    javac Arquivo.java
              java  Arquivo

    Windows:  run no VsCode

0  -  Sobre a Linguagem

    Alan Kay era matemático e biólogo criou o paradigma em 1970

    Cada célula se comporta como uma unidade e interage com outras através de mensagens Cada coisa do mundo real é um objeto que se comporta como uma célula

    Esses objetos percentem a classes,que agrupam objetos similares e servem como repositorio para seu comportamento,assim como são classificados os seres na natureza



1  -  Local de cada coisa no código

    import biblioteca

    package pasta_a_qual_pertence

    modificadores classe Nome
    {
        estado-atributos 
        
        tipo nome;

        comportamento-metodos modificador tipo_retornado nomeNome( ){ }

        construtor

        main( ){ }
    }



2  -  Comentarios

    //      comentario de linha
    /*      comentario de multilinhas * /
    /**/ comentario java doc

    /* 



3  -  Atribuição

    ou Instancia de Classe
    
    =
    
    Class Identificador=new Class();



4  -  Tipos de Dados

    Primitivos

        int double 11034.587694 //double declara com . e faz a leitura com , 64bits
        float 23.444F //float declara com . e faz a leitura com , 32bits
        bool //se escreve true ou false, minusculas, e nao aceita 0 ou 1
        char'a' //deve ser utilizado com aspas simples ou o codigo em hexadecimal, unicode da letra '\u004E' e  cuidado com o intervalo valido 65535, acima disso usar (char) 70000
        byte //inteiros ou negativos, requer 8 bits, valor máximo 127, mínimo -128.

    Não Primitivos

        String s=new String("abcde")ou String s="abcde"
        //objeto, e deve ser utilizado com aspas duplas, depois de declarado é imutavel, dizem hahaha




5  -  Modificadores

    short //
    long

    public private protected

    default     //apenas quem esta no pacote acessa e manipula
    final       //define a variavel como constante
    abstract

    static



6  -  Variavel e Constante

    ou identificador

    variavel 
    variavelVariavel 
    nomeMetodo 
    CONSTANTE

    variavel de instancia(nao estático)(public,private,protected) //unico pra cada instancia de classe, uma variavel é independente da mesma variavel de outro objeto

    variavel de classe(estaticas)(static) //compartilha o mesmo valor da variavel com todas as instancias daquela classe

    variavel local //funciona como o nome diz, somente no local onde foi declarada, criada e destruida junto com o bloco

    parâmetro(primitiva,referencia,var-arg) //var-arg sao sempre os ultimos a serem declarados e nao mais que um por metodo -> tipo... variavel



7  -  Declaração

    identificador==nome da variavel

    Atributo modificadores_de_acesso outros_modificadores tipo identificador=dado;

    Classe modificadores

    class identificador { }

    Metodo modificadores_de_acesso outros_modificadores tipo_de_retorno
    identificador ( parametros ) { }

    Constante modificadores_de_acesso

    static final tipo IDENTIFICADOR;

    Construtor public nome_da_classe ( parametros ) { corpo do construtor }

    int[] vetorNumeros = new int[quantidade]

    int[] vetorNumeros = {1, 2, 3, 4, 5}

    String[] nomes = {Daniel, Andre, João};

    numeros = new float[10];

    public static int somaDosElementosDoArray (int[] idadeAlunos) { }

    

8  -  Operadores (matematicos, logicos, comparacao)

    MATEMATICOS

        + soma
        - subtracao
        multiplicacao
        / divisao
        % resto da divisao (modulo)
        ++ incremento
        -- decremento
      
        + no print concatena
  
  
    LOGICOS
  
        && e(and)
        || ou(or)
        ! não(not)
  
  
    DE COMPARAÇÃO
  
      > maior que
      < menor que
      >= maior ou igual
      <= menor ou igual
      == igual
      != não igual (diferente)
  
  
    TERNARIO
  
        variavel = (expressao booleana) ? valor para true : valor para false ;



9  -  Impressao

    System.out.println()



10  -  Escaneamento

    import java.util.Scanner; importando a biblioteca
  
    Scanner leitor = new Scanner(System.in); criando scanner para leitura,
        instanciando objeto
  
    String nome = leitor.nextLine(); lendo a linha que digitar ou a proxima linha
        completa
  
    leitor.nextInt(); lendo um inteiro
  
    leitor.nextDouble(); lendo um double, tem que escrever 2,5



11  -  Estruturas 

    Condicionais

        if ( ) { } lembra um pouco como é no C
  
        else if ( ) { } mesma coisa
  
        else { } mesma coisa
  
        (expressao) ? true : false; faz o que esta em true se a expressao for
        verdadeira
        faz o que esta em false se a expressao for falsa
  
        switch (caso) { } caso x: código; break; default: codigo;
  
  
    DE REPETICAO
  
        while (condição) {faça} enquanto a condição for verdadeira fará
  
        do {faça} while (condição); primeiro faz depois verifica
  
        for (inicialização;condição;iteração) { }
  
        for (variavel : array) { } "for each" inicializa com 0 e so termina depois de
        percorrer todo o array
  
  
    Saída do Loop
  
        break; pula para a primeira declaração do for
  
        return; volta para o método que chamou
  
        System.exit() para o programa todo, a maquina virtual se encerra
  
        continue; para a iteração atual e vai para a próxima



12  -  Bibliotecas

    java.util.Calendar
  
    java.util.DateFormat
  
    java.util.Locale

    java.util.ArrayList

    import java.util.Random;



13 - Estrutura de Dados

    Lista/Array

    Arrays.toString(array) - Esse método recebe uma array como parâmetro e retorna a array em forma de String.
    Arrays.sort(array) - Esse método recebe uma array e ordena ela.
    Arrays.copyOf(array, novoTamanho) - Esse método recebe uma array e um novo tamanho e como retorno tem a mesma array com o tamanho novo passado.


    Matriz

    int[][] variosNumeros = new int[2][3];


14  -  Função e Parâmetro

    public static tipo_retornado nomeFunção ( tipo parâmetro )
    {
        corpo da funcao

        return
    }



15  -  Tipos específicos da linguagem

    Expressão Lambda        como forma de reduzir uma função em uma expressão

    ArrayList<String> arraylist = new ArrayList<String>()

    forma antiga

        arrayList.foreach(function(String e) {
        System.out.println(e);
        })


    com expressão lambda

        arrayList.foreach(string -> System.out.println(string));


    mais reduzido ainda

        arrayList.foreach(s -> System.out.println(s))

        arrayList.foreach(System.out::println)



16  -  Ponteiro

17  -  Alocação Dinâmica

18  -  Leitura e Escrita em arquivo

19  -  Topicos Avançados (macro,construir biblioteca,compilação)

20  -  Teoria

    Objeto

        tudo que há no mundo é um objeto, uma pessoa, um alimento, um carro, o ar
        ele é a instancia de uma classe
        por exemplo temos a Classe pessoa, os atributos são tudo que há na pessoa, altura, idade, nome...
        e os métodos são todas as coisas que a pessoa pode fazer, falar, andar, respirar, dizer o nome, pular...


    Classe

        é a fôrma para tudo, como agrupamos objetos, assim como a ideia de reino classe filo
        um cachorro é um animal que é um ser vivo, e uma pessoa é um ser humano que é um ser vivo
        cachorro é uma classe filha da classe animal que é filha da classe ser vivo
        cada classe contem atributos e métodos
        atributos são suas catacteristicas, seu estado, e métodos são as coisas que ela pode executar, seu comportamento, verbo
        instanciar uma classe é fazer como quando uma criança nasce, a gente da vida aquele objeto dizendo a que classe ele pertence

        Relacionamento

            um objeto da classe carro contém quatro objetos da classe roda
            um objeto roda pode estar associado a um objeto da classe carro

            basicamente as formas de relacionamento são:

            um para um

                um carro estaciona em uma vaga / uma vaga é estacionavel por um carro

            um para muitos

                um inquilino aluga muitos apartamentos / um apartamento é alugado por um inquilino

            muitos para um

                um aluno pertence a uma turma / uma turma contem muitos alunos

            muitos para muitos

                um ator estrela muitos elencos / um elenco é estrelado por vários atores

            parte - todo

                um capitulo é parte de um livro / um livro é composto de vários capítulos


    Agregação

        quando se compartilha um objeto parte com varios objetos todo
        como se um capitulo fosse o mesmo para váris livros
        ou se pensarmos melhor quando um trecho de um estudo é citado em vários outros artigos
        temos uma parte compartilhada com varios todo


    Composição

        quando um objeto parte pertence apenas a um objeto todo
        esse objeto todo ao ser destruido tambem destroi todos os objetos parte


    Ensapsulamento

        é quando definimos o tipo de restrição do comportamento de um objeto
        se quem terá acesso a ele será somente o objeto, todos, ou só ele e seus filhos
        em resumo podemos definir a restricão em privado, publico ou protegido
        isso pode ser encapsulamento

        ou encapsulamento pode ser o fato de definirmos metodos para a modificação dos atributos do objeto
        por exemplo, voce não pode chegar e mudar a minha roupa, eu que tenho que mudar minha própria roupa
        e você irá comunicar isso a mim através de uma mensagem me dizendo para mudar a roupa


    Polimorfismo

        quando duas ou mais classes distintas tem métodos de mesmo nome e podemos usar o metodo de qualquer objeto

        imagine que um ser vivo tenha o metodo respirar
        o cachorro e o peixe respiram diferentes, mas os dois recebem o metodo respirar por serem seres vivos
        ao invocar o metodo respirar do ser vivo de qualquer um dos objetos
        o polimorfismo atribuira o metodo correto a invocação


    Herança

        segue o mesmo principio de classe reino filo etc
        onde cada objeto herda todas as caracteristicas de sua classe e aquelas do qual ele pertence que estao acima
        como um avo que gera um pai que gera um neto
        o neto tera caracteristica do pai e do avo, o pai tera do avo e o avô... herda de Object, que é a classe primeira de todas as coisas hahaha
        para programar é usado o filho extendes pai, pai extends avô
        e as heranças ocorrem com o public e o protected


    Composição

        como o próprio nome diz compor
        um objeto parte compõe um objeto todo, e quando o objeto todo é destruido suas partes também são

        

*/