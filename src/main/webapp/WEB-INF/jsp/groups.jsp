<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

       <!DOCTYPE HTML>
       <html>
          <head>
             <meta charset="UTF-8" />
             <title>Schedule</title>
             <link rel="stylesheet" type="text/css"
                       href="${pageContext.request.contextPath}/css/style.css"/>
          </head>
          <body>
              <c:forEach  items="${groups}" var ="group">

                       <h1>${group.id}:${group.name}</h1>

                       <a href="${pageContext.request.contextPath}/groups/${group.id}">${group.name}</a>

                     </c:forEach>

          </body>

       </html>