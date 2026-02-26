def call() {
    echo "Node Pipeline started by: ${env.BUILD_USER ?: 'Jenkins'}"
    echo "Branch: ${env.GIT_BRANCH ?: 'N/A'}"
    echo "Build #${env.BUILD_NUMBER}"
}
