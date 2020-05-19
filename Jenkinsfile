
def tagName = "menu"
def nodeName = "principal"
node(nodeName) {
    stage 'Build'
    sh "./gradlew build"

    stage 'Publish Docker'
    sh "docker build -t ${tagName} ."
}

node(nodeName) {
  def containerName = "container-${tagName}"
  stage('Deploy') {
      sh "docker run -p 8090:8080 --name ${containerName} ${tagName}"
  }

  try {
    postDeployCheck(containerName)
  } finally {
    stage('Finalize') {
        //sh "docker rm -f ${containerName}"
        //sh "docker rmi -f nexus:20000/demo:${version}"
    }
  }
}

def postDeployCheck(containerName) {
  stage('Post-Deploy') {
    timeout(20) {
      waitUntil {
        try {
          sh "curl localhost:8090/negocios/"
          return true
        } catch(error) {
          sleep 1
          currentBuild.result = 'SUCCESS'
          return false
        }
      }
    }
  }
}
/*