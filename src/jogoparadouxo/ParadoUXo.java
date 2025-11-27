package jogoparadouxo;

import java.util.*;

public class ParadoUXo { 

    static String item1 = "ARCO E FLECHA COM CHAMAS";
    static String item2 = "POÇÃO DO CRESCIMENTO";
    static String item3 = "ESPADA DE PRATA";
    static String item4 = "CAPA DA INVISIBILIDADE";

    static int botãoDeSkip() { // Use quando precisar inserir um botão de "Próximo".
        Scanner input = new Scanner(System.in);
        int skip = 0;
        do {
            String skipString = input.next();
            switch (skipString) {
                case "1":
                    skip = 1;
                    break;
                default:
                    skip = -1;
                    System.out.println("Caractere inválido. Tente novamente.");
            }
        } while (skip < 0);
        return skip;
    }

    static int perguntas() { // Use para gerar um número aleatório de 1 a 4. (Necessário nas lutas contra boss para a aleatoriedade das perguntas)
        Random random = new Random();
        int aleatório = random.nextInt(4) + 1;
        return aleatório;
    }

    static void intervaloCurto() { // Use para gerar um delay de 2 segundos entre comandos.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void intervaloLongo() { //Use para gerar um delay de 5 segundos entre comandos.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static int opções() {
        Scanner input = new Scanner(System.in);
        int opções = 0;
        do {
            String opçõesString = input.next();
            switch (opçõesString) {
                case "1":
                    opções = 1;
                    break;
                case "2":
                    opções = 2;
                    break;
                case "3":
                    opções = 3;
                    break;
                case "4":
                    opções = 4;
                    break;
                case "5":
                    opções = 5;
                    break;
                default:
                    opções = -1;
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opções < 0);
        return opções;
    }

    static int aceitarArtefato() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        do {
            System.out.println("Aceitar artefato?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n");
            String escolhaString = input.next();
            switch (escolhaString) {
                case "1":
                    escolha = 1;
                    break;
                case "2":
                    escolha = 2;
                    break;
                default:
                    escolha = -1;
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha < 0);
        return escolha;
    }

    static int menu() {
        int opcões;
        do {
            System.out.println("\n                                                                       PARADOUXO \n");
            System.out.println("                                                                   1 -   Jogar");
            System.out.println("                                                                   2 - Instruções");
            System.out.println("                                                                   3 -  História");
            System.out.println("                                                                   4 -  Créditos");
            System.out.println("                                                                   5 -    Sair");
            opcões = opções();

            switch (opcões) {
                case 1:
                    System.out.println("Carregando...");
                    intervaloCurto();
                    break;

                case 2:
                    System.out.println("Instruções\n");
                    System.out.println("Ao enfrentar os desafios que aparecerão em sua jornada, você terá de responder a perguntas buscando derrotar o adversário.\nCada pergunta respondida com sucesso resultará em um dano infligido ao seu oponente. Porém, ao errar, o dano se voltará contra você.\nVenca todos os desafios para se tornar o Mestre do Conhecimento!\n");
                    System.out.println("Pressione 1 para retornar ao menu");
                    botãoDeSkip();
                    System.out.println("Retornando ao menu...\n");
                    intervaloCurto();
                    break;

                case 3:
                    System.out.println("História\n");

                    System.out.println("Nas distantes terras de Valfendor, um pequeno elfo chamado UserX se preparava para o que se tornaria uma história contada através dos séculos.\n"
                            + "Nascido em uma família simples e sem prestígio, num vilarejo pacato às margens do reino, UserX levava uma vida como tantas outras — regada à rotina, ao cansaço e à poeira do campo.\n"
                            + " Mas, diferente dos demais, havia nele um fogo silencioso que o impedia de se conformar. Queria entender o mundo e seus mistérios — desvendar tudo aquilo que ainda não se sabe.\n"
                            + "Até que, certo dia, como se o destino tivesse ouvido esse desejo, sua vida tomou um rumo que nem os deuses poderiam prever.\n");
                    System.out.println("Pressione 1 para retornar ao menu");
                    botãoDeSkip();
                    System.out.println("Retornando ao menu...\n");
                    intervaloCurto();
                    break;

                case 4:
                    System.out.println("Créditos\n");

                    System.out.println("Barbara Oliveira da Silva \n");
                    System.out.println("Bianca Meneses \n");
                    System.out.println("Camilly Quintino Ramos \n");
                    System.out.println("Davi Teixeira da Silva \n");
                    System.out.println("Kauane Miniro Coimbra \n");
                    System.out.println("Pressione 1 para retornar ao menu");
                    botãoDeSkip();
                    System.out.println("Retornando ao menu... \n");
                    intervaloLongo();
                    break;

                case 5:
                    System.out.println("Sair");
                    break;
            }
        } while (opcões != 1 && opcões != 5);
        return opcões;
    }

    static void DI(String item1) { // utilizar na primeira batalha

        System.out.println("VOCÊ GANHOU UM NOVO ITEM...\n");
        intervaloCurto();
        System.out.println("\n==== " + item1 + " ====");
    }

    static void IO(String item2) { // utilizar na segunda batalha

        System.out.println("VOCÊ GANHOU UM NOVO ITEM...\n");
        intervaloCurto();
        System.out.println("\n==== " + item2 + " ====");
    }

    static void GF(String item3) { // utilizar na terceira batalha

        System.out.println("VOCÊ GANHOU UM NOVO ITEM...\n");
        intervaloCurto();
        System.out.println("\n==== " + item3 + " ====");
    }

    static void SS(String item4) { // utilizar na quarta batalha

        System.out.println("VOCÊ GANHOU UM NOVO ITEM...\n");
        intervaloCurto();
        System.out.println("\n==== " + item4 + " ====");
    }

    static void utilizandoItem(){ 
        String[] itens = {"\nARCO E FLECHA COM CHAMAS\n", "\nPOÇÃO DO CRESCIMENTO\n","\nESPADA DE PRATA\n", "\nCAPA DA INVISIBILIDADE\n"};

        System.out.println("==== UTILIZANDO ITEM... ====");

        Random random = new Random();
        int item = random.nextInt(itens.length); 

        System.out.println(itens[item]);
    }

    static String[] emocoesUserX() { // coleta as emoções que o jogador sentiu durante a batalha

        Scanner input = new Scanner(System.in);

        String[] emocao = new String[4];

        System.out.println("\nIDENTIFICANDO AS EMOÇÕES DURANTE A BATALHA...\n");
        intervaloCurto();

        System.out.println("Em uma única palavra, o que você sentiu durante a batalha?");

        for (int i = 0; i <= 1; i++) {
            emocao[i] = input.nextLine();

        }

        return emocao;
    }

    static String[] relatorioEmocoes(String[] emocao) { // mostra todas as emoções que o UserX sentiu 

        System.out.println("==== RELATÓRIO FINAL DAS EMOÇÕES QUE O USERX SENTIU DURANTE O JOGO ==== \n");
        intervaloCurto();

        for (int i = 0; i < emocao.length; i++) {
            System.out.println((i + 1) + " - " + emocao[i]);

        }

        return emocao;
    }

    static int darkInterface() {
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int dark_interfaceHP = 100;
        String alternativas;

        System.out.println("Responda as questões corretamente para infringir dano ao seu oponente. Respostas incorretas resultarão em danos ao UserX");

        do {
            int perguntas = perguntas();
            System.out.println(">>> DARK INTERFACE <<<\n"
                    + "HP: " + dark_interfaceHP + "%");
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            switch (perguntas) {
                case 1:
                    System.out.println("   O que é a jornada do usuário?\n"
                            + "A) Um mapa que mostra as vendas realizadas por uma empresa em determinado período.\n"
                            + "B) Uma técnica de marketing usada apenas para atrair novos clientes.\n"
                            + "C) O caminho que o usuário percorre desde o primeiro contato com uma marca até a concretização de uma ação (como a compra).\n"
                            + "D) Um relatório financeiro que avalia o comportamento do consumidor.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta correta!");
                        dark_interfaceHP = dark_interfaceHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!");
                        vida = vida - 50;
                    }
                    break;

                case 2:
                    System.out.println("   Qual é o principal objetivo da jornada do usuário?\n"
                            + "A) Aumentar os preços dos produtos com base no comportamento do cliente.\n"
                            + "B) Reduzir os custos operacionais da empresa a qualquer custo.\n"
                            + "C) Compreender e otimizar a experiência do usuário em cada etapa de interação com a marca.\n"
                            + "D) Impedir que o cliente tenha contato com concorrentes.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta correta!\n");
                        dark_interfaceHP = dark_interfaceHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 3:
                    System.out.println("   Qual ponto da interface mais contribui para uma experiência positiva ao longo da jornada do usuário?\n"
                            + "A) A interface é complexa e cheia de elementos, o que torna a navegação desafiadora.\n"
                            + "B) A interface se adapta mal a dispositivos móveis, o que exige o uso de desktop.\n"
                            + "C) A interface é responsiva e se adapta bem a dispositivos móveis, facilitando a navegação.\n"
                            + "D) A interface possui poucos recursos visuais, o que evita distrações, mesmo que sacrifique a usabilidade.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta correta!\n");
                        dark_interfaceHP = dark_interfaceHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 4:
                    System.out.println("   O que é mais importante para garantir que a interface ajude o usuário durante sua jornada?\n"
                            + "A) Ter o maior número possível de elementos gráficos para impressionar o usuário.\n"
                            + "B) Utilizar textos técnicos e complexos para mostrar profissionalismo.\n"
                            + "C) Manter uma estrutura visual simples, com botões claros e navegação intuitiva.\n"
                            + "D) Esconder funcionalidades para tornar a interface mais “limpa”.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta correta!\n");
                        dark_interfaceHP = dark_interfaceHP - 50;

                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
            }
        } while (dark_interfaceHP > 0 && vida > 0);

        if (vida <= 0) {
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            intervaloCurto();
            System.out.println("GameOver\n");
            intervaloLongo();
            créditosFinais();
        } else {
            System.out.println("Você derrotou Dark Interface!");
            intervaloCurto();
            emocoesUserX();
            DI(item1);
        }
        return vida;
    }

