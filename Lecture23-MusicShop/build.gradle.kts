plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "MusicShop"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("music-data.txt") {
                into(".")
            }
        }
    }
}
