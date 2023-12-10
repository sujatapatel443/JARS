<html>
<body>
<h1>
<table align="center">
<tr>
<td><h1>Welcome <%= request.getAttribute("NM") %> </h1></td>
</tr>

<tr>
<td><h1>You have sent request on <%=request.getAttribute("DT") %> </h1></td> 
</tr>
</table>
Welcome <%= request.getAttribute("NM") %>
<br/>
You have sent request on <%=request.getAttribute("DT") %>
<br/>
Thanks......
</h1>
</body>
</html>