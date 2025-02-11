pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9' // Configura la versión de Maven instalada en Jenkins
        jdk 'JDK 17' // Configura la versión de JDK instalada
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/jhompo/serenity.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }
    }
    post {
        always {
            publishHTML([
                reportDir: 'target/site/serenity',
                reportFiles: 'index.html',
                reportName: 'Serenity Test Report'
            ])
        }
    }
}