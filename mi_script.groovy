def buildearApp(){
    echo 'Buildeando la aplicacion'
}

def testarApp(){
    echo 'Testeando la aplicacion'
}

def deployarApp(){
    echo "Deployando la aplicacion version ${params.QUE_VERSION}"
}

return this