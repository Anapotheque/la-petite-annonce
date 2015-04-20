# BONNES PRATIQUES #

_Cette section va regrouper l'ensemble des bonnes pratiques en matière de coding, organisation logicielle._

## Sommaire ##


&lt;hr/&gt;



  * [Organisé ton poste sera](#Organise_ton_poste_sera.md)
  * [Indenté ton code sera](#Indente_ton_code_sera.md)

## Organisé ton poste sera ##


&lt;hr/&gt;



Que l'on travaille sous windows, linux, ou mac, il semble évident que si vous avez vos programmes java, workpsace eclipse, un maven etc etc éparpillés de partout sur votre disc ça va vitre devenir le bordel et vous aller passer un temps fou en ligne de commande.

Personnellement je recommande d'organisation son poste comme ça :

  * developpement
    * projects : ici vous mettez tous vos programmes ( checkout svn)
    * tools : ici vous installerez tout ce qui a rapport à java ( jre / jdk / servers / base de données / maven & repository maven ... )
    * workspace : eclipse doit toujours importer les projects venant du repertoire projects.

## Indenté ton code sera ##


&lt;hr/&gt;



Je fournirai bientôt un template pour indenter automatique le coding sous éclipse et comment faire qu'il se fasse automatiquement en supprimant les imports **inutilisés**

Pour ce qui est des fichiers XML ou Type HTML :

Bien

```
   <balise0>
      <balise1>
         <balise2>test</balise2>
      </balise1>
   <balise0>
```

Pas Bien

```
   <balise0><balise1>
         <balise2>test</balise2>
      </balise1><balise0>
```

Pas Bien

```
   <balise0><balise1><balise2>test</balise2></balise1><balise0>
```



&lt;hr/&gt;


[Retour à l'installation de mon environnement developpement](Beginners.md)