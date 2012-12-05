class BootswatchThemeGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3 > *"

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Cristian Olaru"
    def authorEmail = "colaru@gmail.com"
    def title = "Bootswatch Theme"
    def description = '''\\
Provides different styles for Twitter Bootstrap UI Set (from Grails Platform UI) based on http://bootswatch.com themes.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/bootswatch-theme"

    def doWithConfig = { config ->
        platformUi {
            themes.Bootstrap.ui.set = "Bootstrap"
        }
    }
    
    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
