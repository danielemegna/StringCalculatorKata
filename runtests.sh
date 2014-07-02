javac -cp '/usr/share/java/junit4-4.11.jar' *.java spec/*.java && java -cp '.:./spec/:/usr/share/java/junit4-4.11.jar' org.junit.runner.JUnitCore TestStringCalculator
