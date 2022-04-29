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
                withCredentials([usernamePassword(credentialsId: 'RDS_Login', passwordVariable: 'PASS_RDS' , usernameVariable: 'USER_RDS')])
                    {
                    sh 'mvn clean install'
                    }
                }
            }
        }
}
