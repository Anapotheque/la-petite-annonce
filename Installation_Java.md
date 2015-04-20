# INSTALLATION & CONFIGURATION DE JAVA SOUS WINDOWS #


&lt;hr/&gt;



  1. [Les pré-requis](Installation_Java#Les_pre-requis.md)
  1. [Les bases](Installation_Java#Les_bases.md)
  1. [Installer un JRE sur son poste](Installation_Java#Installer_un_JRE_sur_son_poste.md)
  1. [Installer\_un\_JDK sur son poste](Installation_Java#Installer_un_JDK_sur_son_poste.md)

## **Les pré-requis** ##


&lt;hr/&gt;


  * un pc sous Windows

## **Les bases** ##


&lt;hr/&gt;



  * Qu'est qu'une **JRE** ( Java runtime Environnement ) ?
> _Rien d'autre que le moteur d’interprétation du code compilé par le JDK quelque soit la plateforme.
> Un fichier X.class issu de la compilation par une JDK sous plateforme Unix sera t-il exécutable sous une JRE sous Windows ou un autre system que celui d'Unix ? ( drixx moi je dirai oui mais la j'ai un doute )._

  * Qu'est qu'un **JDK** ( Java Developpement Kit ) ?
> _Comme son nom l'indique si s'agit d'un ensemble d'outils vous permettant d’écrire des classes java avec des Api comme JDBC et de pouvoir les compiler avec javac etc et donc de generer les fameux .class qui seront interprété par la JRE._

  * Quelles différences entre **SDK** et **JDK** ?
> _JDK = Java Developpement Kit_<br />
> SDK = Sun Developpement Kit<br />
> La différence ?

> _SDK égal implémentation du JDK de Sun Microsystem (rachété par Oracle désormais). Il existe plein d'implémentation du JDK. Personnellement, sur mon Linux, j'ai un OpenJDK. Attention, certaines applications comme NetBeans? par exemple n'accepte que l'implémentation de Sun. Pour la petite histoire, la première année où le gouvernement a mis en place la déclaration des impôts en ligne, seul le JDK de Microsoft était accepté : vu qu'il ne me restait que quelques heure avant la date limite (c'est tout moi ça), j'avais dû faire une désinstallation complète (le switch entre JDK n'existait pas encore) pour remplir mon devoir citoyen ;-)_

  * Question sur les versions, quelles différences entre **JDK 1.5** et **JDK 5.0** ?
> _En fait on parle de Java 2 et de JRE 1.5. Pourquoi Java 2 : parce que la première version de Java était tellement lente par rapport aux suivantes qu'on considéra ce passage comme une version majeure._

  * Question sur les types, quelles différences entre **JDK EE** et **JDK SE** ?
> _Nous utiliserons une **JDK SE** (standard édition)._

## **Installer un JRE sur son poste** ##


&lt;hr/&gt;


Ouvrez une invite de commande et tapez la commande ci-dessous.
```
java -version
```
si vous obtenez le message suivant
```
'java' n'est pas reconnu en tant que commande interne
ou externe, un programme exécutable ou un fichier de commandes.
```
vous ne possédez pas de JRE sur votre poste, et donc, vous n'avez jamais eu à déclarer vos impôts !
Si vous obtenez autre chose alors veuillez vérifier que la version de la JRE n'est pas inférieure à la version 1.5, sinon il vous faudra désinstaller cette version pour en prendre une plus récente !!

  * <a href='http://www.oracle.com/technetwork/java/javase/downloads/jre7u7-downloads-1836441.html'><b>Telecharger la JRE 7</b></a>

Une fois que tout est fini, vous pourrez retaper la ligne de commande vu au dessus, vous devriez obtenir : ( pour un jre version : 7 )
```
java version "1.7.0_07"
Java(TM) SE Runtime Environment (build 1.7.0_07-b11)
Java HotSpot(TM) Client VM (build 23.3-b01, mixed mode, sharing)
```

## **Installer un JDK sur son poste** ##


&lt;hr/&gt;


Ouvrez une invite de commande et tapez la commande ci-dessous.
```
javac -version
```
si vous obtenez le message suivant
```
'java' n'est pas reconnu en tant que commande interne
ou externe, un programme exécutable ou un fichier de commandes.
```
vous ne possédez pas de JDK sur votre poste.
Si vous obtenez autre chose alors veuillez vérifier que la version de la JDK n'est pas inférieure à la version 1.5, sinon il vous faudra en installer une plus récente !!

  * <a href='http://www.oracle.com/technetwork/java/javase/downloads/jdk7u7-downloads-1836413.html'><b>Telecharger la JDK 7</b></a>

Une fois que tout est fini, vous pourrez retaper la ligne de commande vu au dessus, vous devriez obtenir : ( pour un jdk version : 7 )
```
javac 1.7.0_07
```


&lt;hr/&gt;


## Feliciation, vous avez maintenant un poste configuré pour tourner avec JAVA. ##

[Retour à l'installation de mon environnement developpement](Beginners.md)