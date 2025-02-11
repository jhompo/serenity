pipeline {
    agent any
    tools {
        maven 'Maven 3.8.1' // Configura la versión de Maven instalada en Jenkins
        jdk 'JDK 11' // Configura la versión de JDK instalada
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tu-repositorio/my-serenity-project.git'
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