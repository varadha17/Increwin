pipeline {
    // master executor should be set to 0
    agent any
    tools { 
      maven 'MAVEN_HOME' 
      jdk 'Java_Home' 
    }
    parameters{
        choice(name: 'Runner', choices: ['TestRunner', 'TestRunnerForFailedScenarios'], description: 'Pick something')
    }
    stages {
    	stage('Package Jar') {
            steps {
                //bat
                sh "mvn clean package -DskipTests"
            }
        }
        stage('RunTest') {
            steps {
                //bat
                sh "mvn test -Dtest=Choice: ${params.CHOICE}"
            }
        }
    }
}
