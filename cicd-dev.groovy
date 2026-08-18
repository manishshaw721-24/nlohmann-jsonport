node('linux') {
  stage ('Poll') {
    checkout([
      $class: 'GitSCM', branches: [[name: '*/main']], extensions: [],
      userRemoteConfigs: [[url: 'https://github.com/zopencommunity/nlohmann-json[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[N[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cport.git']]])
  }
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [
      string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/zopencommunity/nlohmann-json[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[N[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cport.git'),
      string(name: 'PORT_DESCRIPTION', value: 'JSON for Modern C++'),
      string(name: 'BUILD_LINE', value: 'DEV')
    ]
  }
}
