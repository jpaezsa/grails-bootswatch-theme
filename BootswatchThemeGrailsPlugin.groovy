class BootswatchThemeGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.3 > *"
    def author = "Cristian Olaru"
    def authorEmail = "colaru@gmail.com"
    def title = "Bootswatch Theme"
    def description = 'Provides different styles for Twitter Bootstrap UI Set (from Grails Platform UI) based on http://bootswatch.com themes.'
    def documentation = "http://grails.org/plugin/bootswatch-theme"

    def license = "APACHE"
    def issueManagement = [system: 'Github', url: 'https://github.com/colaru/grails-bootswatch-theme/issues']
    def scm = [url: 'https://github.com/colaru/grails-bootswatch-theme']

    def doWithConfig = { config ->
        platformUi {
            themes.Bootswatch.ui.set = "Bootstrap"
			themes.BootswatchCerulean.ui.set = "Bootstrap"
			themes.BootswatchAmelia.ui.set = "Bootstrap"
        }
    }
}
