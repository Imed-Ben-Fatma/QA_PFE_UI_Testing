pipeline {
    agent any
    // Déclenchement automatique chaque dimanche à 00h00
    triggers {
        cron('0 0 * * 0')
    }
    stages {
        stage('Test Cucumber') {
            steps {
                // Exécute les tests automatisés
                bat 'mvn clean test -Dtest=CucumberRunner'
            }
        }
    }
    post {
        always {
            script {
                // Publie le rapport ExtentReports dans Jenkins
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/Reports',
                    reportFiles: 'Report.html',
                    reportName: 'Extent Test Report'
                ])
            }
            // Nettoie le workspace Jenkins
            cleanWs()
        }
    }
}


