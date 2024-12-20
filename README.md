# JakAssist - A Jakarta EE Assistant for Source Code Generation

This project aims at providing a Jakarta EE assistant, with source code generation
using the domain model as a reference. It is composed of an API (built, itself
using Jakarta EE) and a client (frotend) application built with Angular.

## Datasource configuration

```
> $WILDFLY_HOME/bin/jboss-cli.sh --connect
jboss-cli> data-source add --jndi-name=java:/jakassistDS --name=jakassistDS --connection-url=jdbc:postgresql://localhost:5432/jakassist --driver-name=postgresql --user-name=jakassist --password=password
jboss-cli> /subsystem=datasources/data-source=jakassistDS:test-connection-in-pool()
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=min-pool-size, value=5)
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=max-pool-size, value=20)
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=pool-prefill, value=true)
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=validate-on-match, value=true)
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=background-validation, value=false)
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=valid-connection-checker-class-name, value=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLValidConnectionChecker)
jboss-cli> /subsystem=datasources/data-source=jakassistDS:write-attribute(name=exception-sorter-class-name, value=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLExceptionSorter)
```


## Install

Coming soon...
