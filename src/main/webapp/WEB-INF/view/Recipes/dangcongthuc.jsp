<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="cnpm.recipe.model.Chude"%>
<%@page import="cnpm.recipe.model.TheLoai"%>
<%@page import="cnpm.recipe.model.Event"%>
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
    
    <link
      rel="stylesheet"
      href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css"
    />
    <!-- font awesome cdn link  -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
    />
    <link rel="stylesheet" href="css/dangcongthuc.css" />
    <title>RecipesWiki</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
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
              <li><a href="search?id=1"  >Ăn sáng</a></li>
              <li><a href="search?id=3" >Ăn trưa</a></li>
              <li><a href="search?id=2"  >Ăn tối</a></li>
              <li><a href="search?id=4"  >Dã ngoại</a></li>
              <li><a href="search?id=5"  >Giáng sinh</a></li>
              <li><a href="search?id=6"  >Halloween</a></li>
              <li><a href="search?id=7" >Lễ tình nhân</a></li>
              <li><a href="search?id=8"  >Món chay</a></li>
              <li><a href="search?id=9"  >Ngày tết</a></li>
              <li><a href="search?id=10"  >Sinh nhật</a></li>
              <li><a href="chude"  >Tất cả chủ đề</a></li>
            </ul>
          </li>
          <li>
            <a href="./aboutus.html" class="menu-item">About us</a>
          </li>
          <li class="btn_account active">
            <a href="./account.html" class="menu-item"
              ><img src="./Image/icon/account.png"
            /></a>
          </li>
        </ul>
      </nav>
    </header>

    <div class="container">
      <div class="head_upload">
        <img src="Image/icon/upload.jpg" alt="" />
        <h3>Bạn đã đăng hình công thức nấu ăn nào chưa?</h3>
        <p class="heade-p">Chia sẽ món ăn của bạn đến mọi người nào?</p>
      </div>
      <div class="content_upload">
        <form action="create-recipe" id="dangcongthuc" method="post" enctype="multipart/form-data">
          <p>Tên món ăn</p>
          <input
            type="text"
            name="tenmon"
            class="form-control"
            placeholder="Tên món ăn"
          />

          <p>Chủ đề</p>
          <div class="form-holder">
            <select name="chude" id="form-control" class="form-control">
              <option value="" disabled selected>Nhập lựa chọn của bạn</option>
            <%List<Chude> listChuDe =(List<Chude>) request.getAttribute("listChuDe"); %>
     		<%for(Chude chude:listChuDe){ %>
				<option value="<%=chude.getId() %>"><%=chude.getTen() %></option>
             <%}%>
             
            </select>
            <i class="zmdi zmdi-chevron-down"></i>
          </div>

          <p>Thể loại</p>
          <div class="form-holder">
            <select name="theloai" id="" class="form-control">
              <option value="" disabled selected>Nhập lựa chọn của bạn</option>
             <%List<TheLoai> listTheLoai =(List<TheLoai>) request.getAttribute("listTheLoai"); %>
     		<%for(TheLoai theloai:listTheLoai){ %>
				<option value="<%=theloai.getId() %>"><%=theloai.getTentheloai() %></option>
             <%}%>
            </select>
            <i class="zmdi zmdi-chevron-down"></i>
          </div>

          

          <p>Ảnh minh họa</p>
          <input
            type="file"
            name="hinhanhmh"
            id="file-ip-0"
         
            onchange="showPreview(event);"
          />
          <div class="preview">
            <img id="file-ip-0-preview" />
          </div>

          <p>Mô tả</p>
          <textarea
            name="mota"
            id=""
            placeholder="Hãy nhập mô tả cho món ăn"
            class="form-control-textarea"
          ></textarea>

          <p>Nguyên liệu</p>
          <textarea
            name="nguyenlieu"
            id=""
            placeholder="Hãy nhập các nguyên liệu của món ăn"
            class="form-control-textarea"
          ></textarea>
			
		<p>Thời gian thực hiện</p>
          <input type="text" name="thoigian" placeholder="Thời gian thực hiện" class="form-control">
          <p>Các bước thực hiện</p>

          <div class="step">
            <div id="step-child" class="step-child">
              <p>Bước 1</p>
              <textarea
                name="buoc1"
                id="step"
                placeholder="Hãy nhập các bước thực hiện"
                class="form-control-textarea-buoc"
              ></textarea>

              <input
                type="file"
                name="hinhanh1"
                id="file-ip-1"
                accept="image/*"
                onchange="showPreview(event);"
              />
              <img id="file-ip-1-preview" class="preview" />
            </div>
          </div>

          <button type="button" onclick="add_step()">Thêm bước</button>
          <button type="submit">Đăng công thức</button>
        </form>
      </div>
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
    <script src="js/slider.js"></script>
    <script src="js/showpicture.js"></script>
    <script src="js/addstep.js"></script>
  </body>
</html>
    