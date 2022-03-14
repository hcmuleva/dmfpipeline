pipeline {
    agent any

    stages {
        stage('Build') {
            sh script:'''
          #!/bin/bash
          echo "This is start $(pwd)"
          cd /bitnami/jenkins/home/jobs/DMFCI/branches/dev/workspace/source
          ls -l
          mvn clean install 
          echo "Maven build completed in dir $(pwd)"
        '''
            
        }
        stage('DockerImage') {
            steps {
                echo 'DockerImage..'
            }
        }
        stage('PushImage') {
            steps {
                echo 'PushImage....'
            }
        }
    }
}