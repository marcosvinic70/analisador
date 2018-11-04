#!/usr/bin/env bash
java -jar lib/antlr-4.7.1-complete.jar -o resources/dots -package dots -listener -no-visitor -atn -lib src/lex/Scanner.g4
