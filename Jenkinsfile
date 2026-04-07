pipeline {
    agent any

    tools {
        maven 'Maven'   // Make sure Maven is configured in Jenkins (Global Tool Config)
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Pritnimbalkar/my-app.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Report') {
            steps {
                publishHTML([
                    reportDir: 'target',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Automation Test Report',
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true
                ])
            }
        }
    }

    post {
        always {
            echo 'Build Finished'
        }
        success {
            echo 'Build SUCCESS '
        }
        failure {
            echo 'Build FAILED '
        }
    }
}
