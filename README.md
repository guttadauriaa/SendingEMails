# SendingEMails
Sample Java Application that sends mail.

## Get the code and setup the project

This project uses [Maven](https://maven.apache.org/) for dependencies and building.

You can use maven from the terminal or you can open the project from an IDE like IntelliJ IDEA or Eclipse.

```bash
$ git clone https://github.com/guttadauriaa/SendingEMails
$ cd SendingEMails
$ mvn clean install
```

This will download all the required dependencies.

## Compiling and running

This applications connects to a smtp server to send a simple email.

Make sure to modify the variables (to, from, host, user, pass) in the source code to use your account and server before building the application.

Then, build the app with :

```bash
$ mvn compile
```

To run it with the maven exec plugin :

```bash
$ mvn exec:java
```

To generate a jar :

```bash
$ mvn package
```
