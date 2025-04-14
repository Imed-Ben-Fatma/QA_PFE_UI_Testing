Feature: Gestion des Chefs des Zone
  Afin de garantir une gestion efficace des chefs de zone
  En tant qu'administrateur
  Je souhaite ajouter ou annuler l'ajout d'un chef de zone dans le système

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  Scenario: Ajouter une remise avec succès
    When the user clicks on Remise&Offer
    And the user clicks on Discount
    And the user clicks on ajoute remise button
    And the user selects mode de selection 0
    And the user selects partenaire associé 0
    And the user enters Titre de remise "Jean"
    And the user enters Taux de remise "15"
    And the user enters Description "fiuef ehfohufeh h f hfohf"
    And the user selects Type de remise 0
    And the user enters date debut "2021-01-01"
    And the user clicks on enregistrer remise button
    Then le remise est ajouté avec succès


