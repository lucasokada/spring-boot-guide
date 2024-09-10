<h1>Spring Boot</h1>
É um framework baseado em <b>Spring</b>, que facilita o desenvolvimento de aplicações Java, especialmente aplicações web e 
serviços RESTful, eliminando a necessidade de configurações extensas. Ele foi projetado para simplificar o processo de 
criação de aplicações robustas e escaláveis, fornecendo uma série de convenções e configurações automáticas que 
aceleram o desenvolvimento
<h2>Principais características:</h2>
<ul>
    <li><b>Configuração Automática (Auto-Configuration):</b> O Spring Boot utiliza um mecanismo de auto-configuração para ajustar automaticamente os componentes da aplicação com base nas dependências presentes. Isso reduz a necessidade de configuração manual, como arquivos XML ou anotações extensas.</li>
    <li><b>Standalone:</b> As aplicações Spring Boot podem ser executadas de forma independente, sem a necessidade de um servidor de aplicação externo (como Tomcat ou Jetty), pois incluem um servidor embutido. Isso permite iniciar o aplicativo diretamente com o comando java -jar ao empacotar a aplicação.</li>
    <li><b>Menos Configuração e Mais Convenção:</b> Ao contrário do Spring tradicional, que pode exigir configurações detalhadas, o Spring Boot segue a filosofia "convenção sobre configuração". Isso significa que ele usa configurações padrão inteligentes, mas permite que você personalize conforme necessário.</li>
    <li><b>Embedded Servers:</b> Spring Boot integra servidores embutidos, como Tomcat, Jetty ou Undertow, permitindo que sua aplicação rode diretamente sem precisar de uma instalação separada de servidor. Isso torna mais simples o processo de deploy e execução.</li>
    <li><b>Foco em Microserviços:</b> Spring Boot é amplamente utilizado no desenvolvimento de microserviços, pequenos serviços independentes que se comunicam entre si. Ele fornece um ecossistema completo para a construção, manutenção e integração de microserviços.</li>
    <li><b>Spring Boot Starters:</b> Starters são dependências pré-configuradas que ajudam a adicionar rapidamente bibliotecas ou funcionalidades ao projeto. Por exemplo, adicionar o "spring-boot-starter-web" ao projeto automaticamente configura tudo o que você precisa para criar uma aplicação web.</li>
    <li><b>Spring Boot CLI:</b> O Spring Boot também inclui uma interface de linha de comando (CLI) que permite criar e rodar aplicações rapidamente usando Groovy.</li>
    <li><b>Actuators:</b> O Spring Boot Actuator fornece endpoints prontos para monitoramento e gerenciamento de sua aplicação, como métricas, informações de saúde da aplicação, entre outros.</li>
</ul>

<h1>Spring Boot Starter Web</h1>
serve para facilitar o desenvolvimento de aplicações web, especialmente aquelas que utilizam o padrão MVC 
(Model-View-Controller), bem como APIs RESTful. Ela agrupa e configura automaticamente várias bibliotecas necessárias 
para criar essas aplicações, economizando o trabalho de adicionar e configurar manualmente cada dependência.

