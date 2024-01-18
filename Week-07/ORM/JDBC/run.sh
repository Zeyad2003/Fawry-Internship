# Add the database pre-configuration
mysql -u root < prepare.sql

# Compile Java source files
javac -d out $(find . -name '*.java')

# Change directory to out
cd out

# Add the MySQL Connector JAR to classpath
CLASSPATH=.:../lib/mysql-connector-j-8.2.0.jar

# Run the tryJDBC class with the classpath flag
java -classpath $CLASSPATH src.tryJDBC
