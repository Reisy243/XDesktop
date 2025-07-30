all: out/XDFM.jar

out/XDFM.jar: Manifest/XDFM.manifest out/io/github/reisy243/XDesktop/XDFM/Forms/FormExplorer.class out/io/github/reisy243/XDesktop/XDFM/Main.class
	jar cfm out/XDFM.jar Manifest/XDFM.manifest -C out io/github/reisy243/XDesktop/XDFM

out/io/github/reisy243/XDesktop/XDFM/Forms/FormExplorer.class: io/github/reisy243/XDesktop/XDFM/Forms/FormExplorer.java
	javac -d out -cp out io/github/reisy243/XDesktop/XDFM/Forms/FormExplorer.java

out/io/github/reisy243/XDesktop/XDFM/Main.class: io/github/reisy243/XDesktop/XDFM/Main.java
	javac -d out -cp out io/github/reisy243/XDesktop/XDFM/Main.java

clean:
	rm -rvf out
