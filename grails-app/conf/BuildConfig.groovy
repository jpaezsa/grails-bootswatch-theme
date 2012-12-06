grails.project.work.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
    }

    plugins {
        build(':release:2.2.0', ':rest-client-builder:1.0.e') {
            export = false
        }

        runtime ":jquery:1.7.1"
        compile ":platform-ui:1.0.RC2"
        compile ":bootstrap-ui:1.0.RC3"
        runtime ":twitter-bootstrap:2.2.1"
    }
}
