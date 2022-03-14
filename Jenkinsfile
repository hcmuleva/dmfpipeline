pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh ' cd /bitnami/jenkins/home/jobs/DMFCI/branches/dev/workspace/source'
                sh ' mvn clean install '
            }
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