<h2>O que está incluso:</h2>
<ol>
    <li>
        <b>Spring MVC:</b>
        <ul>
            <li>O Spring MVC é o componente do Spring que permite o desenvolvimento de aplicações web baseadas no 
            padrão MVC. Ele fornece suporte para mapeamento de URLs, controladores, validação de dados e resposta HTTP. 
            Ele é essencial para criar endpoints RESTful e lidar com requisições HTTP (GET, POST, PUT, DELETE).</li>
        </ul>
    </li>
    <li>
        <b>Embedded Servlet Containers:</b>
        <ul>
            <li>O O spring-boot-starter-web vem com servidores de aplicação embutidos, como Tomcat (por padrão), Jetty 
            ou Undertow. Isso permite que você execute sua aplicação como um aplicativo independente sem precisar 
            configurar um servidor web externo.</li>
            <li>Assim, você pode rodar sua aplicação diretamente com o comando java -jar em vez de fazer o deploy em 
            um servidor de aplicação.</li>
        </ul>
    </li>
    <li>
        <b>Jackson:</b>
        <ul>
            <li>Inclui a biblioteca Jackson, que é usada para converter objetos Java em JSON (serialização) e 
            vice-versa (desserialização). Isso é particularmente útil em APIs RESTful, onde os dados geralmente são 
            trocados no formato JSON.</li>
        </ul>
    </li>
    <li>
        <b>Spring Boot Auto-Configuration:</b>
        <ul>
            <li>O Spring Boot configura automaticamente componentes como o dispatcher servlet, handlers de exceção e 
            outras partes essenciais de uma aplicação web. Ele permite que você comece a desenvolver rapidamente sem 
            se preocupar com a configuração manual.</li>
        </ul>
    </li>
    <li>
        <b>Validação de Dados:</b>
        <ul>
            <li>O spring-boot-starter-web também inclui suporte para validação de dados, utilizando 
            Hibernate Validator (implementação da especificação Bean Validation).</li>
        </ul>
    </li>
    <li>
        <b>Logging:</b>
        <ul>
            <li>Inclui a dependência Logback, que é configurada automaticamente para fornecer suporte de logging, 
            facilitando o rastreamento e depuração da aplicação.</li>
        </ul>
    </li>
</ol>

<h1>Spring Boot DevTools</h1>
É uma ferramenta de desenvolvimento para o <b>Spring Boot</b> que oferece diversos recursos que agilizam 
o processo de desenvolvimento e melhoram a produtividade do desenvolvedor. Ela inclui funcionalidades como 
<b>reinicialização automática</b> (hot reload), <b>cache desativado</b> em modo de desenvolvimento e suporte para 
<b>live reload</b> de páginas web.

<h2>Principais Funcionalidades:</h2>
<ul>
    <li>
        <b>Hot Reload (Reinicialização Automática): </b>
        permite que a aplicação seja reiniciada automaticamente sempre que uma mudança no código-fonte é detectada. O Spring Boot consegue reiniciar apenas o contexto da aplicação, sem reinicializar o servidor inteiro, o que torna esse processo muito mais rápido.
    </li>
    <li>
        <b>Live Reload: </b>
        permite recarregar automaticamente o navegador quando a aplicação é modificada. Para usar essa funcionalidade, você precisa de um plugin no navegador, como o <strong>Livereload</strong>, que se conecta automaticamente ao DevTools.
    </li>
    <li>
        <b>Desativação de Cache: </b>
        Durante o desenvolvimento, o cache de templates (Thymeleaf, FreeMarker, etc.) e de outros recursos estáticos é desativado para que mudanças nos arquivos sejam refletidas imediatamente, sem a necessidade de limpar ou recarregar caches manualmente.
    </li>
    <li>
        <b>Suporte a Ferramentas Remotas</b>
        Facilita a conexão com ferramentas de desenvolvimento remoto, abrindo um canal para que você possa monitorar ou depurar a aplicação em um ambiente remoto.
    </li>
    <li>
        <b>Ajuste Automático de Configurações</b>
        Algumas configurações específicas do ambiente de desenvolvimento são ajustadas automaticamente pelo DevTools, como logs mais detalhados, desativação de caches, entre outros.
    </li>
    <li>
        <b>H2 Console</b>
        Se você estiver utilizando o banco de dados H2, o DevTools ativa automaticamente o console web para facilitar a visualização e manipulação dos dados durante o desenvolvimento.
    </li>
</ul>

<h1>Mysql Connector J</h1>
É um driver JDBC (Java Database Connectivity) desenvolvido pela Oracle para permitir que aplicações Java se conectem a 
um banco de dados MySQL. Ele atua como uma ponte entre o código Java e o banco de dados, permitindo que você execute 
consultas SQL, manipule dados e interaja com o MySQL usando uma API JDBC padrão.

