# clean-arch-java-demo
Demo Application to apply Clean Architecture concepts

# Aplicação de arquitetura limpa em um projeto JAVA

Essa construção bem simples que vamos detalhar demonstram bem simples o conceito de arquitetura limpa.

Revendo os conceitos de arquitetura limpa:
- Independência de frameworks;
- Testabilidade;
- Independência de Interface do usuário;
- Independência de qualquer elemento externo.

Partindo da camada mais interna para a camada mais externa temos:

1) Entidades ( Entities)

2) Casos de usos ( User Cases) Services

3) Adaptadores ( Adapters) - Tradução para comunicação com os elementos externos como CONTROLLERS, PRESENTERS, REPOSITORYS usadas como adaptadores.

4) Frameworks & Drivers , Banco de dados, frameworks, interfaces externas.

As dependencias devem sempre ser para o nivel mais alto da aplicação, sempre para as camadas mais internas.

Sempre dependa de abstrações e nunca de implementações concretas.

A qualidade de software pode ser medida pelo esforço para entregar uma nova funcionalidades.
Se o esforço é baixo e permanece baixo durante a vida útil do sistema, o design é bom.
Se esse esforço aumenta a cada versão o design é ruim

A arquitetura da sua aplicação pouco importa se os tijolos estão mal feitos.
E mesmo com tijolos bem feitos a arquitetura pode ser um desastre.