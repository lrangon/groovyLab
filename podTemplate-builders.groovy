
#!/usr/bin/env groovy

def label = "worker-${UUID.randomUUID().toString()}"
podTemplate(label: label, yaml: """
apiVersion: v1
kind: Pod
metadata:
  labels:
    app: "apic-c4-client"
spec:
  containers:
  - name: jnlp
    image: 'jenkinsci/jnlp-slave:3.10-1-alpine'
    args: ['${computer.jnlpmac} ${computer.name}']
    tty: true
  - name: graddle
    image: 'gradle:4.5.1-jdk9'
    command:
    - cat
    tty: true
  - name: docker
    image: 'docker'
    command:
    - cat
    tty: true
  - name: kubectl
    image: 'lachlanevenson/k8s-kubectl:v1.8.8'
    command:
    - cat
    tty: true
  - name: helm
    image: 'lachlanevenson/k8s-helm:latest'
    command:
    - cat
    tty: true
"""
,volumes: [
  hostPathVolume(mountPath: '/home/gradle/.gradle', hostPath: '/tmp/jenkins/.gradle'),
  hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock')
]) {
    node (label) {
      container('busybox') {
        sh "hostname"
      }
    }
}