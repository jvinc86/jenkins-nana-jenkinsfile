pipeline {
    agent any

    stages{
        stage("Buildear"){
            steps{
                echo 'Buildeando la aplicacion'
            }
        }
        stage("Testear"){
            when{
                expression{
                    BRANCH_NAME =='dev' || BRANCH_NAME =='master' 
                }
            }
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

