job('git_item') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/Bhushankoparkar/ansible1.git')
            }
        }
    }
    steps {
        shell('echo good morning')
    }
}