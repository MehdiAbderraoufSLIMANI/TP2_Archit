# TP2_Archit

# question 4
empêcher les classes les plus stables (haut niveau) de dépendre de classes moins stables (bas niveau) comme la classe dbconnection, et avec cela si nous changeons la classe de bas niveau cela n'affectera pas les classes de haut niveau, Les modules de haut niveau doivent interagir avec les abstractions(les interfaces)

# question 10
- on peut ajouter un interface 'IEtudiant' pour éviter la declaration d'un nouvel étudiant dans la class 'EtudiantService'
- on peut mettre les méthodes de vérifiecation de format de l’email, la vérifiecation de l’existence de l’email et du matricule dans la classe 'EtudiantRepository' car elle est liée aux méthodes des étudiants
- on peut mettre les méthodes de initialise le nombre de livre mensuel autorisé dans la classe 'UniversiteRepository' car elle est liée aux méthodes des universite
