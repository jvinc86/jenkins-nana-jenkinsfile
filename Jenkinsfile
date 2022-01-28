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
                echo "Deployando la aplicacion con las crendenciales"
                withCredentials( [usernamePassword(credentials: 'Tomcat_Credentials', usernameVariable: MI_USUARIO, passwordVariable: MI_CONTRASENA)] ){
                    sh "echo Este es mi usuario ${MI_USUARIO} y este es su password ${MI_CONTRASENA}"
                }
            }
        }
    }
}

