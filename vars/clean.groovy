def call() {
    echo "Cleaning up workspace..."
    try {
        cleanWs()
        echo "Workspace cleaned successfully"
    } catch (Exception e) {
        echo "Failed to clean workspace: ${e}"
    }
}
