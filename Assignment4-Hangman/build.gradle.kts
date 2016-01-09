plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Hangman"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/.txt") {
                into(".")
            }
        }
    }
}
