<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="css/bst0kq.css" />
   
    <!--link bootstrap-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <title>Bộ sưu tập của tôi</title>
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
                <li class=""><a href="./trang_chu.html" class="menu-item">Trang chủ</a></li>
                <li class=""><a href="./search1.html" class="menu-item">Tìm kiếm</a></li>
                <li class="active" ><a href="./trang_chu.html" class="menu-item"><span >RecipesWiki</span></a></li>
                <li class="has-submenu">
                    <a href="" class="menu-item">Chủ đề</a>
                    <ul class="submenu">
                      <li><a href="#"  >Ăn sáng</a></li>
                      <li><a href="#" >Ăn trưa</a></li>
                      <li><a href="#"  >Ăn sáng</a></li>
                      
                    </ul>
                </li>
                <li class=""><a href="./aboutus.html" class="menu-item">About us</a></li>
                <li class="btn_account"> <a href="./account.html" class="menu-item"><img src="./Image/icon/account.png" /></a></li>
            </ul>  
        </nav>

    </header>
   
    <div class="container">
        <div class="row">
            <div class="Mycook">
                <span>Bộ sưu tập của tôi</span>
            </div>
        </div>
    </div>

    <div class="notfound">
        <img src="./Image/sad.png" alt="">
        <h3>Bạn chưa thêm công thức nào vào bộ sưu tập.</h3>
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

    <script src="//code.jquery.com/jquery.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>
