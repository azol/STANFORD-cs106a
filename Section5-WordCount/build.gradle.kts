plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "WordCount"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("lear.txt") {
                into(".")
            }
        }
    }
}
