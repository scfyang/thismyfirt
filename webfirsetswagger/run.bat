title webSum


echo http://127.0.0.1:8989/swagger
setlocal enabledelayedexpansion 
set Classpath=classes
FOR %%C IN (lib/*.jar) DO set Classpath=!Classpath!;lib\%%C
set newClassPath=%Classpath%:=%
echo %newClassPath% 
java -cp %newClassPath% com.web.app.WebSumApplication server config.yml
pause