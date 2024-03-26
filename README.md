This project includes a method for finding the index of a string within another string in the indexOfString method in the MyString class, and a method to replace a substring of a string with another string in the replace method of the StringUtil class.
The replace method uses the indexOfString method.

The project can be built from the command line with: mvn clean package assembly:single

The mutation score and code coverage of the MyString class can be checked from the command line with: mvn clean test-compile org.pitest:pitest-maven:mutationCoverage

The build will fail if the mutation score or code coverage is below 95%.
