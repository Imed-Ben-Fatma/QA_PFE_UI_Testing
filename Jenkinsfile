pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Test Cucumber') {
            steps {
                sh 'mvn clean test -Dcucumber.options="--plugin json:target/cucumber-reports/report.json"'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                    cucumber 'target/cucumber-reports/report.json'
                }
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
