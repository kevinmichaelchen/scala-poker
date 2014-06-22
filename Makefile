all:
	scalac -d bin/ src/*.scala

clean:
	rm bin/*

run:
	scala -classpath bin/ Singleton
