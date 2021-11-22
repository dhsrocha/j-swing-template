SHELL = /bin/sh

define HELP

	Commands:

	  * build : Builds application in jar file.
	  * run   : Builds application and runs it from created jar.

endef
export HELP

.PHONY: all help build run
ID=$(shell ./mvnw -q help:evaluate -Dexpression=project.artifactId -DforceStdout)
VER=$(shell ./mvnw -q help:evaluate -Dexpression=project.version -DforceStdout)

all help:
	@echo "$$HELP"

build: $(whereis java) ./mvnw
	@echo "::: Building app :::"
	./mvnw -q clean package

.ONESHELL:
run: $(whereis java) ./mvnw
	@echo "::: Running app :::"
	./mvnw -q clean package shade:shade
	java -jar "target/${ID}-${VER}.jar"
