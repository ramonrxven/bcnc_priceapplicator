# PriceApplicator
<p style="font-size: 20px; text-align: justify;">
<em>PriceApplicator</em> es una aplicación que provee un endpoint para realizar una consulta sobre
el precio a aplicar, para un producto según unos criterios de producto, marca, fecha y hora 
provistos.<br/>
Está desarrollada en spring-boot con Java 11
</p>


## Ejecutar la Aplicación:
<p style="font-size: 16px; text-align: justify;">
La aplicación esta configurada para correr en el puerto 8080.<br/>
Es necesario estar ubicados dentro de la carpeta del proyecto al
mismo nivel del archivo POM.XML

para correr la aplicación desde la línea de comando
</p>

~~~
$ mvn spring-boot:run
~~~

## Ejecutar los test:
<p style="font-size: 16px; text-align: justify;">
Es necesario estar ubicados dentro de la carpeta del proyecto al
mismo nivel del archivo POM.XML
</p>

~~~
$ mvn test
~~~


## Acceder al endpoint de la API:

### End Point:
http://localhost:8080/api/v1/pricetoapply?applicationDate=2020-06-14T10:00:00&productId=35455&brandId=1
<br/>para probar el endpoint es recomendable utilizar **Postman** o **Insomnia**
#### Parametros:

- **<em>applicationDate</em>**: Fecha y hora de la Petición ej: 2020-06-14T10:00:00
- **<em>productId</em>**: ID del producto, ej: 35455
- **<em>brandId</em>**: ID de la marca, ej: 1

#### Documentación del Endpoint
La documentación del Endpoint se encontrará disponible una vez este en ejecución la aplicación
en la siguiente url:
<br/>http://localhost:8080/swagger-ui/index.html
