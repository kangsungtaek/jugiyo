<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div style="padding-top: 50px;">
</div>
	<button onclick="menubarSelect('Demo1')"
		class="w3-button w3-block w3-black w3-left-align">등록된 메뉴</button>
	<div class="w3-container">
		<div id="Demo1" class="w3-show">
			<ul class="w3-ul w3-card-4">

				<c:forEach items="${menuList}" var="menu">
					<li class="w3-bar menu" id="${menu.no }"><img
						src="${menu.fileUrl }" class="w3-round w3-right "
						style="width: 100px">
						<div class="w3-bar-item">
							<span class="w3-large">${menu.name }</span><br> <span>${menu.price }</span>
						</div></li>
				</c:forEach>
			</ul>
		</div>
	</div>
	<!-- 
				<div style="padding-top:50px;">

<button onclick="myFunction('Demo1')" class="w3-button w3-block w3-black w3-left-align">미확인 주문내역</button>

<div id="Demo1" class="w3-show w3-container">
    <ul class="w3-ul w3-card-4">
  <li class="w3-bar">
    <span onclick="this.parentElement.style.display='none'" class="w3-bar-item w3-button w3-white w3-xlarge w3-right">×</span>
    
    <div class="w3-bar-item">
      <span class="w3-large">콜라+사이다+치킨</span><br>
      <span>~님의 주문</span>
    </div>
  </li>

	<li class="w3-bar">
    <span onclick="this.parentElement.style.display='none'" class="w3-bar-item w3-button w3-white w3-xlarge w3-right">×</span>
    
    <div class="w3-bar-item">
      <span class="w3-large">123457</span><br>
      <span>~님의 주문</span>
    </div>
  </li>
	
</ul>
    
</div>


</div>
				
				 -->