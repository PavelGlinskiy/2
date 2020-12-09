<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Schedule</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>
       <c:forEach  items="${schedule}" var ="scheduleElement">

                <h1>${scheduleElement.timePeriod}:${scheduleElement.lessonName}:${scheduleElement.lessonDay}</h1>


              </c:forEach>

   </body>

</html>