pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Unit Test') {
            steps {
                echo 'Unit Testing..'
            }
        }
		stage('Packaging Artifact') {
            steps {
             //   echo 'Packaging....'
            }
        }
        stage('Deploy Atrifact Development') {
            steps {
                echo 'Deploying....'
            }
        }
		stage('Smoke Test') {
            steps {
                echo 'Smoke Test....'
            }
        }
		stage('Deploy System Test') {
            steps {
                echo 'Deploying....'
            }
        }
		stage('Functional Testing') {
            steps {
                echo 'Functional testing....'
            }
        }
    }
}
