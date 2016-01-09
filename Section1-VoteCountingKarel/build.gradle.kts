plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "VoteCountingKarel"
}

dependencies {
	implementation(files("libs/karel.jar", "libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("worlds/VoteCountingKarel.w") {
                into("worlds")
            }
        }
    }
}
