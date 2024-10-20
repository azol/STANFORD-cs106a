plugins {
	eclipse
	application
}

application {
	mainClass = "MidpointFindingKarel"
}

dependencies {
	implementation(files("libs/karel.jar", "libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/*.w") {
                into("worlds")
            }
        }
    }
}
