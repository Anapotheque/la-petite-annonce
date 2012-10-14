SET DEPLOY_CMD= -Dfile=%FILE%
SET DEPLOY_CMD= %DEPLOY_CMD% -Dpackaging=%PACKING%
SET DEPLOY_CMD= %DEPLOY_CMD% -Durl=%URL_REPOSITORY%
SET DEPLOY_CMD= %DEPLOY_CMD% -Dfile=%FILE%
SET DEPLOY_CMD= %DEPLOY_CMD% -DrepositoryId=%REPOSITORY_ID%
SET DEPLOY_CMD= %DEPLOY_CMD% -DgroupId=%GROUP_ID%
SET DEPLOY_CMD= %DEPLOY_CMD% -DartifactId=%ARTIFACT_ID%
SET DEPLOY_CMD= %DEPLOY_CMD% -Dversion=%VERSION% 

echo "============================================="
echo "==  %GROUP_ID%.%ARTIFACT_ID% : %VERSION%  ==="
echo "============================================="

mvn org.apache.maven.plugins:maven-deploy-plugin:2.5:deploy-file %DEPLOY_CMD%