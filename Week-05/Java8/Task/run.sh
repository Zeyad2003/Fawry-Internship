# Compile Java source files
javac -d out $(find . -name '*.java')

# Change directory to out
cd out

# Run the LambdaExample class
java src.LambdaExample

# Run the StreamsExample class
java src.StreamsExample
