TPMicroService

Cette activité montre l'utilisation de micro service dans la gestion des comptes, alors on va créer un projet de type Spring inializr qui s'appelle compte-service. 
Aussi on va télécharger les dépendances nécessaire tel que:
-spring data JPA et H2 Database (base de donner memoire)
-Lombok: pour genere les geters et seters
-Rest repositories 

Dans la partie DAO de micro-service on va créer une interface CompteRepository qui permet de fournir les opérations de base pour la gestion d'un compte, par la suite nous avons tester notre application en insérant quelque comptes dans la base de données H2, et en affichant la liste des comptes insérés.


![image](https://user-images.githubusercontent.com/61788817/163655741-7cdfe4de-d629-4186-b3c7-a1aaf9fcba4f.png)


Le résultat de code:

![image](https://user-images.githubusercontent.com/61788817/163655801-4f779eef-3849-44d1-be73-407bbd255074.png)

Consultation de BD en utilisant H2-console qui est un outil virtuel qui vous aide à administrer la base de données H2.

![image](https://user-images.githubusercontent.com/61788817/163655890-58a90ef0-4b2a-4ced-bee1-96e1df97a06f.png)

La création de RestController pour la couche web qui précise pour chaque path la méthode qui sera invoquée.

La liste des comptes en format JSON

![image](https://user-images.githubusercontent.com/61788817/163655954-e0c3714b-3856-4272-b6b2-d5f1126aa0b9.png)

Si on veut présicer le compte avec son code 

![image](https://user-images.githubusercontent.com/61788817/163656027-0f24563f-46dd-404e-9bd0-5cd5decce46d.png)

On va tester la méthode qui permet d'ajouter un compte par l'outil POSTMAN qui est une application permettant de tester des API et renvoyer des réquetes post foot


![image](https://user-images.githubusercontent.com/61788817/163656598-2d4db61a-9510-4457-a7ac-0188e0d6d776.png)


-Tester la méthode save pour ajouter un compte

![image](https://user-images.githubusercontent.com/61788817/163656743-98a97be0-d7e2-48d5-a840-2fcb55c17093.png)


- Tester la méthode update pour modifier un compte

![image](https://user-images.githubusercontent.com/61788817/163656808-9e605f82-116a-4e3f-a383-63432d344588.png)


 -Tester la méthode delete pour supprimer un compte
 
 ![image](https://user-images.githubusercontent.com/61788817/163656852-b55e6e86-31eb-442f-97cc-9d363560a42a.png)


Documentation de micro-service

![image](https://user-images.githubusercontent.com/61788817/163656970-c694dc25-a437-4138-8696-de1f728c9474.png)


De meme en utilisant la documentation  micro-service si on a besoin de connaitre la structure des requettes dans postman

![image](https://user-images.githubusercontent.com/61788817/163657053-405be03d-4c81-42d0-8544-bfac01550c27.png)


![image](https://user-images.githubusercontent.com/61788817/163657156-08d100a8-e7b5-4963-a57d-0c114f58ffea.png)


 
Tester les méthodes en utilisant swagger qui est un langage de description d'interface permettant de décrire des API RESTful exprimées à l'aide de JSON. 
-Afficher les comptes

![image](https://user-images.githubusercontent.com/61788817/163657406-25d8c3f3-ff69-4b41-9ef2-9adfaf4bcbdf.png)

-Ajouter un compte

![image](https://user-images.githubusercontent.com/61788817/163657427-4b991909-1b89-48a9-a4a5-53fc2c3ed56a.png)

-Supprimer un compte

![image](https://user-images.githubusercontent.com/61788817/163657439-6e45c06a-f95e-46d4-99f3-c1ad0c30b3fa.png)

Maintenant on utilise un module Spring Data Rest pour créer un micro-service qui permet d'effectuer les opérations de CRUD

![image](https://user-images.githubusercontent.com/61788817/163657606-c9c4c9ad-ef7e-48a0-a174-f2aee30eff26.png)

Aussi il nous a permet de faire les projections

Exemple 1 :on veut afficher projection numero 1

![image](https://user-images.githubusercontent.com/61788817/163657691-43f330f7-3b46-4a24-8d49-da60cb951bdd.png)

Exemple 2: on utilise les méthodes par exemple affichage des comptes qui ont de type COURANT


 ![image](https://user-images.githubusercontent.com/61788817/163657787-cd1d6268-b0fe-410f-9445-c142e5545997.png)


Utilisation de couche métier pour faire un virement d'un compte vers un autre.

![image](https://user-images.githubusercontent.com/61788817/163657894-12720686-91a1-4ef1-a79b-f469701dbd1c.png)


![image](https://user-images.githubusercontent.com/61788817/163657911-40ec09c2-6b11-423f-baf5-3c64b347ff10.png)





