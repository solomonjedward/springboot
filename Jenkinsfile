pipeline {

    agent any



    stages {

        stage ('Git Checkout') {
            steps {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/solomonjedward/springboot']]])
            }
        }
        stage ('Build Jar') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'RDS_Login', passwordVariable: 'RDS_Pass' , usernameVariable: 'RDS_User')])
                    {
                    sh 'mvn clean install'
                    }
                }
            }
        }
}
