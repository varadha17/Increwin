pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('RunTest') {
            steps {
                //bat
                sh "mvn test -Dcucumber.filter.tags=@product"
            }
        }
    }
}