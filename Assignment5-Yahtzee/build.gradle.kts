plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Yahtzee"
}

dependencies {
	implementation(files("libs/yahtzeelib.jar","libs/acm-2.0.jar"))
}
