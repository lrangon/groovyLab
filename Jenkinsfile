#!/usr/bin/env groovy
 
/**
        * Sample Jenkinsfile for Jenkins2 Pipeline
        * from https://github.com/hotwilson/jenkins2/edit/master/Jenkinsfile
        * by wilsonmar@gmail.com 
 */
 
import hudson.model.*
import hudson.EnvVars
import groovy.json.JsonSlurperClassic
import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import java.net.URL
 
try {
node {
stage '\u2776 Stage 1'{

}
echo "\u2600 BUILD_URL=${env.BUILD_URL}"
 
def workspace = pwd()
echo "\u2600 workspace=${workspace}"
 
stage '\u2777 Stage 2'{
    
}
} // node
} // try end
catch (exc) {

} finally {
 // Must re-throw exception to propagate error:
 if (err) {
     throw err
 }
}