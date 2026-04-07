pipeline {
    agent any

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
                publishHTML(target:[
                    allowMissing:true,
                    alwaysLinkToLastBuild:true,
                    keepAll:true,
                    reportDir: 'target',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}

