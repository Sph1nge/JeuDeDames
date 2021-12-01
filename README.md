  ############################ Jeu De Dames ##########################

                    Jeu de Dame dévéloppé en Java, en mode console.

  ################ bibliothèque utilisée ##############

GridLayout: le plateau et ses composant graphique.
swing.JPanel, GridLayout: le plateau et ses composant graphique.
awt.Color, awt.GradientPaint, awt.Graphics, awt.Graphics2D, awt.Paint


  #################### But du jeu (cahier de charge) ##############################

•	Dans un premier temps, il faut créer un jeu fonctionnel dont les règles reposent sur l'utilisateur (pas de vérifications)
•	On veut un plateau de jeu, des pions, des dames, des cases de différentes couleurs (voir moodle)
•	Capturer ou immobiliser les pièces de son adversaire.



  ######################### Preparation et Règles du jeu ###################

Le damier est disposé de sorte que la case en bas à gauche soit de la couleur foncée.
Chaque joueur place ses pions sur les cases de couleur foncée. Avant le début d'une partie, 
il y a donc deux lignes au milieu du damier qui sont vides et séparent les deux camps.
Ce sont les blancs qui commencent, comme aux échecs, et contrairement à Othello, ou au jeu de go.
le périmètre est une zone d'invincibilité (on peut pas manger et atterir en dehors du plateau)
les pions peuvent manger les dames
les dames peuvent se déplacer et manger les pions en vertical


         ############################# Conception ############################
Au lancement du jeu, vous êtes libres de pouvoir jouer sur un plateau de la taille de votre choix 
ou de rester sur une taille par défaut de 9*9.
Le nombre de pions s'adaptent à la taille indiqué.

########################### Rôle et repartition des tâches ##########################
 -Mohamed FARISSI : plateaux de jeux  
 -Axel    CLODION : Pions et listeners 
 -Hadidja MOUSTOIFA:Cases et listeners



