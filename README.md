213 Lines of Code ukupno za oba fajla

Analiza:

Start.java - 6. linija - Alat predlaze da se "Expression" preimenuje kako bi pratilo ovo pravilo - '^[a-z][a-zA-Z0-9]*$'. Menjanjem imena u "expression" ili "EXPRESSSION", na toj liniji i u ostatku fajla sklanja ovaj problem.
Start.java - 12. linija - Alat predlaze da scanner koji se koristi unutar while petlje (scanIn = new Scanner(System.in);) nije efikasan jer se u svakoj iteraciji kreira novi objekat skenera bez pravilnog zatvaranja prethodnog. 


Calculator.java - linija 24 - rec "Run" bi mogla da se preimenuje u RUN ili run kako bi pratila prethodno navedeno pravilo.
Calculator.java - linija 74 - ista sugestija za rec "Calculate".
Calculator.java - linija 119,131,171,183 - tool sugerise "return;" kao nepotreban.
