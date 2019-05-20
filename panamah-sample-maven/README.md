# panamah-sample-maven

Projeto de exemplo de uso da sdk do panamah

## Dependência

```xml
		<dependency>
			<groupId>br.com.casamagalhaes.panamah.sdk</groupId>
			<artifactId>panamah-sdk</artifactId>
			<version>0.3.1</version>
		</dependency>
```

## Ajuste no settings para ver os repositórios do bintray

O arquivo **settings.xml** tem a configuração de repositório que permite encontrar o artefato publicado no bintray.

Este arquivo tanto pode ser colocado dentro da pasta **.m2** do seu cache local do maven quanto referenciado na linha de comando do seu projeto maven da seguinte forma:

```bash
mvn clean install -s settings.xml
```

Visite a [documentação oficial](https://sdk.panamah.io/) para entender o funcionamento.