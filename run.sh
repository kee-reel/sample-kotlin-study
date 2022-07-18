kotlinc $1/main.kt -include-runtime -d $1/main.jar || exit 1
cd $1
java -jar main.jar
rm main.jar
