task_branch = "${TEST_BRANCH_NAME}"
def branch_cut = task_branch.contains("origin") ? task_branch.split('/')[1] : task_branch.trim()
currentBuild.displayName = "$branch_cut"
base_git_url = "https://github.com/VasylStepanov/InterwievTaskTestmatick.git"

node {
    withEnv(["branch=${branch_cut}", "base_url=${base_git_url}"]) {
        stage("Checkout Branch") {
            if (!"$branch_cut".contains("master")) {
                try {
                    getProject("$base_git_url", "$branch_cut")
                } catch (err) {
                    echo "Failed get branch $branch_cut"
                    throw ("${err}")
                }
            } else {
                echo "Current branch is master"
            }
        }

        runTest()
    }
}

def runTest() {
    try {
        labelledShell(label: "Run", script: "chmod +x gradlew \n./gradlew -x test")
    } finally {
        echo "some failed tests"
    }
}

def getProject(String repo, String branch) {
    cleanWs()
    checkout scm: [
            $class           : 'GitSCM', branches: [[name: branch]],
            userRemoteConfigs: [[
                                        url: repo
                                ]]
    ]
}
