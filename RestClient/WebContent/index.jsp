
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RestClient</title>

<script type="text/javascript" src="http://platform.linkedin.com/in.js">
  api_key: 77ywtoz3eay8jk
</script>
 
 <script type="text/javascript">
  function myReq(){
	 try
	 {
	     var auth ="AQU_-mNuiKn-Cg2XsLE9xeWjgwxxZbkL7CIKRbnAW4xk3hFLw3UCAkI9C8rOPVHdXAmVfT1DdDyK4bS9i4XwEAI7SvrtTCRdZNWh1p_eZhHXJaPVTFrbPUiqg89DHPkupIPBQ0bOUkOF4eiHmrYfwst-rJ0eKb0SiygaSS9qyauz5dKwReM";
	     window.location = "http://localhost:8080/RestClient/client?auth="+auth;
	 }
	 catch(err)
	 {
	     alert(err.message);
	 }  } 
 </script>


</head>
<body>
<script type="IN/Login">
  Hello, <?js= firstName ?> <?js= lastName ?>.
</script>

<input type="button" onclick="javascript:myReq();"  value="SEND YOUR REQUEST" />

</body>

</html>