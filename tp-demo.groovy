node {
    
    stage ('one'){
       echo "hello"
       echo "bonjour"
    }
    stage ('Two') {
        sh 'hostname'
        sh 'pwd'
        sh 'df -h'
    }
}
