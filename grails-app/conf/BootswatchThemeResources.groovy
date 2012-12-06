
// Put your resources in here
modules = {

	// Possibilities: cyborg, united, superhero

    'theme.Bootswatch' {
		dependsOn 'jquery', 'bootstrap-js'
		resource id:'bootstrap', url:[plugin:'bootswatch-theme', dir:'css/united', file:'bootstrap.css']
		resource id:'styling', url:[plugin:'bootswatch-theme', dir:'css', file:'styling.css']
    }

    'theme.Bootswatch.sidebar' {
        // Add your 'sidebar' specific CSS/JS files here
    }

    'theme.Bootswatch.report' {
        // Add your 'report' specific CSS/JS files here
    }

    'theme.Bootswatch.dataentry' {
        // Add your 'dataentry' specific CSS/JS files here
    }

    'theme.Bootswatch.dialog' {
        // Add your 'form' specific CSS/JS files here
    }

    'theme.Bootswatch.main' {
        // Add your 'main' specific CSS/JS files here
    }

    'theme.Bootswatch.home' {
        // Add your 'main' specific CSS/JS files here
    }
}
