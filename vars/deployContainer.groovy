def call(String imageName, String containerName, String port) {
    echo "Deploying container: ${containerName}"
    sh "docker rm -f ${containerName} || true"
    sh "docker run -d -p ${port}:${port} --name ${containerName} ${imageName}"
}
