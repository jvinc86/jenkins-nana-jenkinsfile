pipeline {
    agent any

    stages{
        stage("Buildear"){
            steps{
                echo 'Buildeando la aplicacion'
            }
        }
        stage("Testear"){
            steps{
                echo "Testeando la aplicacion"
            }
        }
        stage("Deployar"){
            steps{
                withCredentials( [usernamePassword(credentialsId: 'Tomcat_Credentials', usernameVariable: 'MI_USUARIO', passwordVariable: 'MI_CONTRASENA')] ){
                    echo "Deployando con el usuario $MI_USUARIO y la contrasena $MI_CONTRASENA"
                }
            }
        }
    }
}

