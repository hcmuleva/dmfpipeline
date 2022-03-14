pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build  started ....'
                bat """
                
               
                cd C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\CIDemo_dev\\source
                mvn clean install 
                """
                 echo 'Build  completed ....'
            }
            
        }
        stage('DockerImage') {

            steps {
                echo 'DockerImage in progress..'
                bat """
                cd C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\CIDemo_dev\\source
                docker build -t hcmuleva/app . 
                """
                echo 'Docker Image creation  completed ....'
            }
        }
        stage('PushImage') {
            steps {
                echo 'Docker Push is in progress....'
                bat """
                docker push hcmuleva/app 
                """
                echo "docker pushed to repo completed"
            }
        }
    }
}