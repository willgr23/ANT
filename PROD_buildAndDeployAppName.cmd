rem  ---------------------------------------------------------------------------
rem  This command file executes the buildAndDeployAppName.xml file, which builds
rem  and deploys an application properties, xml and jar file.
rem  ---------------------------------------------------------------------------

set scriptDir=c:\ssd\ant
set logsDir=c:\ssd\ant\logs\
set buildfile=\buildAndDeployAppName.xml
echo %scriptDir%
ant -buildfile %scriptDir%%buildfile% -Dpropfile=PROD_appName.properties -logfile %logsDir%PROD_buildAndDeployAppName.log -verbose