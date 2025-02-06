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
            emailext body: 'Please find the build url http://localhost:8080/job/MJD1_Pipeline/', subject: 'Pipeline Status', to: 'palz.somsuvro@gmail.com'
        }
    }
}
