#!/bin/sh
export CLASSPATH=./lib/antlr-4.2-complete.jar
java -cp $CLASSPATH org.antlr.v4.Tool -visitor -o src/logoparsing  grammar/Logo.g4
