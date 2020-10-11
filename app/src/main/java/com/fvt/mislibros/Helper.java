package com.fvt.mislibros;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Helper extends SQLiteOpenHelper {

    public Helper(Context contexto, String nombre, SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version );
    }

    public void onCreate(SQLiteDatabase bd) {

        bd.execSQL("CREATE TABLE Libro (ID_Libro int PRIMARY KEY , Titulo varchar(50),Autor varchar(50),Sinopsis varchar(500),FechaDePublicacion date, Editorial varchar(50),CantidadDePaginas int,Favorito tinyint(1), Imagen int, Idioma varchar(50));");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (1, 'Juego de Tronos', 'George R. R. Martin'," +
                " 'Tras el largo verano, el invierno se acerca a los Siete Reinos. Lord Eddard Stark, señor de Invernalia, deja sus dominios para unirse a la corte del rey Robert Baratheon el Usurpador, hombre díscolo y otrora guerrero audaz cuyas mayores aficiones son comer, beber y engendrar bastardos. \nEddard Stark desempeñará el cargo de Mano del Rey e intentará desentrañar una maraña de intrigas que pondrá en peligro su vida... y la de los suyos. \nEn un mundo cuyas estaciones duran décadas y en el que retazos de una magia inmemorial y olvidada surgen en los rincones más sombrios y maravillosos, la traición y la lealtad, la compasión y la sed de venganza, el amor y el poder hacen del juego de tronos una poderosa trampa que atrapa en sus fauces a los personajes... y al lector.'," +
                " '1996/08/06', 'Bantam Spectra, HarperCollins', 694, 0, "+R.drawable.juego_de_tronos+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (2, 'Harry Potter y la piedra filosofal', 'JK Rowling'," +
                " 'Harry Potter crece en la casa de sus tíos, los Dursley, quienes le ocultan su verdadera historia familiar; al cumplir Harry once años de edad, empiezan a llegarle cartas de remitente desconocido, que van aumentando en número a medida que sus tíos no dejan que las abra. \nLas mismas traen la noticia de que el niño ha sido admitido en el Colegio Hogwarts de Magia y Hechicería, ya que, al igual que sus padres, tiene poderes mágicos.'," +
                " '1997/06/30', 'Salamandra', 223, 0, "+R.drawable.harry_potter+", 'Ingles');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (3, 'El Principito', 'Antoine de Saint-Exupèry'," +
                " 'El principito es un cuento poético que viene acompañado de ilustraciones hechas con acuarelas por el mismo Saint-Exupéry. En él, un piloto se encuentra perdido en el desierto del Sahara después de que su avión sufriera una avería, pero para su sorpresa, es allí donde conoce a un pequeño príncipe proveniente de otro planeta. La historia tiene una temática filosófica, donde se incluyen críticas sociales dirigidas a la «extrañeza» con la que los adultos ven las cosas. Estas críticas a las cosas «importantes» y al mundo de los adultos van apareciendo en el libro a lo largo de la narración.'," +
                " '1943/04/06', 'Reynal & Hitchcock, Éditions Gallimard', 354, 0, "+R.drawable.el_principito+", 'Frances');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (4, 'El Señor de los Anillos', 'J. R. R. Tolkien'," +
                " 'El primer capítulo del libro comienza en un tono ligero, siguiendo la tónica de El hobbit. Bilbo Bolsón celebra su 111 cumpleaños el mismo día, 22 de septiembre, en que hace el anuncio relativo a que, su adoptado heredero, Frodo Bolsón celebra su mayoría de edad a los 33. En la fiesta de cumpleaños, Bilbo se aparta de la Comarca, la tierra de los hobbits, por lo que él llama un día de fiesta permanente. Deja a Frodo sus pertenencias restantes, incluyendo su casa, Bolsón Cerrado, y (después de la persuasión por el mago Gandalf) el anillo que había encontrado en sus aventuras (que solía hacerse invisible). Gandalf se va en su propio negocio, advirtiéndole a Frodo a mantener el Anillo en secreto.'," +
                " '1954/07/29'," + " 'George Allen & Unwin', 1368, 0, "+R.drawable.senor_anillos+", 'Elfico');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (5, 'El Valle Del Terror', 'Arthur Conan Doyle'," +
                " 'La historia tiene lugar en 1888, con un flashback basado en el libro de Allan Pinkerton sobre los Molly Maguires en las minas de carbón de Pennsylvania, en 1875. La novela está dividida en dos partes bien diferenciadas. En la primera parte, Sherlock Holmes, utilizando sus técnicas habituales, descubre la identidad de un homicida. Una vez detenido el asesino, la historia vuelve hacia atrás en el tiempo, y narra en tercera persona los antecedentes del asesino y la víctima. Esta narración está basada en los Molly Maguires, una organización que existió realmente en Estados Unidos. Al final se cuenta brevemente cómo se llegó a la situación inicial y los motivos del asesinato, enlazando ambas historias. En este sentido, El valle del terror, la última novela de Sherlock Holmes, imita la estructura de Estudio en escarlata, que fue la primera.'," +
                " '1915/02/27', 'George H. Doran Company', 328, 0, "+R.drawable.valle_terror+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (6, 'El Señor de las Moscas', 'William Golding'," +
                " 'Un avión inglés se estrella en una isla desierta convirtiendo a la treintena de adolescentes que viajaban en su interior en un grupo de náufragos que, al verse libres de autoridad adulta y responsabilidades deberán aprender a sobrevivir por su cuenta mientras la ausencia de normas y límites hacen que la lógica y la serenidad de los jóvenes vayan desapareciendo al dejar paso a la faceta más salvaje del ser humano, lo que provocará que la utopía insular de Ralph, Piggy, Jack y los demás no tarde en transformarse en un caos gobernado por la locura, la lucha de poder y la muerte.'," +
                " '1954/09/17', 'Faber and Faber', 224, 0, "+R.drawable.moscas+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (7, 'El Código Da Vinci', 'Dan Brown'," +
                " 'El libro narra los intentos de Robert Langdon, Profesor de Iconografía Religiosa de la Universidad Harvard, para resolver el misterioso asesinato de Jacques Saunière ocurrido en el Museo del Louvre en París. El cuerpo de Saunière fue encontrado en el ala Denon del Louvre en la postura del Hombre de Vitruvio (dibujo realizado por Leonardo da Vinci) con un mensaje críptico escrito a su costado y un pentáculo dibujado en el pecho con su propia sangre.'," +
                " '2003/04/01', 'Doubleday, Transworld Publishers, Bantam Books', 458, 0, "+R.drawable.davinci+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (8, 'Hamlet', 'William Shakespeare'," +
                " 'En Hamlet, el protagonista domina la historia, la rodea y soporta. Hamlet, dominado por las emociones, no sabe resolver sus propios dilemas. Quiere descubrir la verdad, pero todo termina en catástrofe.Ser o no ser, esa es la cuestión, afirma el personaje de Hamlet. Su autor, William Shakespeare, es una de las figuras canónicas de la literatura universal y el dramaturgo inglés más importante de todos los tiempos. Sus tragedias son símbolos universales que conservan una gran vigencia. Hamlet, resultado de la madurez artística de Shakespeare, ahonda temas como la locura y patentiza la lucha entre la razón y la locura, entre el bien y el mal. La indagación en los sentimientos y pasiones humanas hacen de este clásico una obra atemporal.'," +
                " '1609/01/08', 'Cantaro, Colihue, Santillana', 360, 0, "+R.drawable.hamlet+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (9, 'El Facundo', 'Domingo Faustino Sarmiento'," +
                " 'Luego de una extensa introducción, los quince capítulos de Facundo se dividen simbólicamente, según la crítica literaria, en tres secciones: los primeros cuatro capítulos describen la geografía, antropología e historia argentina; los capítulos del quinto al decimocuarto relatan la vida de Juan Facundo Quiroga; y el último capítulo expone la visión de Sarmiento de un futuro argentino bajo un gobierno unitario.\u200B Según Sarmiento, la razón por la que describe el contexto argentino y utiliza a Facundo Quiroga para condenar la dictadura de Rosas es porque «en Facundo Quiroga no sólo se ve a un caudillo, sino también una manifestación de la vida argentina, consecuencia de la colonización y de las peculiaridades del terreno».'," +
                " '1905/01/18', 'El Progreso de Chile', 954, 0, "+R.drawable.facundo+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (10, 'El Diario de Ana Frank', 'Jan Romein'," +
                " 'Oculta con su familia, otra familia judía (los van Pels) y un dentista (Dussel), en una buhardilla de unos almacenes de Ámsterdam durante la ocupación nazi de Países Bajos, Ana Frank con trece años, cuenta en su diario, al que llamó «Kitty», la vida del grupo. Ayudados por varios empleados de la oficina, permanecieron durante más de dos años en el achterhuis (conocido como «la casa de atrás») hasta que, finalmente, fueron delatados y detenidos. Ana escribió un diario entre el 12 de junio de 1942 y el 1 de agosto de 1944. El 4 de agosto de 1944, unos vecinos (se desconocen los nombres) delatan a los ocho escondidos en \"la casa de atrás\". Estos últimos fueron llevados a diferentes campos de concentración. Además del Diario, escribió varios cuentos que han sido publicados paulatinamente desde 1960. Su hermana, Margot Frank, también escribió un diario, pero nunca se encontró ningún rastro de éste.'," +
                " '1905/04/30', 'Contact', 217, 0, "+R.drawable.ana_frank+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (11, 'Don Quijote de la Mancha', 'Miguel de Cervantes'," +
                " 'Alonso Quijano es un hidalgo pobre de la Mancha, que de tanto leer novelas de caballería acaba enloqueciendo y creyendo ser un caballero andante, nombrándose a sí mismo como Don Quijote de la Mancha. Sus intenciones son ayudar a los pobres y desfavorecidos, y lograr el amor de la supuesta Dulcinea del Toboso, que es en realidad es una campesina llamada Aldonza Lorenzo. La primera salida la hace solo, pero regresa en poco tiempo a casa y decide nombrar a Sancho Panza, un empleado suyo, escudero. Juntos realizan la segunda salida, en la que viven más de una aventura: Don Quijote ve y ataca a unos gigantes que en realidad resultan ser molinos de viento, confunde un rebaño con un ejército, tiene más de una disputa, una de ellas con un vizcaíno, y llega a enfrentarse a unos leones. Finalmente, y tras hacer penitencia en un bosque, es capturado por el cura y el barbero de su pueblo y llevado a casa en una jaula tras ser engañado para ayudar a la supuesta princesa Micomicona.'," +
                " '1605/01/16', 'Francisco de Robles', 471, 0, "+R.drawable.quijote+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (12, 'Los Juegos del Hambre', 'Suzanne Collins'," +
                " 'Katniss Everdeen, una chica de 16 años del Distrito 12, se ofrece voluntaria para los Septuagésimo Cuartos Juegos del Hambre ocupando el lugar de su hermana menor, Primrose. El varón del Distrito 12 seleccionado resulta ser Peeta Mellark. Cinna, el estilista de Katniss, la convierte en la chica en llamas, consiguiendo la atención de los patrocinadores, vitales para lograr sobrevivir a los juegos. Katniss y Peeta lucharán contra los otros tributos en conjunto, fingiendo que se aman para ganar el favor del público.'," +
                " '1905/06/30', 'Scholastic Corporation', 356, 0, "+R.drawable.juegos_hambre+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (13, 'El Hobbit', 'J. R. R. Tolkien'," +
                " 'La historia comienza un día en el que el hobbit Bilbo Bolsón, habitante de la Comarca, recibe la inesperada visita del mago Gandalf y de una compañía de trece enanos, liderada por Thorin Escudo de Roble, y compuesta por Balin, Glóin, Bifur, Bofur, Bombur, Dwalin, Ori, Dori, Nori, Óin, Kíli y Fíli. Los enanos necesitaban un miembro más en el grupo, un saqueador experto, para poder llevar a cabo su plan: alcanzar Erebor, derrotar al dragón Smaug y recuperar el reino y su tesoro. Gandalf les había recomendado para esta misión a Bilbo y de esta forma el hobbit se ve envuelto en la aventura.'," +
                " '1937/09/21', 'Ediciones Minotauro', 310, 0, "+R.drawable.hobbit+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (14, 'El Resplandor', 'Stephen King'," +
                " 'Al escritor Jack Torrance le es ofrecido un empleo como cuidador del hotel Overlook durante el invierno junto a su familia. Este trabajo parece ser una oportunidad perfecta para demostrar que está totalmente curado de su alcoholismo. El hotel está situado en lo alto de las montañas de Colorado y el pueblo más cercano es Sidewinder, aproximadamente a 65 kilómetros del lugar. Los caminos son intransitables por el invierno, por lo que el lugar está prácticamente aislado del mundo, especialmente durante las fuertes tormentas.'," +
                " '1977/01/28', 'Doubleday', 447, 0, "+R.drawable.resplandor+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (15, 'Romeo y Julieta', 'William Shakespeare'," +
                " 'La representación y puesta en escena comienza con una disputa callejera entre los Montesco y los Capuleto. El príncipe de Verona, Della Escala, interviene entre ellos y declara un acuerdo de paz que en caso de ser violado habría de ser pagado con la muerte. Después de los sucesos, el conde Paris —pariente del príncipe Della Escala—, se reúne con el señor Capuleto para conversar sobre la idea de contraer matrimonio con su hija Julieta, pero el señor Capuleto le pide que espere durante un plazo de dos años más, tiempo tras el cual cumpliría quince años. Aprovechando el ofrecimiento, le sugiere que organice un baile familiar de carácter formal para celebrar tal acontecimiento. Mientras tanto, la señora Capuleto y la nodriza de Julieta intentan convencer a la joven de que acepte casarse con Paris.'," +
                " '1904/05/15', 'Cantaro, Norma, Zig Zag', 344, 0, "+R.drawable.romeo+", 'Español');");
        bd.execSQL("INSERT INTO Libro (ID_Libro, Titulo, Autor, Sinopsis, FechaDePublicacion, Editorial, CantidadDePaginas, Favorito, Imagen, Idioma) VALUES (16, 'La Odisea', 'Homero'," +
                " 'La obra consta de 24 cantos. Al igual que muchos poemas épicos antiguos, comienza in medias res: empieza en mitad de la historia, contando los hechos anteriores a base de recuerdos o narraciones del propio Odiseo. \nEl poema está dividido en tres partes. En la Telemaquia (cantos del I al IV) se describe la situación de Ítaca con la ausencia de su rey, el sufrimiento de Telémaco y Penélope debido a los pretendientes, y cómo el joven emprende un viaje en busca de su padre. En el regreso de Odiseo (cantos del V al XII) Odiseo llega a la corte del rey Alcínoo y narra todas sus vivencias desde que salió de Troya. Finalmente, en la venganza de Odiseo (cantos del XIII al XXIV), se describe el regreso a la isla, el reconocimiento por alguno de sus esclavos y su hijo, y cómo Odiseo se venga de los pretendientes matándolos a todos. \nTras aquello, Odiseo es reconocido por su esposa Penélope y recupera su reino. Por último, se firma la paz entre todos los itacenses.'," +
                " '1232/05/07', 'Desconocido', 601, 0, "+R.drawable.odisea+", 'Español');");


        bd.execSQL("CREATE TABLE Categorias(ID_Categoria int PRIMARY KEY ,Nombre_Categoria varchar(50));");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (1, 'Infantil')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (2, 'Juvenil')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (3, 'Literatura')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (4, 'Ficcion')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (5, 'Novela')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (6, 'Fantasia')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (7, 'Aventura')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (8, 'Misterio')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (9, 'Thriller')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (10, 'Policial')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (11, 'Tragedia')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (12, 'Drama')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (13, 'Historia')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (14, 'Parodia')");
        bd.execSQL("INSERT INTO Categorias(ID_Categoria, Nombre_Categoria) VALUES (15, 'Epopeya')");

        bd.execSQL("CREATE TABLE Libro_Categoria(ID_Libro int, ID_Categoria int, FOREIGN KEY(ID_Libro) REFERENCES Libro(ID_Libro), FOREIGN KEY(ID_Categoria) REFERENCES Categorias(ID_Categoria));");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (1,3)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (1,4)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (2,1)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (2,2)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (2,5)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (2,6)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (3,1)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (3,4)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (4,3)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (4,7)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (4,5)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (4,6)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (5,8)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (5,4)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (6,5)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (6,4)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (7,8)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (7,9)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (7,10)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (7,4)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (8,11)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (8,12)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (9,13)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (10,13)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (11,5)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (11,14)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (12,4)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (12,5)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (12,12)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (13,1)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (13,3)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (13,6)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (14,9)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (14,5)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (15,11)");
        bd.execSQL("INSERT INTO Libro_Categoria(ID_Libro ,ID_Categoria) VALUES (16,15)");


    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int vAnt, int vNueva) {
        //Log.i("TESTLOG", "DB.onUpgrade");
    }
}
