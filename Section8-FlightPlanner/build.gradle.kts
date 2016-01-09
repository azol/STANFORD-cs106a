plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "FlightPlanner"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

distributions {
    main {
        contents {
            from("flights.txt") {
                into(".")
            }
        }
    }
}
