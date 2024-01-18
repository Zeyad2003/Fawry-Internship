# Configure the prepare.sql file to gurantee the database and user are exist
mysql -u root < src/main/resources/prepare.sql

# run the JPA Practice
mvn clean compile exec:java -Dexec.mainClass="org.hibernatetask.jpa.JPAPractice" -Dexec.cleanupDaemonThreads=false

# Run the Hibernate Task solution
mvn exec:java -Dexec.mainClass="org.hibernatetask.Main" -Dexec.cleanupDaemonThreads=false
