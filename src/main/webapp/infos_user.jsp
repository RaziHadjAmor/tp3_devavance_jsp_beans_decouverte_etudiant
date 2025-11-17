<%-- 
    Document   : infos_user
    Created on : 10 oct. 2023, 10:48:43
    Author     : bouchaib.lemaire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="fr.devavance.metier.beans.User" %>


<%--
    Déclaration du bean User et récupération de l'instance
    stockée dans l'objet request par la Servlet (portée 'request').
    L'ID du bean sera ici 'user'.
--%>
<jsp:useBean id="user" scope="request" class="fr.devavance.metier.beans.User" />


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informations des utilisateurs</title>
    </head>
    <body>
        
        <div class="info_user">
            <h2>Informations utilisateur</h2>

            <p>
                <b>Nom d'utilisateur :</b> 
                <jsp:getProperty name="user" property="userName" />
            </p>
            
            <p>
                <b>Mot de passe :</b> 
                <jsp:getProperty name="user" property="password" />
            </p>
            
            <p>
                <b>Profil :</b> 
                <jsp:getProperty name="user" property="profil" />
            </p>
            
            <p>
                <b>Authentification :</b> 
                <%-- Pour l'attribut Boolean 'auth', on utilise le getter isAuth() --%>
                <jsp:getProperty name="user" property="auth" /> 
            </p>

        </div>
     
        <div class="credentials">
        </div>
        
    </body>
</html>