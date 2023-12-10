<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"  %>


<h2>Courses Information:</h2>
<ul><c:forEach var="cou" items="${AL} ">
<li><h1>${cou}</h1>

</c:forEach>   </ul>

<h1>${MSG}</h1>


