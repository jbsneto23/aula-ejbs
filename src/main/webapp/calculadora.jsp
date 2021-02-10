<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de Financiamento</title>
    </head>
    
    <body>
        <h1>Calculadora de Financiamento</h1>
        <form action="calculadora-financiamento" method="POST">
        <table border="0" cellpadding="1">
            <tr>
                <td><label>Valor do Empréstimo:</label></td>
                <td><input type="text" name="valor" size="10" /> </td>
            </tr>
            <tr>
                <td><label>Meses:</label></td>
                <td><input type="text" name="meses" size="10" /> </td>
            </tr>
            <tr>
                <td><label>Taxa de Juros (%):</label></td>
                <td><input type="text" name="taxa" size="10" /> </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Calcular"/>
                    <input type="reset" value="Limpar"/>
                </td>
            </tr>
        </table>
        </form>
        
        <c:if test="${parcela != null}">
            <h3>Financiamento:</h3>
            <table border="1" cellpadding="1">
            <tr>
                <td><label>Valor do Empréstimo:</label></td>
                <td><fmt:formatNumber value="${valor}" maxFractionDigits="2"/></td>
            </tr>
            <tr>
                <td><label>Meses:</label></td>
                <td>${meses}</td>
            </tr>
            <tr>
                <td><label>Taxa de Juros (%):</label></td>
                <td><fmt:formatNumber value="${taxa}" maxFractionDigits="2"/></td>
            </tr>
            <tr>
                <td><label>Valor da Parcela:</label></td>
                <td><fmt:formatNumber value="${parcela}" maxFractionDigits="2"/></td>
            </tr>
            <tr>
                <td><label>Valor Total:</label></td>
                <td><fmt:formatNumber value="${valorTotal}" maxFractionDigits="2"/></td>
            </tr>
            </table>
        </c:if>
        
    </body>
</html>
