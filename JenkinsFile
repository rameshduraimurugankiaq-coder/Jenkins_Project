pipeline {
agent any
 
stages{
stage('Build & Test'){
steps{
bat 'mvn clean test'
}
}
}
 
post {
always{
echo 'Test execution completed'
}
success {
echo 'Build and tests passed'
}
failure{
echo 'Build or tests failed'
}
}
}
