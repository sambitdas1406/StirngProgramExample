<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! int add=0,sub=0,div=0,mul=0;%>
<%
int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));

//int result=a+b;

%>


<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body bgcolor="yellow" >
<center>
<h1>calculation of Two Number:</h1>
<br>
<%
String op=request.getParameter("r1");
if(op.equals("add"))
{
	 add=a+b;
	 out.println(add);

}
if(op.equals("mul"))
{
	mul=a*b;
	out.println(mul);

}
if(op.equals("div"))
{
	 div=a/b;
	 out.println(div);


}
if(op.equals("sub"))
{
	 sub=a-b;
	 out.println(sub);

	
}
else
{
	System.out.println("Calculation is not possible");
}

%>
</center>
</body>
</html>