    static int infinittusOptions() {
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int infinittus_optionsHP = 100;
        String alternativas;
        utilizandoItem();
        System.out.println("Responda as questões corretamente para infringir dano ao seu oponente. Respostas incorretas resultarão em danos ao UserX");

        do {
            int perguntas = perguntas();
            System.out.println(">>> INFINITTUS OPTIONS <<<\n"
                    + "HP: " + infinittus_optionsHP + "%");
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            switch (perguntas) {
                case 1:
                    System.out.println("   Como o excesso de opções pode impactar negativamente a tomada de decisão do usuário durante sua jornada em um site ou aplicativo?\n"
                            + "A) Torna a navegação mais intuitiva, já que há uma opção para cada perfil.\n"
                            + "B) Estimula a decisão rápida, pois o usuário se sente mais confiante.\n"
                            + "C) Facilita a escolha, pois oferece liberdade total ao usuário.\n"
                            + "D) Pode causar sobrecarga cognitiva, dificultando a decisão e gerando frustração.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("D")) {
                        System.out.println("Resposta correta!");
                        infinittus_optionsHP = infinittus_optionsHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!");
                        vida = vida - 50;
                    }
                    break;

                case 2:
                    System.out.println("   Qual é um possível ponto positivo de oferecer uma grande variedade de opções ao usuário?\n"
                            + "A) Reduz a necessidade de filtros e organização, pois o usuário encontra tudo sozinho.\n"
                            + "B) Aumenta a sensação de personalização e atende melhor a diferentes perfis de usuários.\n"
                            + "C) Elimina a necessidade de navegação, já que tudo está disponível de forma automática.\n"
                            + "D) Garante que todos os usuários farão a escolha certa sem dificuldades.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta correta!\n");
                        infinittus_optionsHP = infinittus_optionsHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 3:
                    System.out.println("   Em qual etapa da jornada do usuário o excesso de opções tende a ser mais prejudicial?\n"
                            + "A) Durante o carregamento da página, pois muitas opções aumentam a velocidade.\n"
                            + "B) Na etapa de pós-venda, onde o usuário já finalizou sua escolha.\n"
                            + "C) Durante a escolha de um produto ou serviço, quando o usuário precisa tomar uma decisão.\n"
                            + "D) No momento do login, já que muitas opções confundem o acesso ao sistema.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta correta!\n");
                        infinittus_optionsHP = infinittus_optionsHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 4:
                    System.out.println("   O que pode ser feito para reduzir o impacto negativo de muitas opções sem limitar a liberdade do usuário?\n"
                            + "A) Esconder opções para forçar escolhas rápidas.\n"
                            + "B) Usar filtros, categorias claras e recomendações personalizadas para organizar as opções.\n"
                            + "C) Exibir todas as opções na tela inicial, sem organização.\n"
                            + "D) Reduzir o número de opções ao mínimo, mesmo que não atenda todos os usuários.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta correta!\n");
                        infinittus_optionsHP = infinittus_optionsHP - 50;

                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
            }
        } while (infinittus_optionsHP > 0 && vida > 0);

        if (vida <= 0) {
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            intervaloCurto();
            System.out.println("GameOver\n");
            intervaloLongo();
            créditosFinais();
        } else {
            System.out.println("Você derrotou Infinittus Options!!");
            intervaloCurto();
            emocoesUserX();
            IO(item2);
        }
        return vida;
    }

