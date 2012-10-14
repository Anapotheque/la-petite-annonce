@echo off

@REM Applications
@REM : Directory : lieu ou la console se place à l'ouverture ( je l'ai mis sur mon project par exemple )
set DIRECTORY=C:\Developpement\projects\

@REM : JAVA_HOME : Permet de switch d'une JDK 1.5 à une autre 1.7 par exemple
set JAVA_HOME=C:\Developpement\tools\java\jdk

@REM : M2_HOME : Permet de switch d'un maven 2.2.1 à un maven 3.0 par exemple
set M2_HOME=C:\Developpement\tools\maven

@REM : Configuration de maven en terme de proxy, repo distant tout ça ( à venir ) pour le moment ne mettez rien ça gene pas
set GLOBAL_SETTINGS=C:\Developpement\tools\settings\maven\global\settings.xml
set USER_SETTINGS=C:\Developpement\tools\settings\maven\users\settings.xml

@REM Options maven
set MAVEN_OPTS=-Xms256m %MAVEN_OPTS%
set MAVEN_OPTS=-Xmx512m %MAVEN_OPTS%
set MAVEN_OPTS=-XX:PermSize=64m %MAVEN_OPTS%
set MAVEN_OPTS=-XX:MaxPermSize=512m %MAVEN_OPTS%
set MAVEN_OPTS=-Duser.language=fr %MAVEN_OPTS%
set MAVEN_OPTS=-Duser.locale=fr %MAVEN_OPTS%
@REM set MAVEN_OPTS=-Duser.home=%JTBOX_INST_USER_SETTINGS_DIR% %MAVEN_OPTS%
set MAVEN_OPTS=-Dorg.apache.maven.global-settings=%GLOBAL_SETTINGS% %MAVEN_OPTS%
set MAVEN_OPTS=-Dorg.apache.maven.user-settings=%USER_SETTINGS% %MAVEN_OPTS%

set PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%

@echo on
@echo --------------------------------------------------------------
@echo -  CORPOCONCEPT - BOX                                        -
@echo --------------------------------------------------------------
@echo off
cd %DIRECTORY%
cmd.exe