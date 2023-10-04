create database examen
CREATE TABLE utilisateurs (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nomUtilisateur VARCHAR(255),
    motDePasse VARCHAR(255)
);
select * from utilisateurs

DELETE  FROM produit
WHERE id = 14;

-- Création de la table "fournisseur"
CREATE TABLE fournisseur (
    id INT  IDENTITY(1,1) PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    adresse VARCHAR(255),
    numero_telephone VARCHAR(15),
    adresse_mail VARCHAR(255),
    sexe CHAR(1)
);

-- Création de la table "client"
CREATE TABLE client (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    adresse VARCHAR(255),
    numero_telephone VARCHAR(15),
    adresse_mail VARCHAR(255),
    sexe CHAR(1)
);

-- Création de la table "produit"
CREATE TABLE produit (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nom_produit VARCHAR(255),
    type_produit VARCHAR(255),
    fournisseur_id INT,
    FOREIGN KEY (fournisseur_id) REFERENCES fournisseur(id)
);

-- Création de la table "approvisionnement"
CREATE TABLE approvisionnement (
    id INT IDENTITY(1,1) PRIMARY KEY,
    produit_id INT,
    quantite INT,
    fournisseur_id INT,
    mesure VARCHAR(255),
    prix DECIMAL(10, 2),
    FOREIGN KEY (produit_id) REFERENCES produit(id),
    FOREIGN KEY (fournisseur_id) REFERENCES fournisseur(id)
);
			 
 
select * from client

DELETE FROM approvisionnement;

DBCC CHECKIDENT('approvisionnement', RESEED, 0);

DBCC CHECKIDENT('approvisionnement', RESEED, 0);

ALTER TABLE approvisionnement
ADD date DATE;
select * from approvisionnement
select * from utilisateurs




