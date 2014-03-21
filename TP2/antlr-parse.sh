#!/bin/sh
export CLASSPATH='./lib/antlr-4.2-complete.jar:./bin'
java org.antlr.v4.runtime.misc.TestRig logoparsing.grammar.Logo programme -gui programs/logo-prg.txt