    static int giantFear() {
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int giant_fearHP = 100;
        String alternativas;
        utilizandoItem();
        System.out.println("Responda as questões corretamente para infringir o seu inimigo");
        do {
            int perguntas = perguntas();
            System.out.println(">>> GIANT FEAR <<<\n" + "HP: " + vida + "%\n");
            switch (perguntas) {
                case 1:
                    System.out.println("Como uma boa jornada do usuário pode ajudar a diminuir o medo de tomar decisões erradas em um site ou aplicativo?\n"
                            + "A) Criando telas com poucas informações, para o usuário não pensar demais.\n"
                            + " B) Mostrando opções sem explicar o que cada uma faz.\n"
                            + " C) Oferecendo orientações claras, feedback em tempo real e segurança visual. \n"
                            + " D) Usando termos técnicos para mostrar autoridade.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta Correta!\n");
                        giant_fearHP = giant_fearHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
                case 2:
                    System.out.println("O que pode transformar a ansiedade do usuário em confiança durante a jornada digital?\n"
                            + "A) Design minimalista, sem explicações ou ajuda.\n"
                            + " B) Um fluxo claro, com etapas bem definidas, linguagem acessível e suporte disponível. \n"
                            + " C) Ofertas constantes para acelerar decisões.\n"
                            + " D) Formulários longos e complexos, para parecer mais completo.\n");

                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        giant_fearHP = giant_fearHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
                case 3:
                    System.out.println("Qual elemento da experiência do usuário ajuda a transformar um medo inicial em um sentimento de conquista ou realização?\n"
                            + "A) Fricções propositalmente criadas para filtrar usuários.\n"
                            + " B) Gamificação mal aplicada, com recompensas confusas.\n"
                            + " C) Jornadas intuitivas, com progressos visíveis e feedback positivo a cada etapa.\n"
                            + " D) Interfaces ocultas para não sobrecarregar a pessoa com informações.\n");

                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta Correta!\n");
                        giant_fearHP = giant_fearHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
                case 4:
                    System.out.println("De que forma a jornada do usuário pode transformar uma ação temida (como uma compra ou envio de dados) em um momento de realização?\n"
                            + "A) Garantindo clareza, controle e transparência em cada etapa da interação. \n"
                            + " B) Criando urgência com contagem regressiva e pressão.\n"
                            + " C) Limitando opções para acelerar a decisão.\n"
                            + " D) Escondendo detalhes do processo para não gerar dúvidas.\n");

                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("A")) {
                        System.out.println("Resposta Correta!\n");
                        giant_fearHP = giant_fearHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
            }
        } while (giant_fearHP > 0 && vida > 0);

        if (vida <= 0) {
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            intervaloCurto();
            System.out.println("GameOver\n");
            intervaloLongo();
            créditosFinais();
        } else {
            System.out.println("Você derrotou Giant Fear!!");
            intervaloCurto();
            emocoesUserX();
            GF(item3);
        }
        return vida;
    }

