pipeline {
  agent any
  stages {
    stage('1. Message') {
      steps {
        echo 'Running a Pipeline with Jenkins'
      }
    }

    stage('2. Fetching Repo') {
      parallel {
        stage('2a. Fetching Repo') {
          steps {
            git(url: 'https://github.com/DiebelsGER/TicTacToeCI-CD', branch: 'main')
          }
        }

        stage('2b. Message') {
          steps {
            echo 'Incmoing Repo'
          }
        }

      }
    }

    stage('3. Build with Ant') {
      steps {
        withAnt(installation: 'ANT_HOME', jdk: 'JAVA_HOME')
      }
    }

  }
}