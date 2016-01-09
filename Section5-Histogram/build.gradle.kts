plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Histogram"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("MidtermScores.txt") {
                into("MidtermScores.txt")
            }
        }
    }
}