    static void créditosFinais() { // Imprime os créditos finais
        System.out.println("Obrigado por jogar ParadoUXo!\n");
        intervaloCurto();
        System.out.println("Grupo 6\n");
        intervaloCurto();
        System.out.println("Barbara de Oliveira Silva \n");
        intervaloCurto();
        System.out.println("Bianca Meneses \n");
        intervaloCurto();
        System.out.println("Camilly Quintino Ramos \n");
        intervaloCurto();
        System.out.println("Davi Teixeira da Silva \n");
        intervaloCurto();
        System.out.println("Kauane Mineiro Coimbra");
    }

    static int sadnessSite() {
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int sadness_siteHP = 100;
        String alternativas;
        utilizandoItem();
        System.out.println("Responda as questões corretamente para infringir dano ao seu oponente. Respostas incorretas resultarão em danos ao UserX");
        do {
            int perguntas = perguntas();
            System.out.println(">>> SADNESS SITE <<<\n" + "HP: " + vida + "%\n");
            switch (perguntas) {
                case 1:
                    System.out.println(" De que forma o excesso de informações apresentadas simultaneamente em uma interface digital pode comprometer a eficiência cognitiva do usuário durante sua jornada?\n"
                            + " A) Promove uma melhor compreensão ao fornecer todos os dados disponíveis de uma vez.\n"
                            + " B) Pode sobrecarregar a capacidade de processamento do usuário, resultando em fadiga cognitiva e decisões subótimas. \n"
                            + " C) Incentiva o usuário a explorar todas as opções, aumentando o engajamento positivo.\n"
                            + " D) Facilita a memorização de detalhes importantes ao expor o usuário a muitas informações. telas com poucas informações, para o usuário não pensar demais.\n");

                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        sadness_siteHP = sadness_siteHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
                case 2:
                    System.out.println(" Considerando princípios avançados de design de interface, como a desorganização visual afeta a percepção de usabilidade e confiabilidade do sistema pelo usuário?\n"
                            + "A) Um design desorganizado pode ser interpretado como inovador e, portanto, mais confiável.\n"
                            + "B) A desorganização visual reduz a clareza e pode induzir o usuário a questionar a credibilidade e a eficácia do sistema.\n"
                            + "C) A usabilidade não é afetada pela aparência visual, desde que as funcionalidades estejam presentes.\n"
                            + "D) Um layout caótico ajuda o usuário a focar apenas nas áreas que lhe interessam.\n");

                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        sadness_siteHP = sadness_siteHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 3:
                    System.out.println("    Como a ausência de hierarquia visual coerente em uma página digital impacta os processos de atenção seletiva e tomada de decisão do usuário?\n"
                            + "A) Facilita a seleção de informações ao distribuir o foco uniformemente entre todos os elementos.\n"
                            + " B) Dificulta a priorização de informações, causando dispersão atencional e aumentando o esforço cognitivo para tomada de decisão.\n"
                            + " C) Incentiva o usuário a explorar o conteúdo em profundidade, melhorando a retenção.\n"
                            + " D) Não tem impacto, pois o usuário sempre segue um caminho predefinido na interface.\n");

                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        sadness_siteHP = sadness_siteHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
                case 4:
                    System.out.println("  Quais são as implicações da presença de um design excessivamente carregado e sem foco no comportamento do usuário e nos indicadores de conversão?\n"
                            + " A) Pode aumentar a curiosidade do usuário, elevando taxas de cliques e conversão.\n"
                            + " B) Geralmente contribui para a diminuição da taxa de conversão devido à confusão, maior taxa de rejeição e frustração do usuário.\n"
                            + " C) Melhora a experiência do usuário por meio do estímulo visual constante e da sensação de conteúdo abundante.\n"
                            + " D) Não interfere nos indicadores de conversão, que dependem exclusivamente do preço e qualidade do produto.\n");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        sadness_siteHP = sadness_siteHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

            }
        } while (sadness_siteHP > 0 && vida > 0);

        if (vida <= 0) {
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            intervaloCurto();
            System.out.println("GameOver\n");
            intervaloLongo();
            créditosFinais();
        } else {
            System.out.println("Você derrotou Sadness Site!!");
            intervaloCurto();
            emocoesUserX();
            SS(item4);
        }
        return vida;
    }

