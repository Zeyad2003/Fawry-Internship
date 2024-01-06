# Compile Java source files
javac -d out $(find . -name '*.java')

# Change directory to out
cd out

# Run the Client class
java src.Client
