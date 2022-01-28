pipeline {
    agent any

    parameters{
        choice(name: 'QUE_VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: 'Versiones posibles')
        booleanParam(name: 'ejecutarTests', defaultValue: true, description: 'Para saber si se ejecutan los tests')
    }

    stages{
        stage("Buildear"){
            steps{
                echo 'Buildeando la aplicacion'
            }
        }
        stage("Testear"){
            when{
                expression{ params.ejecutarTests == true}
            }
            steps{
                echo 'Testeando la aplicacion'
            }
        }
        stage("Deployar"){
            steps{
                echo "Deployando la aplicacion ${params.QUE_VERSION}"
            }
        }
    }
}

