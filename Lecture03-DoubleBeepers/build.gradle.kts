plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "DoubleBeepers"
}

dependencies {
	implementation(files("libs/karel.jar", "libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/DoubleBeepers.w") {
                into("worlds")
            }
        }
    }
}
