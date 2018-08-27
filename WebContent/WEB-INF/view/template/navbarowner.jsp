<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- 메뉴bar에 있는 dropdown -->
	<div class="w3-bar w3-light-gray w3-bottombar">
		<div class="w3-dropdown-hover">
			<button class="w3-button w3-light-gray">주문관리</button>
			<div class="w3-dropdown-content w3-bar-block w3-border">
				<a href="/owner/index" class="w3-bar-item w3-button">지금 도착한 주문</a> <a
					href="/owner/today" class="w3-bar-item w3-button">주문현황</a>
			</div>
		</div>
		<div class="w3-dropdown-hover">
			<button class="w3-button w3-light-gray">메뉴관리</button>
			<div class="w3-dropdown-content w3-bar-block w3-border">
				<a href="/owner/addedmenu" class="w3-bar-item w3-button">메뉴현황/수정</a>
				<a href="/owner/addmenu" class="w3-bar-item w3-button">메뉴추가</a>
			</div>
		</div>
		<div class="w3-dropdown-hover">
			<button class="w3-button w3-light-gray">리뷰관리</button>
			<div class="w3-dropdown-content w3-bar-block w3-border">
				<a href="#" class="w3-bar-item w3-button">공지등록</a> <a href="#"
					class="w3-bar-item w3-button">리뷰관리</a>
			</div>
		</div>
		<div class="w3-dropdown-hover">
			<button class="w3-button w3-light-gray">통계</button>
			<div class="w3-dropdown-content w3-bar-block w3-border">
				<a href="/owner/salesstats" class="w3-bar-item w3-button">매출통계</a> <a
					href="/owner/menustats" class="w3-bar-item w3-button">메뉴통계</a>
			</div>
			
		</div>
		<div align="right">
				<button class="w3-button w3-light-gray">${sessionScope.login.name}</button>
			</div>
	</div>