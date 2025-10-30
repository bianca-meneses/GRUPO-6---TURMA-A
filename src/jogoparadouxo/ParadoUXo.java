import java.util.*;
public class ParadoUXo {

    static int botãoDeSkip() { // Use quando precisar inserir um botão de "Próximo".
        Scanner input = new Scanner(System.in);
        int skip = input.nextInt();
        return skip;
    }

    static int perguntas() { // Use para gerar um número aleatório de 1 a 4. (Necessário nas lutas contra boss para a aleatoriedade das perguntas)
        Random random = new Random();
        int aleatório = random.nextInt(4) + 1;
        return aleatório;
    }

    static long intervaloCurto() { // Use para gerar um delay de 2 segundos entre comandos.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return System.currentTimeMillis();
    }

    static long intervaloLongo() { //Use para gerar um delay de 5 segundos entre comandos.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return System.currentTimeMillis();
    }

    static int input() {
        Scanner input = new Scanner(System.in);
        int opção = input.nextInt();
        return opção;
    }

    static int aceitarArtefato(){
        System.out.println("Aceitar artefato?\n" +
                "1 - Sim\n" +
                "2 - Não\n");
        intervaloLongo();
        int escolha = input();
        return escolha;
    }

    static int menu(){
        int opcões;
        do {
            System.out.println("\n ParadoUXo \n");
            System.out.println("1 - Jogar");
            System.out.println("2 - Instruções");
            System.out.println("3 - História");
            System.out.println("4 - Créditos");
            System.out.println("5 - Sair");
            opcões = input();

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

                    System.out.println("Nas distantes terras de Valfendor, um pequeno elfo chamado UserX se preparava para o que se tornaria uma história contada através dos séculos.\n" +
                            "Nascido em uma família simples e sem prestígio, num vilarejo pacato às margens do reino, UserX levava uma vida como tantas outras — regada à rotina, ao cansaço e à poeira do campo. Mas, diferente dos demais, havia nele um fogo silencioso que o impedia de se conformar. Queria entender o mundo e seus mistérios — desvendar tudo aquilo que ainda não se sabe.\n" +
                            "Até que, certo dia, como se o destino tivesse ouvido esse desejo, sua vida tomou um rumo que nem os deuses poderiam prever.\n");
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

    static int darkInterface() {
        Scanner input = new Scanner(System.in);
        int vida = 100;
        int dark_interfaceHP = 100;
        String alternativas;

        System.out.println("Responda as questões corretamente para infringir dano ao seu oponente. Respostas incorretas resultarão em danos ao UserX");

        do {
            int perguntas = perguntas();
            System.out.println(">>> DARK INTERFACE <<<\n" +
                    "HP: " + dark_interfaceHP + "%");
            System.out.println("\nUserX\n" +
                    "HP: " + vida + "%\n");
            switch (perguntas) {
                case 1:
                    System.out.println("   O que é a jornada do usuário?\n" +
                            "A) Um mapa que mostra as vendas realizadas por uma empresa em determinado período.\n" +
                            "B) Uma técnica de marketing usada apenas para atrair novos clientes.\n" +
                            "C) O caminho que o usuário percorre desde o primeiro contato com uma marca até a concretização de uma ação (como a compra).\n" +
                            "D) Um relatório financeiro que avalia o comportamento do consumidor.\n");
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
                    System.out.println("   Qual é o principal objetivo da jornada do usuário?\n" +
                            "A) Aumentar os preços dos produtos com base no comportamento do cliente.\n" +
                            "B) Reduzir os custos operacionais da empresa a qualquer custo.\n" +
                            "C) Compreender e otimizar a experiência do usuário em cada etapa de interação com a marca.\n" +
                            "D) Impedir que o cliente tenha contato com concorrentes.\n");
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
                    System.out.println("   Qual ponto da interface mais contribui para uma experiência positiva ao longo da jornada do usuário?\n" +
                            "A) A interface é complexa e cheia de elementos, o que torna a navegação desafiadora.\n" +
                            "B) A interface se adapta mal a dispositivos móveis, o que exige o uso de desktop.\n" +
                            "C) A interface é responsiva e se adapta bem a dispositivos móveis, facilitando a navegação.\n" +
                            "D) A interface possui poucos recursos visuais, o que evita distrações, mesmo que sacrifique a usabilidade.\n");
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
                    System.out.println("   O que é mais importante para garantir que a interface ajude o usuário durante sua jornada?\n" +
                            "A) Ter o maior número possível de elementos gráficos para impressionar o usuário.\n" +
                            "B) Utilizar textos técnicos e complexos para mostrar profissionalismo.\n" +
                            "C) Manter uma estrutura visual simples, com botões claros e navegação intuitiva.\n" +
                            "D) Esconder funcionalidades para tornar a interface mais “limpa”.\n");
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
            System.out.println("\nUserX\n" +
                    "HP: " + vida + "%\n");
            intervaloCurto();
            System.out.println("GameOver\n");
            intervaloLongo();
            créditosFinais();
        } else {
            System.out.println("Você derrotou Dark Interface!");
        }
        return vida;
    }

    static void créditosFinais() { // Imprime os créditos finais
        System.out.println("Obrigado por jogar ParadoUXo!\n");
        intervaloCurto();
        System.out.println("Grupo 6\n");
        intervaloCurto();
        System.out.println("Barbara Oliveira da Silva \n");
        intervaloCurto();
        System.out.println("Bianca Meneses \n");
        intervaloCurto();
        System.out.println("Camilly Quintino Ramos \n");
        intervaloCurto();
        System.out.println("Davi Teixeira da Silva \n");
        intervaloCurto();
        System.out.println("Kauane Miniro Coimbra");
    }

       // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
      // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public static void main(String[] args) {
        if (menu() == 1) {
            System.out.println("\nNas distantes terras de Valfendor, um pequeno elfo chamado UserX se preparava para o que se tornaria uma história contada através dos séculos.\n" +
            "Nascido em uma família simples e sem prestígio, num vilarejo pacato às margens do reino, UserX levava uma vida como tantas outras — regada à rotina, ao cansaço e à poeira do campo.\nMas, diferente dos demais, havia nele um fogo silencioso que o impedia de se conformar. Queria entender o mundo e seus mistérios — desvendar tudo aquilo que ainda não se sabe.\n" +
            "Até que, certo dia, como se o destino tivesse ouvido esse desejo, sua vida tomou um rumo que nem os deuses poderiam prever.\n");
            System.out.println("Pressione 1 para continuar\n");
            botãoDeSkip();
            intervaloCurto();
            System.out.println("Era uma manhã comum, igual a tantas outras. UserX levantou-se no mesmo horário de sempre, comeu a mesma refeição de sempre e saiu de casa com o mesmo semblante de sempre para cumprir as mesmas tarefas de sempre.\nMas, em seu caminho, algo chamou sua atenção.\n" +
           "À beira da estrada havia uma grande carruagem. Feita de madeira, adornada com detalhes em ouro e prata que reluziam sob a luz do sol. Uma visão improvável para aquelas terras humildes.\nNo entanto, o que realmente chamou sua atenção não foi o brilho das joias — mas o silêncio absoluto ao redor.\n" +
           "A carruagem estava parada, sem cavalos à frente que a conduzissem, e não havia alma viva por perto.\n" +
           "UserX não era tolo. Sabia que uma carruagem daquele porte não deveria estar ali — e estava prestes a seguir seu caminho, fingindo não ter visto nada, quando uma voz o chamou de dentro da carruagem.\n");
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
            System.out.println("— Ora, deixe disso — respondeu a voz, serena e confiante. — Será apenas um instante. Minha visão já não é tão boa quanto eu gostaria que fosse.\n" +
                    "UserX suspirou. Um pequeno desvio em sua rotina não o prejudicaria tanto assim.\n");
            intervaloLongo();
            System.out.println("— Bom, já que o senhor insiste...\n");
            intervaloCurto();
            System.out.println("Deu alguns passos à frente. A madeira escura e polida da carruagem refletia seu próprio rosto, e por um breve momento ele teve a estranha sensação de estar sendo observado por algo que não via.\n" +
                    "De dentro, surgiu uma mão pálida, sustentando um bastão e portando um anel de metal negro, gravado com o símbolo de um olho aberto. Logo, a figura de um senhor emergiu, vestindo trajes de tecido fino e expressão serena, mas com um olhar que parecia atravessar o tempo.\n");
            intervaloLongo();
            System.out.println("— Ah, aí está você — disse com um leve sorriso. — Eu já o esperava.\n");
            intervaloCurto();
            System.out.println("— Me esperava? — retrucou UserX, confuso. — Não nos conhecemos, senhor.\n");
            intervaloLongo();
            System.out.println("— Ainda não — respondeu calmamente. — Mas os ventos do destino raramente erram o caminho.\n");
            intervaloLongo();
            System.out.println("— E o que deseja de mim?\n");
            intervaloCurto();
            System.out.println("— Não o que eu desejo. Mas o que você busca. O conhecimento, a verdade... a sabedoria.\n" +
                    "— Aqueles que buscam o saber têm um brilho no olhar. Um brilho que não pode ser disfarçado. Mas todo brilho precisa ser testado.\n" +
                    "Então, ergueu o bastão e, com voz pausada, declarou:\n");
            System.out.println("Pressione 1 para continuar\n");
            intervaloCurto();
            botãoDeSkip();
            System.out.println("— Tenho uma proposta para lhe fazer, garoto. Se deseja alcançar a sabedoria que tanto procura, deverá enfrentar desafios — cinco provações que colocarão à prova não apenas sua mente, mas também seu coração.\n" +
                    "— Não lhe direi quais são. O verdadeiro aprendizado está no desconhecido. Mas se sobreviver... compreenderá o que nenhum livro poderia ensinar.\n");
            intervaloLongo();
            System.out.println("Da dobra de seu manto, o velho retirou um medalhão, gravado com o mesmo símbolo de seu anel — o olho aberto cercado por runas.\n" +
            "— Este artefato o conduzirá ao seu destino.\n");

            if (aceitarArtefato() == 2) {
                intervaloCurto();
                créditosFinais();

            } else { // Continuar o jogo dentro do else

                System.out.println("UserX olhou para o medalhão, intrigado, e o segurou com cuidado. No instante em que seus dedos tocaram o metal frio, uma sensação o atravessou — primeiro como um arrepio, depois como uma pressão sufocante.\n" +
                        "O ar ao redor começou a se dobrar, distorcendo o espaço. O som se espremia, a luz se retorcia. Era como se o mundo tivesse sido espremido dentro de um tubo estreito e ele estivesse sendo arrastado por dentro dele — sem ar, sem chão, sem direção.\n" +
                        "A sensação durou apenas um instante, mas pareceu uma eternidade. E então... tudo parou.\n");
                intervaloLongo();
                System.out.println("UserX caiu de joelhos sobre um chão frio e úmido. Quando abriu os olhos, já não estava mais no campo.\n " +
                        "Estava no que parece ter sido um grande salão de um enorme castelo, mas que o tempo transformou em ruínas, porém vazio, sem as enormes mesas, assentos, ou vidraças gigantes, exceto pelas tochas que contornavam as paredes e iluminavam o ambiente com chamas azuis pálidas.\n");
                System.out.println("A sua frente, uma figura surgiu do chão, ali estava seu primeiro desafio.\n" +
                        "UserX caiu de joelhos sobre um chão frio e úmido. Quando abriu os olhos, já não estava mais no campo. Estava no que parece ter sido um grande salão de um enorme castelo, mas que o tempo transformou em ruínas — vazio, sem as enormes mesas, assentos ou vidraças gigantes que outrora o adornavam.\n");
                System.out.println("Apenas as tochas que contornavam as paredes permaneceram acesas, tremulando com chamas azuis pálidas que lançavam sombras vivas sobre as paredes rachadas.\n" +
                        "O som grave de um trovão ecoou ao longe, reverberando por toda a estrutura. O chão tremeu levemente.\n");
                System.out.println("Foi então que, à frente de UserX, o solo começou a se contorcer, rachando e se erguendo como se algo tentasse emergir das profundezas. Dali, uma sombra densa começou a tomar forma, sólida e monstruosa.\n" +
                        "Dentro do breu, um orc de proporções ameaçadoras surgiu. Sua pele era de um cinza esverdeado, coberta por marcas de runas queimadas que pulsavam em um ritmo irregular, como se cada batida fosse uma manifestação viva da própria escuridão. Empunhava um enorme tronco de árvore torcido, com cravos de metal cravados em sua superfície — uma arma forjada mais para destruir do que para lutar.\n");
                System.out.println("Seus olhos, de um amarelo fosforescente, fitaram UserX com um misto de raiva e propósito.\n" +
                        "De sua boca, um rugido gutural ecoou, fazendo as chamas das tochas vacilarem por um instante.\n" +
                        "Das sombras, uma voz reverberou dentro da mente de UserX — não a do orc, mas a da própria masmorra:\n" +
                        ">>> — Dark Interface. O guardião do primeiro desafio. <<<\n");
                intervaloCurto();
                System.out.println("Pressione 1 para continuar");
                botãoDeSkip();
                intervaloCurto();
                darkInterface();
            }
        }
    }
}