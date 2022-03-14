pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh script:'''
                #!/bin/bash
                echo "This is start $(pwd)"
                cd /bitnami/jenkins/home/jobs/DMFCI/branches/dev/workspace/source
                ls -l
                mvn clean install 
                echo "Maven build completed in dir $(pwd)"
                '''

            }
            
        }
        stage('DockerImage') {
            steps {
                echo 'DockerImage in progress..'
                sh script:'''
                #!/bin/bash
                echo "This is start $(pwd)"
                cd /bitnami/jenkins/home/jobs/DMFCI/branches/dev/workspace/source
                ls -l
                docker build -t hcmuleva/app . 
                echo "image created"
                '''
            }
        }
        stage('PushImage') {
            steps {
                echo 'Docker Push is in progress....'
                 sh script:'''
                #!/bin/bash
                echo "This is start $(pwd)"
                cd /bitnami/jenkins/home/jobs/DMFCI/branches/dev/workspace/source
                ls -l
                docker push hcmuleva/app 
                echo "docker pushed to repo"
                '''
            }
        }
    }
}