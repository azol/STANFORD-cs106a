plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "BreakoutExtended"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("bounce.au") {
                into(".")
            }
        }
    }
}
