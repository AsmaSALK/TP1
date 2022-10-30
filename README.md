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
![image](https://user-images.githubusercontent.com/97363124/198903801-08651280-82ed-43c1-9207-2f3811385820.png)

 
	L’interface CustomerRepository:
 ![image](https://user-images.githubusercontent.com/97363124/198903840-fecf625f-9afb-460b-b1d5-83023df571bb.png)

	Les classes CustomerResponseDTO et CustomerRequestDTO de la partie DTO.

 ![image](https://user-images.githubusercontent.com/97363124/198903853-b9510704-5fec-418f-8942-114d797e05aa.png)
![image](https://user-images.githubusercontent.com/97363124/198903856-bf3e64c4-a883-4cd2-9784-2c488179c5d9.png)

 
	L’interface CustomerService son implémentation
 
![image](https://user-images.githubusercontent.com/97363124/198903862-099ec9f1-a6f9-42d2-8ff5-769615b8fbef.png)

 ![image](https://user-images.githubusercontent.com/97363124/198903866-6118e32a-8926-48dd-be2f-497a9d1b4695.png)

	La classe CustomerMapper 
 ![image](https://user-images.githubusercontent.com/97363124/198903870-f79cd18f-9a47-43c3-8db1-ce70125d96ba.png)

Puis tester l’application dans le main :
 ![image](https://user-images.githubusercontent.com/97363124/198903874-94e06951-46d4-488e-bc7c-7abe9985adac.png)

la base de données  a était bien créer ainsi que les deux client sont bien ajouté :
 ![image](https://user-images.githubusercontent.com/97363124/198903882-355184f1-e30c-43c5-8d4e-791c2e1fe34a.png)





Tester l’application avec Swagger  :
 
 ![image](https://user-images.githubusercontent.com/97363124/198903888-b00b161e-bd0a-48dd-b9db-22b3f8734c24.png)

Projet Billing service

- Je vais suivre les mêmes étapes que le projet précédent sauf que je vais ajouter une dépendance openFeign pour qu'il puisse communiquer avec l'autre microservice pour le service client.
 ![image](https://user-images.githubusercontent.com/97363124/198903903-100910dd-89df-4dd1-8498-9598948d37ed.png)

L’interface CustomerRestClient

 ![image](https://user-images.githubusercontent.com/97363124/198903914-3a984b8a-bf21-4988-a6ab-ffa64c23f3ca.png)

La base de données :
 ![image](https://user-images.githubusercontent.com/97363124/198903918-7e541305-14d3-4d73-a79e-9c101ed57074.png)



Projet adria-Eureka-service
![image](https://user-images.githubusercontent.com/97363124/198903930-8ef61cc1-56b5-45c7-bea7-22a0610edb95.png)

 ![image](https://user-images.githubusercontent.com/97363124/198903938-be144f44-f24a-4653-b01a-58e1e00057f7.png)


 
Tester l’application  
![image](https://user-images.githubusercontent.com/97363124/198903945-49d9726c-39ab-4b48-95d9-e91d0b1a3cd9.png)

Essayons Maintenant de visualiser les informations d’une facture :
 ![image](https://user-images.githubusercontent.com/97363124/198903952-353777e5-16ae-4a64-94cd-632af5a60fff.png)

La même chose pour la liste de tous les factures :
 ![image](https://user-images.githubusercontent.com/97363124/198903957-120d0b0c-99d0-40ff-bd3b-682d62eb7ca5.png)




La Gateway :

![image](https://user-images.githubusercontent.com/97363124/198903981-f269dfd1-9d66-45b0-8fd0-fe3a6eaf2bd3.png)

 ![image](https://user-images.githubusercontent.com/97363124/198903968-d37efa06-1129-4b40-82cf-6cc1bb6f8d2d.png)




Acceder au service customer via la gateway
 ![image](https://user-images.githubusercontent.com/97363124/198903995-b4eca13e-09d3-43bc-82be-da0b6d43927e.png)

Consulter un client via la gateway :
 ![image](https://user-images.githubusercontent.com/97363124/198904000-a03cdd75-26c5-4c2c-9228-344b20c2b6fc.png)

Consulter la liste des factures :
 ![image](https://user-images.githubusercontent.com/97363124/198904008-43a13a0c-aee1-4285-ab4f-2c9f55ccfc24.png)


