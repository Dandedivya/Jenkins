pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Dandedivya/Jenkins.git'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat-user', path: '', 
                url: 'http://localhost:9090/')], contextPath: null, 
                onFailure: false, war: '**/*.war'
            }
        }
    }
}
