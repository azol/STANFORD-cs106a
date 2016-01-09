plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "NameSurfer"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("names-data.txt") {
                into(".")
            }
        }
    }
}
