<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="cnpm.recipe.model.Recipe"%>
<%@page import="cnpm.recipe.model.Chude"%>
<%@page import="cnpm.recipe.model.TheLoai"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" />
    <script
      src="https://kit.fontawesome.com/1147679ae7.js"
      crossorigin="anonymous"
    ></script>
    <link
      rel="stylesheet"
      href="https://unpkg.com/swiper/swiper-bundle.min.css"
    />

    <!-- font awesome cdn link  -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
    />
    <link rel="stylesheet" href="css\timkiem2.css" />
    <title>RecipesWiki</title>
  </head>

  <body>
    <div class="Mcontainer">
      <nav class="navbar">
        <div class="hamburger-menu">
          <div class="line line-1"></div>
          <div class="line line-2"></div>
          <div class="line line-3"></div>
        </div>

        <div class="mn_logo">
          <img src="./Image/burger/food_logo.png" alt="" />
        </div>
        <ul class="nav-list">
          <li class="nav-item">
            <a href="#" class="nav-link">Tải lên công thức</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">Sự kiện</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">Sự kiện của tôi</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">Bộ sưu tập của tôi</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">Món của tôi</a>
          </li>
          <div class="hot-tag">
            <li class="nav-item">
              <p>Hot tag</p>
            </li>
            <li class="nav-tag">
              <a href="#" class="nav-link">#monanngayTet</a>
            </li>
            <li class="nav-tag">
              <a href="#" class="nav-link">#AnSang</a>
            </li>
            <li class="nav-tag">
              <a href="#" class="nav-link">#AnTrua</a>
            </li>
            <li class="nav-tag">
              <a href="#" class="nav-link">#AnToi</a>
            </li>
            <li class="nav-tag">
              <a href="#" class="nav-link">#Dauhu</a>
            </li>
          </div>
        </ul>
      </nav>
    </div>

    <header class="header__menu" id="myHeader">
      <nav>
        <ul class="menu-ul">
          <li class="">
            <a href="./trang_chu.html" class="menu-item">Trang chủ</a>
          </li>
          <li class="">
            <a href="./search1.html" class="menu-item">Tìm kiếm</a>
          </li>
          <li class="">
            <a href="./trang_chu.html" class="menu-item"
              ><span>RecipesWiki</span></a
            >
          </li>
          <li class="has-submenu">
            <a href="" class="menu-item">Chủ đề</a>
            <ul class="submenu">
              <li><a href="#">Ăn sáng</a></li>
              <li><a href="#">Ăn trưa</a></li>
              <li><a href="#">Ăn sáng</a></li>
            </ul>
          </li>
          <li class="active">
            <a href="./aboutus.html" class="menu-item">About us</a>
          </li>
          <li class="btn_account">
            <a href="./account.html" class="menu-item"
              ><img src="./Image/icon/account.png"
            /></a>
          </li>
        </ul>
      </nav>
    </header>

    <div>
      <div>
      <%Chude chude =(Chude) request.getAttribute("chude"); %>.
        <div class="container-checkbox">
          <!-- checkbox tên chủ đề -->
          <div class="checkbox0">
            <input type="radio" id="vehicle1" name="vehicle1" value="" />
            <label for="vehicle1">Thể Loại</label><br />
          </div>
          <%List<TheLoai> listTheLoai= (List<TheLoai> )request.getAttribute("listTheLoaiByTopic"); %>
          <%for(TheLoai tl:listTheLoai){ %>
          	<div class="checkbox1">
            <!-- checkbox tên thể loại -->
            <input type="radio" id="vehicle3" name="vehicle3" value="<%= tl.getId() %>" />
            <label for="vehicle3"> <%= tl.getTentheloai() %></label><br />
          </div>
          <%} %>
          </div>
          
         
        <div class="menu" id="menu">
          <div class="box-container">
          <%List<Recipe> listRecipe =(List<Recipe>) request.getAttribute("listRecipeTopic"); %>
          <%for(Recipe r:listRecipe){ %>
          	  <div class="box">
              <div class="image">
                <img src="<%= r.getHinhAnh() %>" alt="" />
              </div>
              <div class="content">
                <h3><%= r.getTen() %></h3>
                <p>
                  <%= r.getMoTa() %>
                </p>
              </div>
              <div class="profile">
                <img src="<%= r.getAvatarUser() %>" alt="" />
                <div class="content_profile">
                  <p class="name"><%= r.getNameUser() %></p>
                  <p><%=r.getTgDang() %></p>
                </div>
              </div>
            </div>
          <%} %>
          
          </div>
        </div>
      </div>
    </div>

    <div class="xemthem">
      <h3 type="submit">Xem thêm</h3>
    </div>
    <script>
      window.onscroll = function () {
        myFunction();
      };

      var header = document.getElementById("myHeader");
      var sticky = header.offsetTop;

      function myFunction() {
        if (window.pageYOffset > sticky) {
          header.classList.add("sticky");
        } else {
          header.classList.remove("sticky");
        }
      }
    </script>
    <script src="./js/burger.js"></script>
  </body>
</html>
    