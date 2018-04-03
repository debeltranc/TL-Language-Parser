# TL-Language-Parser
Lexer and Parser for the TL language using Antlr4

El proyecto usa Eclipse

# Ejecución manual en Windows
0) SET CLASSPATH=.;D:\Java\Antlr\antlr-4.7-complete.jar;%CLASSPATH%
1) java org.antlr.v4.Tool Java.g4 -visitor
2) javac Java*.java
3) java org.antlr.v4.runtime.misc.TestRig Java compilationUnit –gui ArchivoParaAnalizar.txt 

## Referencias
http://www.antlr.org/api/Java/org/antlr/v4/runtime/BaseErrorListener.html <br>
http://www.antlr.org/api/Java/org/antlr/v4/runtime/ANTLRErrorListener.html
