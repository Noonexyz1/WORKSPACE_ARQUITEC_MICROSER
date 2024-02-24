## Micronaut 2.4.0 Documentation

- [User Guide](https://docs.micronaut.io/2.4.0/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.0/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.0/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature r2dbc documentation

- [Micronaut R2DBC documentation](https://micronaut-projects.github.io/micronaut-r2dbc/latest/guide/)

- [https://r2dbc.io](https://r2dbc.io)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature data-r2dbc documentation

- [Micronaut Data R2DBC documentation](https://micronaut-projects.github.io/micronaut-r2dbc/latest/guide/)

- [https://r2dbc.io](https://r2dbc.io)

## Run PostgreSQL
```bash
sudo dockerd &

docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres

docker container stop some-postgres
docker container start some-postgres

docker exec -it some-postgres bash
psql -U postgres
\dt
```

## Upgrade Micronaut:3

```bash
gradle wrapper --gradle-version 7.2
sdk i java 17.0.1-oracle

./gradlew run
./gradlew test --info
./gradlew build -x test 

java -jar build/libs/mn-r2dbc-0.1-all.jar
```

## GraalVM

https://guides.micronaut.io/latest/micronaut-creating-first-graal-app-gradle-java.html

```bash
sdk use java 21.3.0.r17-grl
./gradlew nativeImage
```
