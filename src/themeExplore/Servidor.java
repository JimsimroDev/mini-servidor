package themeExplore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Servidor {

    public Map<String, String> temas;

    public ServerSocket soServer;

    public Servidor() {
       
        this.temas = new HashMap<>();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutiting down");
            stop();
        }));
    }

    public void agregarNuevoTema(String tema, String descripcion) {
        temas.put(tema, descripcion);
    }

    private void dispatchCliente(Socket cliente) {
        Thread t;
        t = new Thread(() -> {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()))) {
                PrintWriter pr1 = new PrintWriter(cliente.getOutputStream());

                temas.put("java", "Java es un lenguaje de programación de alto nivel y orientado a objetos,"
                        + " creado por Sun Microsystems (ahora propiedad de Oracle) en 1995. Es conocido por su"
                        + " portabilidad, lo que significa que el código escrito en Java puede ejecutarse en"
                        + " diferentes plataformas sin necesidad de recompilación. Esto se logra a través "
                        + "de la JVM (Java Virtual Machine), que interpreta el código Java en bytecode, "
                        + "permitiendo que se ejecute en diversas plataformas.");
                temas.put("PHP", "PHP es un lenguaje de programación de código abierto ampliamente "
                        + "utilizado para el desarrollo de aplicaciones web dinámicas. Es especialmente"
                        + " conocido por su integración con HTML para crear sitios web dinámicos y"
                        + " aplicaciones basadas en web. PHP se ejecuta en el servidor, generando"
                        + " contenido dinámico que se envía al navegador web del usuario.");
                temas.put("js", "JavaScript es un lenguaje de programación de alto nivel que"
                        + " se utiliza principalmente para crear contenido interactivo en "
                        + "sitios web. Es un lenguaje de script del lado del cliente, lo que"
                        + " significa que se ejecuta en el navegador web del usuario, lo que"
                        + " permite crear experiencias interactivas como efectos visuales,"
                        + " validación de formularios, animaciones y comunicación con el servidor.");

                temas.put("phyton", "Python es un lenguaje de programación de alto nivel,"
                        + " interpretado y multipropósito. Es conocido por su sintaxis clara y "
                        + "legible que lo hace adecuado para principiantes, así como su"
                        + " versatilidad y una amplia gama de aplicaciones, que van desde "
                        + "desarrollo web hasta inteligencia artificial, análisis de datos,"
                        + " automatización de tareas, entre otros.");
                temas.put("MySQL", "es un sistema de gestión de bases de datos relacional de código"
                        + " abierto ampliamente utilizado. Es una base de datos SQL que proporciona"
                        + " un almacenamiento eficiente y seguro de datos estructurados. "
                        + "Es especialmente popular en aplicaciones web y se integra bien con "
                        + "lenguajes de programación como PHP, Python y Java.");
                temas.put("COBOL", "es un lenguaje de programación de propósito general diseñado "
                        + "principalmente para aplicaciones comerciales y empresariales. Aunque es"
                        + " más antiguo que los otros mencionados, COBOL sigue siendo ampliamente "
                        + "utilizado en sistemas heredados de grandes empresas y organizaciones"
                        + " gubernamentales debido a su robustez y confiabilidad en el procesamiento "
                        + "de datos empresariales.");
                //println(temas.mostrarTodosLostemas());
                // Leer la solicitud del cliente
                String solicitud = in.readLine();
                System.out.println("Cliente solicita información sobre: " + solicitud);

                if (solicitud.startsWith("AGREGAR_TEMA")) {
                    // La solicitud tiene el formato: "AGREGAR_TEMA,nuevoTema,descripcion"
                    String[] partes = solicitud.split(",");
                    if (partes.length == 3) {
                        String nuevoTema = partes[1];
                        String descripcion = partes[2];
                        agregarNuevoTema(nuevoTema, descripcion);
                        pr1.println("Nuevo tema agregado exitosamente.");
                    } else {
                        pr1.println("Formato de solicitud incorrecto para agregar un nuevo tema.");
                    }
                } else {
                    // Buscar el tema solicitado
                    boolean temaEncontrado = false;
                    String mostrar = "";
                    for (Map.Entry<String, String> entry : temas.entrySet()) {
                        // Obtener el tema y la descripción
                        String tema = entry.getKey();
                        String descripcion = entry.getValue();

                        // Enviar la información al cliente o informar que el tema no existe
                        if (tema.equalsIgnoreCase(solicitud)) {
                            mostrar = descripcion;
                            pr1.println(mostrar);
                            temaEncontrado = true;
                            break; // Termina el bucle si se encuentra el tema
                        }
                    }

                    if (!temaEncontrado) {
                        pr1.print("El temea no existe lo puede agragar en el boton nuevo tema");
                    }

                }

                // Buscar el tema solicitado
                pr1.close();
                System.out.println("Conexion atendida");
            } catch (IOException e) {
                System.out.println("Error al enviar la informacion al cliente");
            }
        });
        t.start();
    }

    protected void run() {
        //crear el sokect en modo servidor
        try {
            soServer = new ServerSocket(2000);
        } catch (IOException e) {
            System.out.println("No se puede crear el servidor: " + e.getMessage());
            return;
        }
        System.out.printf("El puerto a inciado en el puerto %d.\n", soServer.getLocalPort());
        //Obtener sokect cuando el cliente se conecta
        while (true) {//ciclo infinito
            try {
                Socket cliente = soServer.accept();//el metodo acept queda en pausa hasta que un cliente se conecte y devuelce el socket que se puede leer o envia datos  
                //cuando el cliente se conecte devuelvo el resultado en la variable para procesarlo
                dispatchCliente(cliente);

            } catch (IOException e) {
                System.out.println("Error al establecer conexion con el cliente: " + e.getMessage());
            }
        }
    }

    public void stop() {
        try {
            soServer.close();
        } catch (IOException e) {
            System.out.println(e.getClass().getName() + " generated: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("El servidor a finalizado.");
    }
   
}
