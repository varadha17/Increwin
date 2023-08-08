pipeline {
    // master executor should be set to 0
    agent any
    tools { 
      maven 'MAVEN_HOME' 
      jdk 'Java_Home' 
    }
    parameters {
  		choice choices: ['TestRunner', 'TestRunnerForFailedScenarios'], name: 'Runner'
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
            	script{
            	   //bat
                	output = runner()
                	sh "mvn test -Dtest= ${output}" 
            	}               
            }
        }
    }
}

def runner() {
    return "Choice: ${params.CHOICE}"
}
