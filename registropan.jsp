<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
    <title>Agregar pan</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-widht, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./css/estilo.css">
    <link rel="shortcut icon" href="./img/logo.jpg" type="image/x-icon">
    <link href="https://fonts.googleapis.com/css2?family=Inconsolata:wght@500&display=swap" rel="stylesheet">
</head>
<body>
    <header class="header">
        <div class="logo">
            <h1>Panaderia el globito</h1>
            <img src="./img/logo.png" alt="logo">
        </div>
        <nav class="menu">
            <a href="panaderia.html">Principal</a>
            <a href="nosotros.html">Nosotros</a>
            <a href="producto.html">Productos</a>
            <a href="contacto.html">Contacto</a>
            <a href="registro.jsp">Registrate</a>
        </nav>
    </header>
    <section class="globito">
        <h2>Bienvenido a globito</h2>
        <img src="./img/globito.jpg" alt="globito">
    </section>
    <h2 class="titulo-p">UwU</h2>
    <section class="hide">
        
    </section>
        <section class="registrarUsuario" >
            <table width="800" border="0" aling="center" >
                <tr>
                    <td colspan="2" ><h2>Registrar pan</h2></td>
                </tr>
                <tr>
                    <td>
                <from method="post" name="formulario" action="agregarPan()" >
                    <table width="620" border="0" >
                        <tr>
                            <td>Nombre:</td>
                            <td> <input type="text" name="nombrep" id="nombrep" > </td>        
                        </tr>
                        <tr>
                            <td>Precio:</td>
                            <td> <input type="text" name="precio" id="precio" > </td>        
                        </tr>
                        <tr>
                            <td>Sabor:</td>
                            <td> <input type="text" name="sabor" id="sabor" > </td>        
                        </tr>
                        <tr>
                            <td>Stock:</td>
                            <td> <input type="text" name="stock" id="stock" > </td>        
                        </tr>
                        <tr>
                            <td><a href="inicio.jsp" >Registrar</a></td>
                            <td><input type="submit" value="Entrar" 
                                       name="inicio" ></td>
                        </tr>
                    </table>
                </from>
                    </td>        
                </tr>
            </table>
        </section>
        <footer class= footer>
            <p>Desarrollado por AABG</p>
         </footer>
     <script type="text/javascript" src="./js/anima.js"></script> 
    </body>
</html>
