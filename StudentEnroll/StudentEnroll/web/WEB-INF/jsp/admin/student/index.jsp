<%-- 
    Document   : index
    Created on : Jun 20, 2015, 4:49:59 PM
    Author     : Kripesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../../header.jsp"%>
<div class="box">
    <div class="row">
        <div class="pull-right" style="margin-right:130px">
            <p>
                <br/>
                <a href="${pageContext.request.contextPath}/admin/student/add" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Add</a>
            </p>
        </div>    
            <div class="pull-left" style="margin-left:130px">
            <h3>Student Data Table</h3>
            </div>
            <div class="container">
            <table id="example1" class="table table-bordered table-striped table-hover">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th> 
                    <th>Contact</th>
                    <th>Join Date</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="std" items="${students}">
                    <tr>
                        <td>${std.getStudentId()}</td>
                        <td>${std.getFirstName()} ${std.getLastName()}</td>
                        <td>${std.getEmail()}</td>
                        <td>${std.getContact()}</td>                             
                        <td>${std.getJoinDate()}</td>
                        <td>
                            <c:choose>
                                <c:when test="${std.getStatus()==null}">
                                    <img src="../../../assets/img/reject.png" alt=""/>
                                </c:when>
                                <c:otherwise>
                                    <img src="../../../assets/img/accept.png" alt=""/>
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/admin/student/edit?id=${std.getStudentId()}"class="btn btn-success btn-xs"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Edit</a>
                            <a href="${pageContext.request.contextPath}/admin/student/delete?applicant_id=${std.getStudentId()}" id="btnDelete" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>Delete</a>
                        </td>
                    </tr>
                </c:forEach> 
            </table>
        </div>
    </div>
</div>




<%@include file="../../../footer.jsp"%>
