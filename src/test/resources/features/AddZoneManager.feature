Feature: Gestion des Chefs de Zone
  Afin de garantir une gestion efficace des chefs de zone
  En tant qu'administrateur
  Je souhaite ajouter ou annuler l'ajout d'un chef de zone dans le système

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  Scenario: Ajouter un chef de zone avec succès
    When the user clicks on chef de zone
    And the user clicks on ajoute button

    And the user clicks on information section
    And the user selects status 1
    And the user enters nom "Dupont"
    And the user enters prenom "Jean"
    And the user enters date de naissance "01/01/1996"
    And the user selects sexe 1
    And the user enters phone number "012345678"
    And the user enters email "jexh5gaont@example.com"
    And the user clicks on address section
    And the user selects governorate 2
    And the user selects ville 3
    And the user enters adresse "123 Rue Principale"
    And the user enters GPS coordinates "36.8000, 10.1667"
    And the user clicks on contact and details section
    And the user enters date debut contrat "2021-01-01"
    And the user enters date fin contrat "2023-01-01"
    And the user uploads contrat PDF
    And the user clicks on enregistrer button
    Then le chef de zone est ajouté avec succès


