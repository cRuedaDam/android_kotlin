package com.example.recyclerview

//TODO 6: Creamos una clase para albergar el listado de los superHeroes
class SuperHeroProvider {
    //El companion objet se crea para poder acceder a los objetos que hay en su interior
    companion object{

        val SuperHeroList = listOf<SuperHero>(
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            ),
            SuperHero(
                "Daredevil",
                "Marvel",
                "Mathew Michael Murdock",
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
            ),
            SuperHero(
                "Lobezno",
                "Marvel",
                "James Howlett",
                "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
            ),
            SuperHero(
                "Batman",
                "DC",
                "Bruce Wayne",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            ),
            SuperHero(
                "Thor",
                "Marvel",
                "Thor Odinson",
                "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
            ),
            SuperHero(
                "Flash",
                "DC",
                "Jay Garrick",
                "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"
            ),

            SuperHero(
                "Green Lantern",
                "DC",
                "Alan Scott",
                "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
            ),
            SuperHero(
                "Wonder Woman",
                "DC",
                "Princess Diana",
                "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
            )
        )

    }
}