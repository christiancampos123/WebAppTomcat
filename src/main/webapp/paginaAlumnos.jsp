<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.proyecto.clases.Generador" %>
<%@ page import="com.proyecto.clases.Alumno" %>
<%@ page import="com.proyecto.clases.Profesor" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Uso de Generador en JSP</title>
</head>
<body>
    <ul>
        <h1><a href="index.jsp">Index</a> | <a href="paginaAlumnos.jsp">Alumnos</a> | <a href="paginaProfes.jsp">Profesores</a></h1>
    </ul>

    <%
    Generador generador = new Generador();
    %>

        <%
            out.println("<h1>Lista de Alumnos</h1>");
            //Generador generador = new Generador();
            generador.leerAlumnos();

            // obtienes el metodo alumnos
            List<Alumno> listaAlumnos = generador.getListaAlumnos();
            out.println("<table border='1'><tr><th><h1>&nbsp;&nbsp;&nbsp;Nombre &nbsp;&nbsp;&nbsp;</h1></th><th><h1>&nbsp;&nbsp;&nbsp;Edad &nbsp;&nbsp;&nbsp;</h1></th><th><h1>&nbsp;&nbsp;&nbsp;Nota &nbsp;&nbsp;</h1></th></tr>");

            // lista no nula
            if (listaAlumnos != null && !listaAlumnos.isEmpty()) {
                for (Alumno alumno : listaAlumnos) {
                    out.println("<tr style='color: blue;'><th><h1>" + alumno.getNombre() +"</th><th><h1>"+ alumno.getEdad() + "</th><th><h1>" + alumno.getNota() +"</th></tr>");                }
        %>


        <%
            } else {
                // En caso de que la lista esté vacía o nula, muestra un mensaje de error
        %>

        <h1>No hay alumnos disponibles</h1>

        <%
            }
            out.println("</table>");
        %>





</body>
</html>
