<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="cnpm.recipe.model.Recipe"%>
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
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="css/monancuatoi.css" />
   
    <!--link bootstrap-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
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
            <a href="home" class="menu-item">Trang chủ</a>
          </li>
          <li class="">
            <a href="search" class="menu-item">Tìm kiếm</a>
          </li>
          <li class="">
            <a href="home" class="menu-item"
              ><span>RecipesWiki</span></a
            >
          </li>
          <li class="has-submenu">
            <a href="" class="menu-item">Chủ đề</a>
            <ul class="submenu">
             <li><a href="search-topic?topic=1"  >Ăn sáng</a></li>
                <li><a href="search-topic?topic=3" >Ăn trưa</a></li>
                <li><a href="search-topic?topic=2"  >Ăn tối</a></li>
                <li><a href="search-topic?topic=4"  >Dã ngoại</a></li>
                <li><a href="search-topic?topic=5"  >Giáng sinh</a></li>
                <li><a href="search-topic?topic=6"  >Halloween</a></li>
                <li><a href="search-topic?topic=7" >Lễ tình nhân</a></li>
                <li><a href="search-topic?topic=8"  >Món chay</a></li>
                <li><a href="search-topic?topic=9"  >Ngày tết</a></li>
                <li><a href="search-topic?topic=10"  >Sinh nhật</a></li>
                <li><a href="chude"  >Tất cả chủ đề</a></li>
            </ul>
          </li>
          <li>
            <a href="aboutus" class="menu-item">About us</a>
          </li>
          <li class="btn_account active">
            <a href="profile" class="menu-item"
              ><img src="./Image/icon/account.png"
            /></a>
          </li>
        </ul>
      </nav>
    </header>
   
    <div class="container">
        <div class="row">
            <div class="Mycook">
                <span>Món của tôi</span>
            </div>
        </div>
        
        <%List<Recipe> recipes =(List<Recipe>) request.getAttribute("listRecipe"); %>
        <%for (Recipe recipe:recipes){ %>
        	<div class="content">
                <img src="<%=recipe.getHinhAnh() %>" alt="">
                <div class="content-text">
                    <h3><%=recipe.getTen() %></h3>
                    <p><%=recipe.getMoTa() %></p>
                </div>
                <div class="row dish">
                    <div class="col-md-6">
                        <div class="row">
                            <div class="col-md-3 profie-img">
                                <img src="<%=recipe.getAvatarUser() %>" alt="">
                            </div>
                            <div class="col-md-9">
                                <div class="row">
                                    <p class="username"><%=recipe.getNameUser() %></p>
                                </div>
                                <div class="row">
                                    <p class="ngaydang"><%=recipe.getTgDang() %></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 btn-xoa">
                        <button><a href="my-Recipe?id=<%=recipe.getId()%>">Xóa món này</a></button>
                    </div>
                </div>
          </div> 
        <%} %>
          
          
          
    </div>

    <div class="newdish" >
        <button><a href="create-recipe">+ Viết món mới</a></button>
    </div>



   

    <script>
        window.onscroll = function() {myFunction()};
        
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
    <script src="//code.jquery.com/jquery.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>
    