pipeline {

   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      gradle "gradle-6.3"
   }

   stages {
      stage('Build') {
         steps {
            git credentialsId: 'qwe', url: 'https://github.com/DavidAlejandroM/menu-backend.git'

            sh "gradle clean build"
         }
      }

      stage('Test') {
         steps {
            sh "gradle test"
         }
      }

      stage('build docker image') {
         steps {
            sh "docker build -t menu ."
         }
      }

      stage('Deploy') {
          steps {
              sh 'docker ps -f name=menu -q | xargs --no-run-if-empty docker container stop'
                sh 'docker container ls -a -fname=menu -q | xargs -r docker container rm'
            sh "docker run -d -p 8080:8080 --name container-menu menu"
         }

  }
   }
}