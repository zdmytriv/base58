FROM java:8
COPY app/ /app/
WORKDIR /app/
RUN javac -classpath base58-codec-1.1.0.jar:commons-lang3-3.7.jar Main.java
ENTRYPOINT ["java", "-cp", "base58-codec-1.1.0.jar:commons-lang3-3.7.jar:.", "Main"]
CMD []