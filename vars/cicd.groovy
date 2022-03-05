def newGit(repo)
{
  git  "${repo}"
}

def newMaven()
{
    sh 'mvn package' 
}

def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'bea82394-b01c-4339-9304-b5452c8e1503', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war' 
}

def newSelenium(path)
{
 sh 'java -jar "${path}/testing.jar' 
}
