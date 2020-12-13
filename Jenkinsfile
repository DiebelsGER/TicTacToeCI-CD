pipeline {
  agent any
  stages {
    stage('1. GitHub') {
      steps {
        git(url: 'https://github.com/DiebelsGER/TicTacToeCI-CD', branch: 'main')
      }
    }

    stage('2. Build with Ant') {
      steps {
        withAnt()
      }
    }

  }
}