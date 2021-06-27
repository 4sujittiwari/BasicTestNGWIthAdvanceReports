pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK'
    }
    stages {
        stage ('Test') {
            steps {
                sh 'mvn clean test -Dheadless=true' 
            }
        }
    }
}
