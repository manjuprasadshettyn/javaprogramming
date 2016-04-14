<html>
    <head>
        <title>
            JSP Example - Server Response
        </title>
    </head>
    <body>


        <h3>Form Data </h3>
        Full name: <%= request.getParameter("fname")+" "+request.getParameter("lname") %><br/>
        Gender   : <%= request.getParameter("gender")%> <br/>
    </body>
</html>
