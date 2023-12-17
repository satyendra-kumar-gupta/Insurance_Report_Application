<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<html>
<head>
<meta charset="ISO-8859-1">
<title> Report Application test</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<div class="container"> 
		<h3 class="pb-3 pt-3"> Report Application </h3>
		
		
		<form:form action="search" modelAtttribute ="command" method ="POST">
			<table>
				<tr>
					<td>Plane Name:</td>
					<td>
						<form:select path="planName">
						<form:option value="names"> -Select- </form:option>
						<form:options items="${names}"/>
						</form:select>
					</td>
				
					<td>Plane Status:</td>
					<td>
						<form:select path="planStatus">
						<form:option value="status"> -Select- </form:option>
						<form:options items="${status}"/>
						</form:select>
					</td>
				
					<td>Gender:</td>
					<td>
				    	<form:select path="gender">
						<form:option value=""> -select-</form:option>
						<form:option value="Male"> Male</form:option>
						<form:option value="Fe-male"> Fe-male</form:option>
						</form:select>
					</td>
				</tr>	
					<tr>
						<td>Start Date:</td>
						<td>
								<form:input path="startDate" type ="date"/>
						</td>
						<td>End Date:</td>
							<td>
								<form:input path="endDate" type ="date"/>
						</td>
					</tr>
					
					<tr>
						<td>
							<input type="submit" value="Search" class ="btn btn-primary"/>
						</td>
						
					</tr>
					
			</table>
		</form:form>
		
		<hr/>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Holder Name</th>
					<th>Gender</th>
					<th>Plan Name</th>
					<th>Plan Status</th>
					<th>Start Date</th>
					<th>End Date</th>
					<th>Benefit Amount</th>
					<th>Denial Reason</th>
					<th>Termination Date</th>
					<th>Termination Rsn</th>

				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${citizenPlans}" var="plan">
					<tr>
						<td>${plan.citizenId}</td>
						<td>${plan.citizenName}</td>
						<td>${plan.gender}</td>
						<td>${plan.planeName}</td>
						<td>${plan.planeStatus}</td>
						<td>${plan.planeStartDate}</td>
						<td>${plan.planeEnddate}</td>
						<td>${plan.benefitAmount}</td>
						<td>${plan.denialReason}</td>
						<td>${plan.terminationDate}</td>
						<td>${plan.terminationRsn}</td>
					</tr>
				</c:forEach>
				
			</tbody>
			
		</table>
		<hr/>
		
		Export: <a href=""> Excel</a>  <a href=""> PDF</a>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>