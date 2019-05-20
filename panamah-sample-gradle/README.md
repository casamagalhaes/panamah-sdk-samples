# panamah-sample-gradle

Projeto de exemplo de uso da sdk do panamah

## Dependência

```groovy
    // https://bintray.com/beta/#/casamagalhaes/panamah-java-sdk/panamah-java-sdk/0.3.2?tab=overview
    implementation 'br.com.casamagalhaes.panamah.sdk:panamah-sdk:0.3.2'
```

## Configuração de repositório

```groovy
repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    maven {
		url  "https://dl.bintray.com/casamagalhaes/panamah-java-sdk"
	}
}
```

Isso baixará com sucesso as dependências e a própria sdk do panamah

Visite a [documentação oficial](https://sdk.panamah.io/) para entender o funcionamento.