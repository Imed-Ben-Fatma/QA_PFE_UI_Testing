pipeline {
    agent any
    stages {
        stage('Test Cucumber') {
            steps {
                script {
                    if (isUnix()) {
                        sh './mvnw clean test'
                    } else {
                        bat 'mvn clean test'
                    }
                }
            }
        }
    }
    post {
        always {
            script {
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/Reports',
                    reportFiles: 'Report.html',
                    reportName: 'Extent Test Report'
                ])
            }
            cleanWs()
        }
    }
}
