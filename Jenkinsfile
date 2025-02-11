pipeline {
    agent any
    tools {
        maven 'M2_HOME' // Configura la versión de Maven instalada en Jenkins
        jdk 'JDK-17' // Configura la versión de JDK instalada
    }

    environment {
        JAVA_HOME = '/opt/java/openjdk'
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/jhompo/serenity.git'
            }
        }
        stage('Check Java Version') {
            steps {
                sh 'echo $JAVA_HOME'
                sh 'java -version'
            }
        }
//         stage('Install Chrome & ChromeDriver') {
//             steps {
//                 sh '''
//                 # Instalar Google Chrome
//                 apt update && apt install -y google-chrome-stable
//
//                 # Descargar ChromeDriver compatible con la versión instalada
//                 CHROME_VERSION=$(google-chrome --version | awk '{print $3}' | cut -d '.' -f 1)
//                 wget -q https://chromedriver.storage.googleapis.com/$(curl -s https://chromedriver.storage.googleapis.com/LATEST_RELEASE_$CHROME_VERSION)/chromedriver_linux64.zip
//                 unzip chromedriver_linux64.zip
//                 mv chromedriver /usr/bin/chromedriver
//                 chmod +x /usr/bin/chromedriver
//                 '''
//             }
//         }
        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }
    }
    post {
        always {
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'serenity',
                reportFiles: 'index.html',
                reportName: 'Serenity Report'
            ])
        }
    }
}
