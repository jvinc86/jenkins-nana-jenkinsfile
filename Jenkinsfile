pipeline {
    agent any

    environment{
        NUEVA_VERSION_APP = '1.3.7'
    }

    stages{
        stage("Buildear"){
            steps{
                echo 'Buildeando la aplicacion'
            }
        }
        stage("Testear"){
            steps{
                echo "Testeando la aplicacion ${NUEVA_VERSION_APP}"
            }
        }
        stage("Deployar"){
            steps{
                echo 'Deployando la aplicacion'
            }
        }
    }
}

