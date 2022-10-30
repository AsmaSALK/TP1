# TP1
Travail à faire:
Travail à faire :
 Suivre les vidéos Bonnes pratiques de Architectures micro-services :
 1. Vidéo 1 : Concepts de bases
 2.  Vidéo 2 à 5 : Mise en oeuvre d'une application distribuée basée sur deux micro-services en utilisant les bonnes pratiques  :
  - Couches DA0, Service, Web, DTO
  - Utilisation de MapStruct pour le mapping entre les objet Entities et DTO
  - Génération des API-DOCS en utilisant SWAGGER3 (Open API)
  - Communication entre micro-services en utilisant OpenFeign
  - Spring Cloud Gateway
  - Eureka Discovery Service






Projet Customer-Service :

- Dans ce projet, j'ai créé de nombreux packages et classes comme indiqué dans la figure ci-dessous :
 ![1](https://user-images.githubusercontent.com/97363124/198903772-a80f129e-c3e9-4c1f-bf9e-4bcc579598b8.png)


	La classe Customer
 
	L’interface CustomerRepository:
 
	Les classes CustomerResponseDTO et CustomerRequestDTO de la partie DTO.

 
 
	L’interface CustomerService son implémentation
 

 
	La classe CustomerMapper 
 
Puis tester l’application dans le main :
 
la base de données  a était bien créer ainsi que les deux client sont bien ajouté :
 




Tester l’application avec Swagger  :
 
 
Projet Billing service

- Je vais suivre les mêmes étapes que le projet précédent sauf que je vais ajouter une dépendance openFeign pour qu'il puisse communiquer avec l'autre microservice pour le service client.
 
L’interface CustomerRestClient

 
La base de données :
 


Projet adria-Eureka-service

 

 
Tester l’application  
Essayons Maintenant de visualiser les informations d’une facture :
 
La même chose pour la liste de tous les factures :
 



La Gateway :
 



Acceder au service customer via la gateway
 
Consulter un client via la gateway :
 
Consulter la liste des factures :
 

