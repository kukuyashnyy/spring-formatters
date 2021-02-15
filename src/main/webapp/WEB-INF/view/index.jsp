<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        label {
            display: inline-block;
            width: 150px;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1>Formatters</h1>

<form:form modelAttribute="deliveryDto" method="post">
    <form:hidden path="id"/>
    <div>
        <form:label path="client">Клиент</form:label>
        <form:input path="client" placeholder="Имя клиента"/>
        <form:errors path="client" cssClass="error"/>
    </div>
    <div>
        <form:label path="location">Координаты доставки</form:label>
        <form:input path="location" placeholder="Широта, Долгота"/>
        <form:errors path="location" cssClass="error"/>
    </div>
    <div>
        <form:label path="address">Адрес доставки</form:label>
        <form:input path="address" placeholder="Город, Улица, Дом, Квартира"/>
        <form:errors path="address" cssClass="error"/>
    </div>
    <div>
        <form:label path="orderDateTime">Время доставки</form:label>
        <form:input path="orderDateTime" type="datetime-local"/>
        <form:errors path="orderDateTime" cssClass="error"/>
    </div>
    <div>
        <form:label path="orderList['item1']">Заказ 1</form:label>
        <form:input path="orderList['item1']" placeholder="Пица"/>
    </div>
    <div>
        <form:label path="orderList['item2']">Заказ 2</form:label>
        <form:input path="orderList['item2']" placeholder="Роллы"/>
    </div>
    <input type="submit">
</form:form>


<ul>
    <li><a href="https://docs.spring.io/spring-framework/docs/5.3.4-SNAPSHOT/reference/html/core.html#format">Spring
        Field Formatting</a></li>
    <li>
        <a href="https://docs.spring.io/spring-framework/docs/5.3.4-SNAPSHOT/reference/html/core.html#format-CustomFormatAnnotations">Annotation-driven
            Formatting</a></li>
</ul>

</body>
</html>
