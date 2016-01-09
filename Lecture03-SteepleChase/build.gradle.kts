plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "SteepleChase"
}

dependencies {
	implementation(files("libs/karel.jar", "libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/SteepleChase.w") {
                into("worlds")
            }
        }
    }
}