    static int lutaFinal(){
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int theMasterOfKnowledgeHP = 100;
        String alternativas;

        System.out.println("Responda as questões corretamente para infringir dano ao seu oponente. Respostas incorretas resultarão em danos ao UserX");

        do {
            int perguntas = perguntas();
            System.out.println(">>> THE MASTER OF KNOWLEDGE <<<\n" + "HP: " + vida + "%\n");
            switch (perguntas) {
                case 1:
                    System.out.println("    Na jornada do usuário, o que caracteriza o momento de 'descoberta'?");
                    System.out.println("A) Quando o usuário já decidiu comprar e busca uma opção confiável");
                    System.out.println("B) Quando o usuário entra em contato direto com o produto ou serviço");
                    System.out.println("C) Quando o usuário identifica uma necessidade ou problema e busca soluções");
                    System.out.println("D) Quando o usuário abandona a jornada por falta de interesse.");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 2:
                    System.out.println("    Em relação aos pontos de contato(touchpoints), qual das opções de representa um ponto de contato digital indireto?");
                    System.out.println("A) Atendimento via chat no site da empresa");
                    System.out.println("B) Publicação de um cliente sobre a marca em redes sociais");
                    System.out.println("C) Avaliação da empresa feita por terceiros em sites de review");
                    System.out.println("D) Página do produto no e-commerce oficial");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 3:
                    System.out.println("    Qual das opções representa um dos principais objetivos da análise de pontos de contato na jornada do usuário?");
                    System.out.println("A) Aumentar o número de etapas da jornada para fidelizar o usuário");
                    System.out.println("B) Reduzir os custos de publicidade com base em dados de marketing");
                    System.out.println("C) Identificar oportunidades de melhorar a experiência do usuário");
                    System.out.println("D) Fornecer métricas financeiras para o setor de vendas");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
                case 4:
                    System.out.println("    O que é considerado uma boa prática no design de interface para promover usabilidade?");
                    System.out.println("A) Utilizar cores vibrantes em todas as áreas da tela para chamar atenção");
                    System.out.println("B) Garantir consistência nos elementos visuais e interação.");
                    System.out.println("C) Exibir todas as informações possíveis em uma única página para facilitar o acesso.");
                    System.out.println("D) Priorizar o uso de linguagem técnica para aumentar a credibilidade");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!");
                        vida = vida - 50;
                    }
                    break;

                case 5:
                    System.out.println("    Por que é importante considerar as emoções do usuário no design de uma experiência digital?");
                    System.out.println("A) Porque usuários emocionis tendem a evitar interações digitais");
                    System.out.println("B) Porque emoções negativas aumentam tempo de permanência em uma plataforma");
                    System.out.println("C) Porque emoções influenciam diretamente a percepção de valor, confiança e satisfação com o produto ou serviço");
                    System.out.println("D) Porque a emoção do usuário não interfere na interação com intefaces digitais.");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("C")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 6:
                    System.out.println("    Qual a diferença entre usabilidade e experiencia do usuario (UX)?");
                    System.out.println("A) Usabilidade é subjetiva, enquanto UX é mensurável");
                    System.out.println("B) UX esta relacionada apenas ao design gráfico, enquanto usabilidade é mais ampla");
                    System.out.println("C) Usabilidade considera apenas o aspecto emocional do usúario");
                    System.out.println("D) Usabilidade foca na eficiência da interação; UX inclui também emoções, percepções e contexto");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("D")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 7:
                    System.out.println("    Qual dos itens abaixo pode ser considerado uma barreira de usabilidade em uma interface digital?");
                    System.out.println("A) Ícones com significados universais e bem posicionados");
                    System.out.println("B) Textos muito longos e linguagem técnica demais");
                    System.out.println("C) Feedback visual imediato após uma ação");
                    System.out.println("D) Botões com espaçamento adequado para toque em dispositivos móveis.");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;

                case 8:
                    System.out.println("    O que melhor define o mapa da jornada do usuário?");
                    System.out.println("A) Uma representação gráfica do funil de vendas");
                    System.out.println("B) Uma visualizaçõa das etapas percorridas pelo usúario em sua interação com uma marca");
                    System.out.println("C) Um relatório estatístico de visitas ao site da empresa");
                    System.out.println("D) Um organograma de cargos responsáveis pela experiência do cliente");
                    System.out.print("Resposta: ");
                    alternativas = input.next();
                    if (alternativas.equalsIgnoreCase("B")) {
                        System.out.println("Resposta Correta!\n");
                        theMasterOfKnowledgeHP = theMasterOfKnowledgeHP - 50;
                    } else {
                        System.out.println("Resposta incorreta!\n");
                        vida = vida - 50;
                    }
                    break;
            }
        } while (theMasterOfKnowledgeHP > 0 && vida > 0);

