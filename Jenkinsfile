def mi_script_gv

pipeline {
    agent any
    parameters{ choice(name: 'QUE_VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: 'Las versiones') }
    stages{
        stage("Init"){
            steps{
                script{
                    mi_script_gv = load "mi_script.groovy"
                }
            }
        }
        stage("Buildear"){
            steps{
                script{
                    mi_script_gv.buildearApp()
                }
            }
        }
        stage("Testear"){
            steps{
                script{
                    mi_script_gv.testarApp()
                }
            }
        }
        stage("Deployar"){
            steps{
                script{
                    mi_script_gv.deployarApp()
                }
            }
        }
    }
}

