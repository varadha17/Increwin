pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Test') {
            steps {
                //bat
                sh "mvn test -Dcucumber.filter.tags=@product"
            }
        }
    }
}