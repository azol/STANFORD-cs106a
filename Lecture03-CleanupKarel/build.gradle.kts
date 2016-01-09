plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CleanupKarel"
}

dependencies {
	implementation(files("libs/karel.jar", "libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/CleanupKarel.w") {
                into("worlds")
            }
        }
    }
}
