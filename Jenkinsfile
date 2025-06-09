pipeline {
    agent any
    triggers {
        cron('0 0 * * 0') // Chaque dimanche à 00:00
    }
    stages {
        stage('Test Cucumber') {
            steps {
                bat 'mvn clean test -Dtest=CucumberRunner'
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
