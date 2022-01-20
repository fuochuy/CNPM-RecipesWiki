<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="cnpm.recipe.model.Recipe"%>
<%@page import="cnpm.recipe.model.Step"%>
<%@page import="cnpm.recipe.model.Comment"%>
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
    <!--link bootstrap-->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
    />
    <link rel="stylesheet" href="css\manhinhcua1CT.css" />
    <!--link bootstrap-->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
    />
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
              <li><a href="search?id=1">Ăn sáng</a></li>
              <li><a href="search?id=3">Ăn trưa</a></li>
              <li><a href="search?id=2">Ăn tối</a></li>
              <li><a href="search?id=4">Dã ngoại</a></li>
              <li><a href="search?id=5">Giáng sinh</a></li>
              <li><a href="search?id=6">Halloween</a></li>
              <li><a href="search?id=7">Lễ tình nhân</a></li>
              <li><a href="search?id=8">Món chay</a></li>
              <li><a href="search?id=9">Ngày tết</a></li>
              <li><a href="search?id=10">Sinh nhật</a></li>
              <li><a href="chude">Tất cả chủ đề</a></li>
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
    <%Recipe recipe =(Recipe) request.getAttribute("recipe"); %>
    <div class="container">
      <div class="content">
        
          <div class="row">
            <div class="col-md-6">
              <div class="recipes-image">
                <img src="<%=recipe.getHinhAnh() %>" alt="" />
              </div>
            </div>

            <div class="col-md-6">
              <div class="text-detail">
                <div class="row">
                  <div class="col-md-4">
                    <img src="Image/manhinhcua1CT/heart.png" alt="" />
                    <a href="recipe-like?id=<%=recipe.getId()%>">Like</a>
                    <span><%=recipe.getLuotThich() %></span>
                  </div>

                  <div class="col-md-3">
                    <img src="Image/manhinhcua1CT/save.png" alt="" />
                    <a> Save </a>
                  </div>

                  <div class="col-md-5">
                    <img src="Image/manhinhcua1CT/time.png" alt="" />
                    <a> Thời gian: </a>
                    <span><%=recipe.getTgThucHien() %></span>
                    <a> phút </a>
                  </div>
                </div>
              </div>
              <div class="recipes-name">
                <span> <%=recipe.getTen() %> </span>
              </div>

              <div class="recipes-tag">
                <span> #bun </span>
                <span> #monnuoc </span>
                <span> #oc </span>
                <span> #ansang </span>
                <span> #HaNoi </span>
              </div>
	
              <div class="profile">
                <img src="<%=recipe.getAvatarUser() %>" alt="" />
                <div class="content_profile">
                  <p class="name"><%=recipe.getNameUser() %></p>
                  <p><%=recipe.getTgDang() %></p>
                </div>
              </div>

              <div class="recipes-mota">
                <span> <%=recipe.getMoTa() %> </span>
              </div>
            </div>
          </div>

          <div class="content2">
            <div class="recipes-nguyenlieu">
              <div class="nguyenlieu-title">
                <label> Nguyên liệu </label>
                <a> Export </a>
              </div>
              <div class="nguyenlieu-content">
                <span> <%=recipe.getNguyenLieu() %> </span>
              </div>
            </div>
          </div>

          <div class="content2">
            <div class="recipes-cacbuoc">
              <div class="cacbuoc-title">
                <label> Các bước </label>
                <a> Export </a>
              </div>
              <div class="buoc">
              <%List<Step> listStep =(List<Step>) request.getAttribute("listStep"); %>
              <%for(Step step:listStep){ %>
              	<div class="sttbuoc">
                  <label> <%="Bước" + step.getBuoc() %> </label>
                </div>
                <div class="content-buoc">
                  <span>
                   <%=step.getDes() %>
                  </span>
                  <div class="hinhanh-buoc">
                    <img src="<%=step.getHinhanh() %>" alt="" />
                  </div>
                </div>
              <%} %>
    
              </div>
            </div>
          </div>
          <div class="nhanxet">
            <label>
              Bạn đã làm theo món này rồi phải không? hãy để lại bình luận để
              cho mọi người biết nhé !!!
            </label>
          </div>
          <div class="comment">
            <div class="comment-title">
              <img src="Image/manhinhcua1CT/comment.png" alt="" />
              <label>Bình luận</label>
            </div>
			<form action="recipe-comment" id="" method="get">
            <input
              type="text"
              name="comment"
              class="form-control"
              placeholder="Nhập bình luận"
            />
            </form>
			<%List<Comment> listComment= (List<Comment>) request.getAttribute("listComment");%>
			<%for(Comment c:listComment){ %>
				<div class="profile">
              		<img src="<%=c.getAvatar() %>" alt="" />
	              	<div class="content_profile">
	                	<p class="name"><%=c.getFullname() %></p>
	                	<p><%= c.getContent() %></p>
	              	</div>
            	</div>
			<%} %>
             
          </div>
        
      </div>
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
    <!-- menu section ends -->
  </body>
</html>
