package com.example.proy_hackaton_kotlin.backend

object Preguntas{
    fun oGetPreguntasAnsiedad():ArrayList<Quiz>{
        val oQuizList = ArrayList<Quiz>();
        val o1= Quiz(1,"Entumecimiento, hormigueo",0,1,2,3);
        val o2= Quiz(2,"Sentir oleadas de calor (bochorno)",0,1,2,3);
        val o3= Quiz(3,"Debilitamiento de las piernas",0,1,2,3);
        val o4= Quiz(4,"Dificultad para relajarse",0,1,2,3);
        val o5= Quiz(5,"Miedo a que pase lo peor",0,1,2,3);
        val o6= Quiz(6,"Sensación de mareo",0,1,2,3);
        val o7= Quiz(7,"Opresión en el pecho, o latidos acelerados",0,1,2,3);
        val o8= Quiz(8,"Inseguridad",0,1,2,3);
        val o9= Quiz(9,"Terror",0,1,2,3);
        val o10= Quiz(10,"Nerviosismo",0,1,2,3);
        val o11= Quiz(11,"Sensación de ahogo",0,1,2,3);
        val o12= Quiz(12,"Manos temblorosas",0,1,2,3);
        val o13= Quiz(13,"Cuerpo tembloroso",0,1,2,3);
        val o14= Quiz(14,"Miedo a perder el contro",0,1,2,3);
        val o15= Quiz(15,"Dificultad para respirar",0,1,2,3);
        val o16= Quiz(16,"Miedo a morir",0,1,2,3);
        val o17= Quiz(17,"Asustado",0,1,2,3);
        val o18= Quiz(18,"Indigestión, o malestar estomacal",0,1,2,3);
        val o19= Quiz(19,"Debilidad",0,1,2,3);
        val o20= Quiz(20,"Ruborizarse, sonrojamiento",0,1,2,3);
        val o21= Quiz(21,"Sudoración (no debida al calor)",0,1,2,3);
        oQuizList.add(o1);
        oQuizList.add(o2);
        oQuizList.add(o3);
        oQuizList.add(o4);
        oQuizList.add(o5);
        oQuizList.add(o6);
        oQuizList.add(o7);
        oQuizList.add(o8);
        oQuizList.add(o9);
        oQuizList.add(o10);
        oQuizList.add(o11);
        oQuizList.add(o12);
        oQuizList.add(o13);
        oQuizList.add(o14);
        oQuizList.add(o15);
        oQuizList.add(o16);
        oQuizList.add(o17);
        oQuizList.add(o18);
        oQuizList.add(o19);
        oQuizList.add(o20);
        oQuizList.add(o21);
        return oQuizList;
    }
    fun oGetPreguntasDepresion():ArrayList<QuizDepresion>{
        val oQuizList = ArrayList<QuizDepresion>();
        val o1= QuizDepresion(1,
            "Yo no me siento triste.",
            "Me siento triste.",
            "Me siento triste todo el tiempo y no puedo evitarlo.",
            "Estoy tan triste o infeliz que no puedo soportarlo.",0,1,2,3);
        val o2= QuizDepresion(2,
            "En general no me siento descorazonado por el futuro",
            "Me siento descorazonado por mi futuro.",
            "Siento que no tengo nada que esperar del futuro",
            "Siento que el futuro no tiene esperanza y que las cosas no pueden mejorar",0,1,2,3);
        val o3= QuizDepresion(3,
            "Yo no me siento como un fracasado.",
            "Siento que he fracasado más que las personas en general",
            "Al repasar lo que he vivido, todo lo que veo son muchos fracasos.",
            "Siento que soy un completo fracaso como persona.",0,1,2,3);
        val o4= QuizDepresion(4,
            "Obtengo tanta satisfacción de las cosas como solía hacerlo",
            "Yo no disfruto de las cosas de la manera como solía hacerlo",
            "Ya no obtengo verdadera satisfacción de nada.",
            "Estoy insatisfecho o aburrido con todo.",0,1,2,3);
        val o5= QuizDepresion(5,
            "En realidad yo no me siento culpable",
            "Me siento culpable una gran parte del tiempo",
            "Me siento culpable la mayor parte del tiempo.",
            "Me siento culpable todo el tiempo.",0,1,2,3);
        val o6= QuizDepresion(6,
            "Yo no me siento que esté siendo castigado",
            "Siento que podría ser castigado",
            "Espero ser castigado.",
            "Siento que he sido castigado.",0,1,2,3);
        val o7= QuizDepresion(7,
            "Yo no me siento desilusionado de mí mismo",
            "Estoy desilusionado de mí mismo",
            "Estoy disgustado conmigo mismo",
            "Me odio",0,1,2,3);
        val o8= QuizDepresion(8,
            "Yo no me siento que sea peor que otras personas",
            "Me critico a mí mismo por mis debilidades o errores",
            "Me culpo todo el tiempo por mis fallas.",
            " Me culpo por todo lo malo que sucede.",0,1,2,3);
        val o9= QuizDepresion(9,
            "Yo no tengo pensamientos suicidas.",
            "Tengo pensamientos suicidas pero no los llevaría a cabo.",
            "Me gustaría suicidarme.",
            "Me suicidaría si tuviera la oportunidad.",0,1,2,3);
        val o10= QuizDepresion(10,
            "Yo no lloro mas de lo usual.",
            "Lloro mas ahora de lo que solía hacerlo.",
            "Actualmente lloro todo el tiempo",
            "Antes podía llorar, pero ahora no lo puedo hacer a pesar de que lo deseo.",0,1,2,3);
        val o11= QuizDepresion(11,
            "Yo no estoy más irritable de lo que solía estar.",
            "Me enojo o irrito más fácilmente que antes.",
            "Me siento irritado todo el tiempo.",
            "Ya no me irrito de las cosas por las que solía hacerlo.",0,1,2,3);
        val o12= QuizDepresion(12,
            "Yo no he perdido el interés en la gente.",
            "Estoy menos interesado en la gente de lo que solía estar",
            "He perdido en gran medida el interés en la gente.",
            "He perdido todo el interés en la gente",0,1,2,3);
        val o13= QuizDepresion(13,
            "Tomo decisiones tan bien como siempre lo he hecho",
            "Pospongo tomar decisiones más que antes.",
            "Tengo mas dificultad en tomar decisiones que antes",
            " Ya no puedo tomar decisiones.",0,1,2,3);
        val o14= QuizDepresion(14,
            "Yo no siento que me vea peor de cómo me veía.",
            "Estoy preocupado de verme viejo (a) o poco atractivo (a).",
            "Siento que hay cambios permanentes en mi apariencia que me hacen ver poco atractivo (a)",
            "Creo que me veo feo (a).",0,1,2,3);
        val o15= QuizDepresion(15,
            "Puedo trabajar tan bien como antes",
            "Requiero de más esfuerzo para iniciar algo.",
            "Tengo que obligarme para hacer algo",
            "Yo no puedo hacer ningún trabajo.",0,1,2,3);
        val o16= QuizDepresion(16,
            "Puedo dormir tan bien como antes",
            "Ya no duermo tan bien como solía hacerlo",
            "Me despierto una y o dos horas mas temprano de lo normal y me cuesta trabajo volverme a dormir",
            "Me despierto muchas horas antes de lo que solía hacerlo y no puedo volver ha dormir.",0,1,2,3);
        val o17= QuizDepresion(17,
            "Yo no me canso mas de lo habitua",
            " Me canso más fácilmente de lo que solía hacerlo.",
            " Con cualquier cosa que haga me canso.",
            "Estoy muy cansado para hacer cualquier cosa",0,1,2,3);
        val o18= QuizDepresion(18,
            "Mi apetito no es peor de lo habitual",
            "Mi apetito no es tan bueno como solía serlo",
            "Mi apetito está muy mal ahora.",
            "No tengo apetito de nada.",0,1,2,3);
        val o19= QuizDepresion(19,
            "Yo no he perdido mucho peso últimamente",
            "He perdido más de dos kilogramos.",
            "He perdido más de cinco kilogramos",
            "He perdido más de ocho kilogramos",0,1,2,3);
        val o20= QuizDepresion(20,
            "Yo no estoy mas preocupado de mi salud que antes.",
            "Estoy preocupado acerca de problemas físicos tales como dolores, malestar estomacal o constipación.",
            "Estoy muy preocupado por problemas físicos y es difícil pensar en algo más.",
            "Estoy tan preocupado por mis problemas físicos que no puedo pensar en ninguna otra cosa.",0,1,2,3);
        val o21= QuizDepresion(21,
            "Yo no he notado ningún cambio reciente en mi interés por el sexo",
            "Estoy menos interesado en el sexo de lo que estaba",
            "Estoy mucho menos interesado en el sexo ahora.",
            "He perdido completamente el interés por el sexo.",0,1,2,3);
        oQuizList.add(o1);
        oQuizList.add(o2);
        oQuizList.add(o3);
        oQuizList.add(o4);
        oQuizList.add(o5);
        oQuizList.add(o6);
        oQuizList.add(o7);
        oQuizList.add(o8);
        oQuizList.add(o9);
        oQuizList.add(o10);
        oQuizList.add(o11);
        oQuizList.add(o12);
        oQuizList.add(o13);
        oQuizList.add(o14);
        oQuizList.add(o15);
        oQuizList.add(o16);
        oQuizList.add(o17);
        oQuizList.add(o18);
        oQuizList.add(o19);
        oQuizList.add(o20);
        oQuizList.add(o21);
        return oQuizList;
    }
    fun oGetPreguntasEstres():ArrayList<QuizEstres>{
        val oQuizList = ArrayList<QuizEstres>();
        val o1= QuizEstres(1,"Trate de analizar las causas del problema para poder hacerle" +
                " frente.",0,1,2,3,4);
        val o2= QuizEstres(2,"Me convencí de que hiciese lo que hiciese las cosas siempre me" +
                " saldrían mal.",0,1,2,3,4);
        val o3= QuizEstres(3,"Intente centrarme en los aspectos positivos del problema.",0,1,2,3,4);
        val o4= QuizEstres(4,"Descargue mi mal humor con los demás. ",0,1,2,3,4);
        val o5= QuizEstres(5,"Cuando me venía a la cabeza el problema, trataba de" +
                " concentrarme en otra cosa.",0,1,2,3,4);
        val o6= QuizEstres(6,"Le conté a familiares o amigos como me sentía.",0,1,2,3,4);
        val o7= QuizEstres(7,"Asistí a la iglesia.",0,1,2,3,4);
        val o8= QuizEstres(8,"Trate de solucionar el problema siguiendo unos pasos bien" +
                " pensados.",0,1,2,3,4);
        val o9= QuizEstres(9,"No hice nada concreto puesto que las cosas suelen ser malas.",0,1,2,3,4);
        val o10= QuizEstres(10,"Intente sacar algo positivo del problema.",0,1,2,3,4);
        val o11= QuizEstres(11,"Insulte a ciertas personas.",0,1,2,3,4);
        val o12= QuizEstres(12,"Me volqué en el trabajo o en otra actividad para olvidarme del" +
                " problema.",0,1,2,3,4);
        val o13= QuizEstres(13,"Pedí consejos a algún pariente o amigo para afrontar mejor el" +
                " problema.",0,1,2,3,4);
        val o14= QuizEstres(14,"Pedí ayuda espiritual a algún religioso.",0,1,2,3,4);
        val o15= QuizEstres(15,"Establecí un plan de actuación y procure llevarlo a cabo.",0,1,2,3,4);
        val o16= QuizEstres(16,"Comprendí que yo fui el principal causante del problema.",0,1,2,3,4);
        val o17= QuizEstres(17,"Descubrí que en la vida hay cosas buenas y gente que se" +
                " preocupa por los demás.",0,1,2,3,4);
        val o18= QuizEstres(18,"Me comporte de forma hostil con los demás.",0,1,2,3,4);
        val o19= QuizEstres(19,"Salí al cine, a cenar, a dar una vuelta, etc. Para olvidarme del" +
                " problema.",0,1,2,3,4);
        val o20= QuizEstres(20," Pedí a parientes o amigos que me ayudaran a pensar cerca del" +
                " problema. ",0,1,2,3,4);
        val o21= QuizEstres(21,"Acudí a la iglesia para rogar que se solucione el problema.",0,1,2,3,4);
        val o22= QuizEstres(22,"Hable con las personas implicadas para encontrar una solución" +
                " el problema.",0,1,2,3,4);
        val o23= QuizEstres(23,"Me pensé indefenso/a e incapaz de hacer algo positivo para" +
                " cambiar la situación.",0,1,2,3,4);
        val o24= QuizEstres(24,"Comprendí que otras cosas diferentes del problema, eran para" +
                " mi más importantes. ",0,1,2,3,4);
        val o25= QuizEstres(25,"Agredí a algunas personas... ",0,1,2,3,4);
        val o26= QuizEstres(26,"Procure no pensar en el problema.",0,1,2,3,4);
        val o27= QuizEstres(27,"Hable con amigos o familiares para que me tranquilizaran cuando" +
                " me encontraba mal.",0,1,2,3,4);
        val o28= QuizEstres(28,"Tuve fe en que Dios remediaría la situación.",0,1,2,3,4);
        val o29= QuizEstres(29,"Hice frente al problema poniendo en marcha varias soluciones" +
                " concretas.",0,1,2,3,4);
        val o30= QuizEstres(30,"Me di cuenta de que por mí mismo no podía hacer nada para" +
                " resolver el problema.",0,1,2,3,4);
        val o31= QuizEstres(31,"Experimente personalmente eso de que no hay mal que por bien" +
                " no venga.",0,1,2,3,4);
        val o32= QuizEstres(32,"Me irrite con alguna gente.",0,1,2,3,4);
        val o33= QuizEstres(33,"Practique algún deporte para olvidarme del problema. ",0,1,2,3,4);
        val o34= QuizEstres(34,"Pedí a algún amigo o familiar que me indicara cual sería el mejor" +
                " camino a seguir. ",0,1,2,3,4);
        val o35= QuizEstres(35,"Rece.",0,1,2,3,4);
        val o36= QuizEstres(36,"Pensé detenidamente los pasos a seguir para enfrentarme al" +
                " problema.",0,1,2,3,4);
        val o37= QuizEstres(37,"Me resigne a aceptar las cosas como eran",0,1,2,3,4);
        val o38= QuizEstres(38," Comprobé que después de todo, las cosas podían haber ocurrido" +
                " peor.",0,1,2,3,4);
        val o39= QuizEstres(39,"Luche y me desahogue expresando mis sentimientos.",0,1,2,3,4);
        val o40= QuizEstres(40,"Intente olvidarme de todo.",0,1,2,3,4);
        val o41= QuizEstres(41,"Procure que algún familiar o amigo me escuchase cuando" +
                " necesite manifestar mis sentimientos.",0,1,2,3,4);
        val o42= QuizEstres(42,"Acudí a la iglesia para poner velas o rezar.",0,1,2,3,4);
        oQuizList.add(o1);
        oQuizList.add(o2);
        oQuizList.add(o3);
        oQuizList.add(o4);
        oQuizList.add(o5);
        oQuizList.add(o6);
        oQuizList.add(o7);
        oQuizList.add(o8);
        oQuizList.add(o9);
        oQuizList.add(o10);
        oQuizList.add(o11);
        oQuizList.add(o12);
        oQuizList.add(o13);
        oQuizList.add(o14);
        oQuizList.add(o15);
        oQuizList.add(o16);
        oQuizList.add(o17);
        oQuizList.add(o18);
        oQuizList.add(o19);
        oQuizList.add(o20);
        oQuizList.add(o21);
        oQuizList.add(o22);
        oQuizList.add(o23);
        oQuizList.add(o24);
        oQuizList.add(o25);
        oQuizList.add(o26);
        oQuizList.add(o27);
        oQuizList.add(o28);
        oQuizList.add(o29);
        oQuizList.add(o30);
        oQuizList.add(o31);
        oQuizList.add(o32);
        oQuizList.add(o33);
        oQuizList.add(o34);
        oQuizList.add(o35);
        oQuizList.add(o36);
        oQuizList.add(o37);
        oQuizList.add(o38);
        oQuizList.add(o39);
        oQuizList.add(o40);
        oQuizList.add(o41);
        oQuizList.add(o42);
        return oQuizList;
    }
}