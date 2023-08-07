pipeline {
    // master executor should be set to 0
    agent any
    tools { 
      maven 'MAVEN_HOME' 
      jdk 'Java_Home' 
    }
    stages {
        stage('RunTest') {
            steps {
                //bat
                sh "mvn test -Dcucumber.filter.tags=@product"
            }
        }
    }
}
