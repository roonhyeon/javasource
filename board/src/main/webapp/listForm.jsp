<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/include/header.jsp"%>

<h2>Board List</h2>
 <form class="row g-3 justify-content-center" action='<c:url value="/list.do"/>'>
 <div class="col-auto">
    <select class="form-select" name="criteria">
      <option value="n" <c:out value="${pageDto.criteria==null?'selected':'' }"/>>검색기준선택</option>
      <option value="title" <c:out value="${pageDto.criteria=='title'?'selected':'' }"/>>title</option>
      <option value="name" <c:out value="${pageDto.criteria=='name'?'selected':'' }"/>>name</option>
      <option value="content" <c:out value="${pageDto.criteria=='content'?'selected':'' }"/>>content</option>
    </select>
 </div>
 <div class="col-md-5">
    <input type="text" class="form-control" placeholder="검색어" name="keyword" value="${pageDto.keyword}"/>
 </div>
 <div class="col-auto">
    <button type="submit" class="btn btn-secondary">검색</button>
 </div>
 <input type="hidden" name="page" value="${pageDto.page}"/>
 <input type="hidden" name="amount" value="${pageDto.amount}"/>
</form>
    <table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일</th>
      <th scope="col">조회수</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="dto" items="${list}">
    <tr>
      <th scope="row">${dto.bno}</th>
      <td>
      <c:if test="${dto.reLev != 0}">
          <%-- 공백을 위한 코딩 --%>
          <c:forEach begin="0" end="${dto.reLev*1}"> 
              &nbsp;
          </c:forEach>
          <span class="material-symbols-outlined">
              subdirectory_arrow_right
          </span>
      </c:if>
      <a href='${dto.bno}' class="move">${dto.title}</a></td>
      <td>${dto.name}</td>
      <td>${dto.regDate}</td>
      <td>${dto.cnt}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="row">
    <div class="col">
		<nav aria-label="page navigation">
			<ul class="pagination justify-content-center">
				<c:if test="${pageDto.prev}">
					<li class="page-item"><a class="page-link" href="${pageDto.startPage-1}">Previous</a></li>
				</c:if>
				<c:forEach begin="${pageDto.startPage}" end="${pageDto.endPage}" var="idx">
					<li class="page-item ${pageDto.page==idx ? 'active':'' }"><a class="page-link" href="${idx}">${idx}</a></li>
				</c:forEach>
				<c:if test="${pageDto.next}">
					<li class="page-item"><a class="page-link" href="${pageDto.endPage+1}">Next</a></li>
				</c:if>
			</ul>
		</nav>
	</div>
    <div class="col-2">
      <select class="form-select" aria-label="" name="amount">
           <option value="10" <c:out value="${pageDto.amount==10?'selected':''}"/>>10</option>
           <option value="20" <c:out value="${pageDto.amount==20?'selected':''}"/>>20</option>
           <option value="30" <c:out value="${pageDto.amount==30?'selected':''}"/>>30</option>
           <option value="40" <c:out value="${pageDto.amount==40?'selected':''}"/>>40</option>      
      </select>
    </div>
</div>
<form action="list.do" id="actionForm">
    <input type="hidden" name="bno" value=""/>
    <input type="hidden" name="criteria" value="${pageDto.criteria}"/>
    <input type="hidden" name="keyword" value="${pageDto.keyword}"/>
    <input type="hidden" name="page" value="${pageDto.page}"/>
    <input type="hidden" name="amount" value="${pageDto.amount}"/>
</form>
<script src='<c:url value="/js/list.js"/>'></script>
<%@ include file="/include/footer.jsp"%>
