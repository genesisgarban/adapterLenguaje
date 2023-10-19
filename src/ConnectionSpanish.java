public class ConnectionSpanish implements IConnectionNoEnglish {

        public void connection() {
            System.out.println("Bienvenido a wikipedia en Español");
        }

        public String executeSentence() {
            return "¿Qué es la programación en informática?\n" +
                    "Aprende sobre programación informática con cursos online\n" +
                    "La programación informática es todo proceso que involucra el diseño, codificación, mantenimiento, y protección de cualquier fuente de programas.\n"+
                    "El objetivo principal de la programación informática es la creación de softwares, con el fin de ser ejecutados a través de computadoras, programas o plataformas.";
        }
    }
