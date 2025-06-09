pipeline {
    agent any
    stages {

        stage('Test Cucumber') {
            steps {
                sh 'mvn clean test '
            }

        }
    }
    post {
        always {
            // Publie le rapport ExtentReports
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/Reports',
                reportFiles: 'Report.html',
                reportName: 'Extent Test Report'
            ])
            cleanWs()
        }
    }
}
