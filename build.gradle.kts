plugins {
	`java-library`
	id("com.vanniktech.maven.publish") version "0.34.0"
}

group = "io.github.canary-prism"
description = "A java implementation of the NBT protocol for Minecraft Java Edition."
version = "6.2.1"

repositories {
	mavenCentral()
}

mavenPublishing {
	publishToMavenCentral(true)

	signAllPublications()
	pom {

		name = project.name
		description = project.description

		url = "https://github.com/Canary-Prism/querz-nbt"

		licenses {
			license {
				name = "The Apache License, Version 2.0"
				url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
			}
		}

		developers {
			developer {
				id = "Canary-Prism"
				name = "Canary Prism"
				email = "canaryprsn@gmail.com"
			}
		}

		scm {
			url = "https://github.com/Canary-Prism/slavacord"
			connection = "scm:git:git://github.com/Canary-Prism/slavacord.git"
			developerConnection = "scm:git:ssh://git@github.com:Canary-Prism/slavacord.git"
		}
	}
}

dependencies {
	testImplementation("junit:junit:4.12")
}

tasks.jar {
	manifest.attributes["Automatic-Module-Name"] = "canaryprism.querz.nbt"
}