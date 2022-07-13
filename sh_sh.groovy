job('mirio') {
    steps {
        shell('echo Hello World!')
    }
    steps {
        shell('pwd' >> file.txt)
    }
}
