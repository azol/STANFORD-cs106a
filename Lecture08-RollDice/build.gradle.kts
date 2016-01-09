plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "RollDice"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
