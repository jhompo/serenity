pipeline {
    agent any
    tools {
        maven 'M2_HOME' // Configura la versión de Maven instalada en Jenkins
        jdk 'JDK-17' // Configura la versión de JDK instalada
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
                reportDir: 'target/site/serenity', // Carpeta donde está el reporte
                reportFiles: 'index.html', // Archivo HTML principal
                reportName: 'Reporte de Pruebas',
                keepAll: true, // Mantener reportes de builds anteriores
                alwaysLinkToLastBuild: true, // Enlace al último reporte generado
                allowMissing: false // Falla si no encuentra el archivo
            ])
        }
    }
}