        if (vida <= 0) {
            System.out.println("\nUserX\n"
                    + "HP: " + vida + "%\n");
            intervaloCurto();
            System.out.println("GameOver\n");
            intervaloLongo();
            créditosFinais();
        } else {
            System.out.println("Você derrotou The Master Of Knowledge!");
            intervaloCurto();
            emocoesUserX();
            System.out.println("\n======== USERX TORNOU-SE O MESTRE DO CONHECIMENTO =========\n");
            String[] emocao = emocoesUserX();
            relatorioEmocoes(emocao);
        }
        return vida;

    }

    static void creditosFinais() { // Imprime os créditos finais
        System.out.println("Obrigado por jogar ParadoUXo!\n");
        intervaloCurto();
        System.out.println("Grupo 6\n");
        intervaloCurto();
        System.out.println("Barbara de Oliveira Silva \n");
        intervaloCurto();
        System.out.println("Bianca Meneses \n");
        intervaloCurto();
        System.out.println("Camilly Quintino Ramos \n");
        intervaloCurto();
        System.out.println("Davi Teixeira da Silva \n");
        intervaloCurto();
        System.out.println("Kauane Mineiro Coimbra");

        menu();

    }

    static void finalDaHistoria(int acertos, String[] emocoes) {
        System.out.println("\n=== RESULTADO DA BATALHA ===");

    }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void main(String[] args) {

        if (menu() == 1) {
            System.out.println("\nNas distantes terras de Valfendor, um pequeno elfo chamado UserX se preparava para o que se tornaria uma história contada através dos séculos.\n"
                    + "Nascido em uma família simples e sem prestígio, num vilarejo pacato às margens do reino, UserX levava uma vida como tantas outras — regada à rotina, ao cansaço e à poeira do campo.\nMas, diferente dos demais, havia nele um fogo silencioso que o impedia de se conformar. Queria entender o mundo e seus mistérios — desvendar tudo aquilo que ainda não se sabe.\n"
                    + "Até que, certo dia, como se o destino tivesse ouvido esse desejo, sua vida tomou um rumo que nem os deuses poderiam prever.\n");
            System.out.println("Pressione 1 para continuar\n");
            botãoDeSkip();
            intervaloCurto();
            System.out.println("Era uma manhã comum, igual a tantas outras. UserX levantou-se no mesmo horário de sempre, comeu a mesma refeição de sempre e saiu de casa com o mesmo semblante de sempre para cumprir as mesmas tarefas de sempre.\nMas, em seu caminho, algo chamou sua atenção.\n"
                    + "À beira da estrada havia uma grande carruagem. Feita de madeira, adornada com detalhes em ouro e prata que reluziam sob a luz do sol. Uma visão improvável para aquelas terras humildes.\nNo entanto, o que realmente chamou sua atenção não foi o brilho das joias — mas o silêncio absoluto ao redor.\n"
                    + "A carruagem estava parada, sem cavalos à frente que a conduzissem, e não havia alma viva por perto.\n"
                    + "UserX não era tolo. Sabia que uma carruagem daquele porte não deveria estar ali — e estava prestes a seguir seu caminho, fingindo não ter visto nada, quando uma voz o chamou de dentro da carruagem.\n");
            intervaloCurto();
            System.out.println("Pressione 1 para continuar\n");
            botãoDeSkip();
            intervaloCurto();
            System.out.println("— Bom dia, garoto! Se não for incômodo, poderia me ajudar com algo? Perdi um item de grande valor e não estou conseguindo encontrá-lo.\n");
            intervaloLongo();
            System.out.println("UserX hesitou por um instante.\n");
            intervaloLongo();
            System.out.println("— Lamento, senhor. Estou atrasado com minhas tarefas, não consigo ajudá-lo agora.\n");
            intervaloLongo();
            System.out.println("— Ora, deixe disso — respondeu a voz, serena e confiante. — Será apenas um instante. Minha visão já não é tão boa quanto eu gostaria que fosse.\n"
                    + "UserX suspirou. Um pequeno desvio em sua rotina não o prejudicaria tanto assim.\n");
            intervaloLongo();
            System.out.println("— Bom, já que o senhor insiste...\n");
            intervaloCurto();
            System.out.println("Deu alguns passos à frente. A madeira escura e polida da carruagem refletia seu próprio rosto, e por um breve momento ele teve a estranha sensação de estar sendo observado por algo que não via.\n"
                    + "De dentro, surgiu uma mão pálida, sustentando um bastão e portando um anel de metal negro, gravado com o símbolo de um olho aberto.\n"
                    + " Logo, a figura de um senhor emergiu, vestindo trajes de tecido fino e expressão serena, mas com um olhar que parecia atravessar o tempo.\n");
            intervaloLongo();
            System.out.println("— Ah, aí está você — disse com um leve sorriso. — Eu já o esperava.\n");
            intervaloCurto();
            System.out.println("— Me esperava? — retrucou UserX, confuso. — Não nos conhecemos, senhor.\n");
            intervaloLongo();
            System.out.println("— Ainda não — respondeu calmamente. — Mas os ventos do destino raramente erram o caminho.\n");
            intervaloLongo();
            System.out.println("— E o que deseja de mim?\n");
            intervaloCurto();
            System.out.println("— Não o que eu desejo. Mas o que você busca. O conhecimento, a verdade... a sabedoria.\n"
                    + "— Aqueles que buscam o saber têm um brilho no olhar. Um brilho que não pode ser disfarçado. Mas todo brilho precisa ser testado.\n"
                    + "Então, ergueu o bastão e, com voz pausada, declarou:\n");
            System.out.println("Pressione 1 para continuar\n");
            intervaloCurto();
            botãoDeSkip();
            System.out.println("— Tenho uma proposta para lhe fazer, garoto. Se deseja alcançar a sabedoria que tanto procura, deverá enfrentar desafios — cinco provações que colocarão à prova não apenas sua mente, mas também seu coração.\n"
                    + "— Não lhe direi quais são. O verdadeiro aprendizado está no desconhecido. Mas se sobreviver... compreenderá o que nenhum livro poderia ensinar.\n");
            intervaloLongo();
            System.out.println("Da dobra de seu manto, o velho retirou um medalhão, gravado com o mesmo símbolo de seu anel — o olho aberto cercado por runas.\n"
                    + "— Este artefato o conduzirá ao seu destino.\n");

            if (aceitarArtefato() == 2) {
                intervaloCurto();
                créditosFinais();

            } else { // Continuar o jogo dentro do else

                System.out.println("UserX olhou para o medalhão, intrigado, e o segurou com cuidado. No instante em que seus dedos tocaram o metal frio, uma sensação o atravessou — primeiro como um arrepio, depois como uma pressão sufocante.\n"
                        + "O ar ao redor começou a se dobrar, distorcendo o espaço. O som se espremia, a luz se retorcia. Era como se o mundo tivesse sido espremido dentro de um tubo estreito e ele estivesse sendo arrastado por dentro dele — sem ar, sem chão, sem direção.\n"
                        + "A sensação durou apenas um instante, mas pareceu uma eternidade. E então... tudo parou.\n");
                intervaloLongo();
                System.out.println("UserX caiu de joelhos sobre um chão frio e úmido. Quando abriu os olhos, já não estava mais no campo.\n "
                        + "Estava no que parece ter sido um grande salão de um enorme castelo, mas que o tempo transformou em ruínas, porém vazio, sem as enormes mesas, assentos, ou vidraças gigantes, exceto pelas tochas que contornavam as paredes e iluminavam o ambiente com chamas azuis pálidas.\n");
                System.out.println("A sua frente, uma figura surgiu do chão, ali estava seu primeiro desafio.\n"
                        + "UserX caiu de joelhos sobre um chão frio e úmido. Quando abriu os olhos, já não estava mais no campo. \n"
                        + "Estava no que parece ter sido um grande salão de um enorme castelo, mas que o tempo transformou em ruínas — vazio, sem as enormes mesas, assentos ou vidraças gigantes que outrora o adornavam.\n");
                System.out.println("Apenas as tochas que contornavam as paredes permaneceram acesas, tremulando com chamas azuis pálidas que lançavam sombras vivas sobre as paredes rachadas.\n"
                        + "O som grave de um trovão ecoou ao longe, reverberando por toda a estrutura. O chão tremeu levemente.\n");
                System.out.println("Foi então que, à frente de UserX, o solo começou a se contorcer, rachando e se erguendo como se algo tentasse emergir das profundezas. \n "
                        + "Dali, uma sombra densa começou a tomar forma, sólida e monstruosa.\n"
                        + "Dentro do breu, um orc de proporções ameaçadoras surgiu. \n"
                        + "Sua pele era de um cinza esverdeado, coberta por marcas de runas queimadas que pulsavam em um ritmo irregular, como se cada batida fosse uma manifestação viva da própria escuridão.\n"
                        + " Empunhava um enorme tronco de árvore torcido, com cravos de metal cravados em sua superfície — uma arma forjada mais para destruir do que para lutar.\n");
                System.out.println("Seus olhos, de um amarelo fosforescente, fitaram UserX com um misto de raiva e propósito.\n"
                        + "De sua boca, um rugido gutural ecoou, fazendo as chamas das tochas vacilarem por um instante.\n"
                        + "Das sombras, uma voz reverberou dentro da mente de UserX — não a do orc, mas a da própria masmorra:\n"
                        + "\n>>> Dark Interface. O guardião do primeiro desafio. <<<\n");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                darkInterface();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("UserX ouviu um rangido ao fundo do salão, onde encontrou aberta uma porta simples demais para o lugar onde estava.\n"
                        + "Era pequena, sem nenhum adorno ou luxo, e o mais estranho, estava em perfeito estado, sem nenhum dos vestígios que o tempo fez questão de deixar no resto do salão.\n"
                        + "Ela levava para uma pequena sala, similar a um depósito. Ao centro dele, um enorme baú aguardava, adornado com esmeraldas e prata.\n");
                System.out.println("Atrás do baú, a sala se estreitava em direção a um corredor, com uma porta idêntica à que UserX havia visto há pouco.\n"
                        + "Ele olhou para trás para confirmar a semelhança, mas ao fazê-lo, reparou que onde antes havia uma porta,\n"
                        + "agora havia apenas uma parede de tijolos, a mensagem não poderia ser mais clara.\n");
                System.out.println("Não há retorno.");
                intervaloCurto();
                System.out.println("Adiante, passando pelo corredor e a porta ao final dele, UserX se surpreendeu ao ver que se encontrava no mesmo imenso salão de antes.\n"
                        + "Porém, à sua frente, outro inimigo o aguardava.\n");
                System.out.println("Um estrondo profundo ecoou — seguido de outro, e mais outro. O chão vibrava sob o peso de passos titânicos.\n"
                        + "Das sombras que cobriam o fundo do salão, uma forma gigantesca começou a emergir.\n"
                        + "Primeiro vieram as pernas, grossas como colunas de pedra; depois, um tronco imenso coberto por placas de couro endurecido e cicatrizes antigas.");
                System.out.println("Quando a criatura se revelou por completo, UserX viu três cabeças, cada uma voltada em uma direção,como se vigiasse todos os ângulos do campo de batalha.\n"
                        + "Seus olhos, de cores distintas — um vermelho, outro dourado e o terceiro azul — brilhavam com uma luz intensa e predatória.\n"
                        + "\n>>> Infinittus Options. o Colosso Tríplice. <<<\n");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("As três cabeças do gigante se voltaram simultaneamente para UserX, e um sorriso distorcido se formou em cada uma delas — um gesto de desprezo e desafio.\n"
                        + "O colosso ergueu sua clava de ferro, e o impacto do golpe contra o chão fez o salão inteiro estremecer.\n"
                        + "Fragmentos de pedra e poeira se ergueram no ar, criando um nevoeiro espesso.");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                infinittusOptions();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("UserX mal teve tempo de deduzir o óbvio antes de ouvir o rangido da porta ao final do salão.\n"
                        + "Nem se surpreendeu ao passar pela porta e se encontrar na mesma sala com um baú no centro.\n");
                System.out.println("O ambiente todo era estranhamente artificial, não parecia ter sido feito por mãos humanas, e sim apenas gerado daquela forma a fim de atender um propósito.");
                intervaloCurto();
                System.out.println("Após abrir o baú e sentir sua energia restaurar-se, o silêncio o envolveu por completo.\n"
                        + "A única coisa que ouvia era o som ritmado de sua própria respiração. Seguiu em direção ao portal que surgira na parede oposta.");
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("Dessa vez, quando seus pés tocaram o chão, o impacto reverberou de forma diferente.\n"
                        + "O ar estava frio, denso e opressor. O salão era o mesmo em estrutura, mas a atmosfera havia mudado completamente.\n"
                        + "As chamas azuis das tochas tremulavam fracas, como se temessem iluminar o que ali habitava.\n");
                intervaloLongo();
                System.out.println("O chão, coberto por uma fina névoa cinzenta, parecia pulsar como um organismo vivo.\n"
                        + "No centro do salão, uma sombra começou a se formar — uma massa escura que crescia em tamanho, ganhando contornos cada vez mais nítidos\n");
                System.out.println("Primeiro, vieram os braços.\n "
                        + "Quatro, emergindo de dentro da escuridão, como raízes de uma árvore antiga.\n"
                        + " Depois, o corpo colossal, coberto por uma pele espessa e marcada por símbolos arcanos que se moviam lentamente, como se respirassem.\n "
                        + " Por fim, o rosto — ou algo que se assemelhava a um. Seus olhos eram fendas vazias, e de sua boca, um som rouco ecoava, meio gemido, meio lamento.\n");
                System.out.println("A criatura se ergueu completamente, fazendo o teto do salão estremecer.\n"
                        + " Cada um dos quatro braços se movia com independência — um empunhava uma espada lascada, outro uma corrente, o terceiro uma lâmina dupla e o quarto, vazio, tremia como se buscasse agarrar algo invisível\n");
                System.out.println("UserX sentiu um calafrio profundo percorrer-lhe a espinha.\n"
                        + " Não era apenas medo físico — era como se a presença daquela entidade arrancasse suas certezas mais íntimas.\n"
                        + " O ambiente parecia se fechar sobre ele, distorcendo a luz e os sons.\n"
                        + "De algum lugar, a mesma voz grave e etérea ecoou:\n");
                System.out.println("\n>>> Giant Fear, o Terror da Forma.<<<\n"
                        + "Aquele que alimenta sua força da dúvida e da hesitação.\n"
                        + "Apenas quem encara a própria sombra pode superá-lo.\n");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                giantFear();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("UserX mal teve tempo de deduzir o óbvio antes de ouvir o rangido da porta ao final do salão.\n"
                        + "Nem se surpreendeu ao passar pela porta e se encontrar na mesma sala com um baú no centro.\n");
                System.out.println("O ambiente todo era estranhamente artificial, não parecia ter sido feito por mãos humanas, e sim apenas gerado daquela forma a fim de atender um propósito.");
                intervaloCurto();
                System.out.println("Após abrir o baú e sentir sua energia restaurar-se, o silêncio o envolveu por completo.\n"
                        + "A única coisa que ouvia era o som ritmado de sua própria respiração. Seguiu em direção ao portal que surgira na parede oposta.");
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("Quando UserX atravessou o portal da sala de descanso, o ar do novo salão parecia pesado, impregnado por um silêncio opressivo.\n"
                        + " As chamas azuis das tochas dançavam com mais intensidade, lançando sombras longas e trêmulas pelas paredes rachadas.\n");
                intervaloLongo();
                System.out.println("No centro do salão, uma figura começou a emergir da penumbra.\n"
                        + " Um orc colossal, maior do que qualquer outro que UserX já enfrentara.\n"
                        + " Mas o que mais chamava atenção eram duas cabeças, cada uma voltada em uma direção, observando-o com olhos que refletiam uma tristeza profunda e silenciosa.\n");
                System.out.println("Cada cabeça segurava um galho retorcido, reforçado pelas runas que cobriam os braços e tronco da criatura.\n"
                        + " Os galhos não eram apenas armas — pareciam extensões da própria essência da criatura, capazes de ferir e desestabilizar qualquer um que ousasse se aproximar.\n");
                System.out.println("O corpo do orc era coberto por cicatrizes e marcas de antigas batalhas, e das runas gravadas na pele emanava uma energia melancólica, que parecia absorver a luz ao redor.\n"
                        + " A simples presença do SADNESS SITE fazia o ar pesar, quase como se o próprio salão lamentasse junto com ele.\n");
                System.out.println("A voz etérea da masmorra soou mais uma vez, profunda e grave:\n"
                        + "\n>>> Sadness Site, o Guardião da Melancolia. <<<\n"
                        + "Duas cabeças, um único coração pesado.\n"
                        + "Aqueles que não confrontam a tristeza em si mesmos jamais avançam.\n");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                sadnessSite();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("Quatro dos desafios haviam sido superados.\n"
                        + "UserX já não era mais o mesmo que quando entrara, era hora de colocar em prática tudo que havia aprendido até então\n");

                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("\n=== A CHEGADA DO MESTRE DO CONHECIMENTO ===\n");
                System.out.println("À sua frente, o último inimigo o aguardava.");
                System.out.println("O mesmo senhor da carruagem agora flutuava a poucos centímetros do chão");
                System.out.println("envolto por um manto que se movia como se respirasse. Seu sorriso enigmático permanecia");
                System.out.println("e sob o tecido, as feições revelavam-se, olhos brilhando em amarelo intenso");
                System.out.println("veios de luz e runas se espalhando por seu rosto e braços, pulsando com a vida própria");
                System.out.println("e sua presença fazia o ar vibrar.");
                intervaloCurto();
                System.out.println("— Parabéns por chegar até aqui, garoto. É hora de provar que é digno. - A voz ecoou em todos os cantos da sala.");
                System.out.println("O chão tremeu enquanto ele ergueu o bastão.\n");
                System.out.println("- Derrote-me, me supere, e então assuma o meu lugar como Mestre do Conhecimento.");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                lutaFinal();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                System.out.println("A luz ao redor explodiu. Runas se acenderam em volta de UserX...");
                System.out.println("Seu corpo ardia enquanto símbolos de poder surgiam sobre sua pele.");
                System.out.println("Ele compreendeu o verdadeiro significado do conhecimento.");
                System.out.println("— Agora você sabe o que é ser o Mestre do Conhecimento — disse o velho.");
                System.out.println("E seu corpo se desfez em poeira dourada.");
                System.out.println("UserX retornou à estrada, mas agora transformado.");
                System.out.println("Nascia ali o novo Mestre do Conhecimento.");

                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                intervaloCurto();
                créditosFinais();

            }
        }
    }
}