<h2>Principais Funções</h2>
<ul>
    <li><b>Conexão JDBC com MySQL:</b> O driver permite que você crie uma conexão entre sua aplicação Java e um banco de dados MySQL usando JDBC. Isso inclui abrir uma conexão, enviar comandos SQL e receber os resultados de consultas.</li>
    <li><b>Compatibilidade com Versões Diferentes do MySQL:</b> O mysql-connector-j é compatível com diferentes versões do MySQL, garantindo que sua aplicação possa se conectar a bancos de dados tanto antigos quanto recentes.</li>
    <li><b>Execução de Consultas SQL:</b> Você pode executar consultas SQL (como SELECT, INSERT, UPDATE, DELETE) diretamente no banco de dados usando o driver, recebendo os resultados e manipulando dados.</li>
    <li><b>Gerenciamento de Transações:</b> O driver também suporta o gerenciamento de transações, permitindo que você crie transações, execute commits e rollbacks de forma segura.</li>
    <li><b>Pooling de Conexões:</b> O driver é comumente usado com pools de conexão, o que otimiza o desempenho em aplicações que requerem múltiplas conexões simultâneas com o banco de dados.</li>
</ul>

<h1>Lombok</h1>
É uma biblioteca Java que reduz a verbosidade do código ao gerar automaticamente código boilerplate, como getters, 
setters, construtores, métodos equals(), hashCode(), entre outros. Ele é particularmente útil para melhorar a 
legibilidade e manutenção do código, eliminando a necessidade de escrever manualmente esses métodos comuns 
em classes Java.

<h1>Spring Boot Starter Test</h1>
É um starter do Spring Boot que reúne todas as dependências necessárias para realizar testes em uma 
aplicação Spring Boot. Ele inclui diversas bibliotecas populares de teste que permitem a criação de testes unitários, 
de integração, de carga, e muito mais.

<h2>Principais Bibliotecas Incluídas</h2>
<ol>
    <li>
        <b>JUnit 5: </b>
        O JUnit 5 (também conhecido como Jupiter) é a principal biblioteca de testes unitários usada em projetos Java. 
        Ele fornece anotações e utilitários para escrever e executar testes.<br />
        Exemplo: <code>@Test, @BeforeEach, @AfterEach</code>
    </li>
    <li>
        <b>Mockito: </b>
        É uma biblioteca de simulação (mocking) que permite criar objetos simulados para realizar testes unitários 
        isolados. Ele é útil para testar classes em isolamento sem depender de outras partes do sistema.<br />
        Exemplo: <code>@Mock, @InjectMocks</code>
    </li>
    <li>
        <b>Hamcrest: </b>
        Uma biblioteca para escrever asserções em testes de maneira mais legível e expressiva. Ela permite usar 
        matchers para criar testes mais compreensíveis.<br />
        Exemplo: <code>assertThat(valor, is(expectedValue))</code>
    </li>
    <li>
        <b>AssertJ: </b>
        Uma biblioteca fluente de asserções que torna os testes mais legíveis e expressivos do que o uso das 
        asserções nativas do JUnit.<br />
        Exemplo: <code>assertThat(valor).isEqualTo(expectedValue)</code>
    </li>
    <li>
        <b>Spring Test: </b>
        Inclui utilitários para realizar testes de integração em aplicações Spring, como o suporte para carregar 
        o contexto da aplicação Spring durante os testes.<br />
        Exemplo: <code>@SpringBootTest, @MockBean, @WebMvcTest</code>
    </li>
    <li>
        <b>JSONassert: </b>
        Uma biblioteca para realizar comparações assertivas de objetos JSON em seus testes. Muito útil para garantir 
        que respostas de APIs JSON estejam corretas.<br />
        Exemplo: <code>JSONAssert.assertEquals(expectedJson, actualJson, true)</code>
    </li>
    <li>
        <b>JsonPath: </b>
        Uma biblioteca que permite a navegação e extração de dados de objetos JSON, o que é útil para verificar 
        partes específicas de uma resposta JSON.<br />
        Exemplo: <code>JsonPath.parse(json).read("$.nome")</code>
    </li>
</ol>