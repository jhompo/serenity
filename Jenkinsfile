pipeline {
    agent any
    tools {
        maven 'M2_HOME' // Configura la versión de Maven instalada en Jenkins
        jdk 'JDK-17' // Configura la versión de JDK instalada
    }

    environment {
        JAVA_HOME = '/opt/java/openjdk'
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
        WORKSPACE = pwd()
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
//     post {
//         always {
//             publishHTML(target: [
//                 allowMissing: false,
//                 alwaysLinkToLastBuild: true,
//                 keepAll: true,
//                 reportDir: 'serenity',
//                 reportFiles: 'index.html',
//                 reportName: 'Serenity Report'
//             ])
//         }
//     }
}
