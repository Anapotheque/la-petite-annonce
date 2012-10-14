echo off
cls

SET URL_REPOSITORY=https://la-petite-annonce.googlecode.com/svn/repo/
SET PACKING=jar
SET VERSION=1.0.1B
SET ARTIFACT_ID=jta
SET GROUP_ID=javax.transaction.jta
SET REPOSITORY_ID=artifacts-server
SET FILE=sources/jta-1.0.1B.jar

call scripts/mvn-deploy-common.cmd
