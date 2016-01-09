plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CreateBeeperLine"
}

dependencies {
	implementation(files("libs/karel.jar", "libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/CreateBeeperLine.w") {
                into("worlds")
            }
        }
    }
}
