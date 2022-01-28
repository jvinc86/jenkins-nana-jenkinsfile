pipeline {
    agent any

    tools{
        maven 'maven'
    }

    stages{
        stage("Buildear"){
            steps{
                echo 'Verificando la version de Maven:'
                sh "mvn --version"
            }
        }
        stage("Testear"){
            steps{
                echo 'Testeando la aplicacion'
            }
        }
        stage("Deployar"){
            steps{
                echo 'Deployando la aplicacion'
            }
        }
    }
}

