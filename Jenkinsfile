pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build Application'
            }
        }
        stage('Test') {
            steps {
                echo 'Test Application'
            }
        }
          stage('Deploy') {
            steps {
                echo 'Deploy Application'
            }
        }
    }
    post { 
        always { 
            emailext body: 'The Pipeline Status for MJD1', subject: 'Pipeline Status', to: 'palz.somsuvro@gmail.com'
        }
    }
}
