def call(String url, String branch){
    echo "git code is cloning"
    git url: "${url}", branch : "${branch}"
    echo "code cloning sucess fully"
}