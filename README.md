# GraphQL java server sample project
GraphQL is a query language designed to build client applications by providing an intuitive and flexible syntax and system for describing their data requirements and interactions (<a href="https://facebook.github.io/graphql/">GraphQL - Facebook Code</a>).


## Rest Resource Problem and Graphql solution
Client needs data from multiple resources at the same time and different  clients need different parts of resources.In rest resources, client will deal with several requests (or need another resource for this requirement). Unnecessary fields will be transfered and will be skipped by client. In Graphql client specifies required fields and also allows for multiple queries in a single request.

<br>Example is based on tutorial at <a href="https://www.howtographql.com/graphql-java/0-introduction/">https://www.howtographql.com</a> (Simplified version)


<ul><li>mvn jetty:run
<li><a href="http://localhost:8080/">http://localhost:8080/</a>
<li>execute queries in queries.txt(one by one) 
