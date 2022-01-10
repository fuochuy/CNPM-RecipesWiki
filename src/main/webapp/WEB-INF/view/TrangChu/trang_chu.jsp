<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <link rel="stylesheet" href="css\trang_chu.css" />
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

    <div class="container">
      <div class="slider">
        <div class="slides">
          <!--radio buttons start-->
          <input type="radio" name="radio-btn" id="radio1" />
          <input type="radio" name="radio-btn" id="radio2" />
          <input type="radio" name="radio-btn" id="radio3" />

          <!--radio buttons end-->
          <!--slide images start-->
          <div class="slide first">
            <img src="Image/slider/slide1.jpg" alt="" />
          </div>
          <div class="slide">
            <img src="Image/slider/slide2.jpg" />
          </div>
          <div class="slide">
            <img src="Image/slider/slide3.jpg" alt="" />
          </div>

          <!--slide images end-->
          <!--automatic navigation start-->
          <div class="navigation-auto">
            <div class="auto-btn1"></div>
            <div class="auto-btn2"></div>
            <div class="auto-btn3"></div>
          </div>
          <!--automatic navigation end-->
        </div>
        <!--manual navigation start-->
        <div class="navigation-manual">
          <label for="radio1" class="manual-btn"></label>
          <label for="radio2" class="manual-btn"></label>
          <label for="radio3" class="manual-btn"></label>
        </div>
        <!--manual navigation end-->
      </div>
      <!--image slider end-->
    </div>

    <div class="menu" id="menu">
      <h3>Các món ăn hot</h3>
      <div class="box-container">
        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-1.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>

        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-2.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>

        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-3.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>
      </div>

      <h3>Các món ăn được xem nhiều nhất</h3>
      <div class="box-container">
        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-4.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>

        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-5.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>

        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-6.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>
      </div>

      <h3>Món ăn dành chó bạn</h3>
      <div class="box-container">
        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-7.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>

        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-8.jpg" alt="" />
          </div>
          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>

        <div class="box">
          <div class="image">
            <img src="Image/menu/menu-9.jpg" alt="" />
          </div>

          <div class="content">
            <h3>Ốc hương rang muối</h3>
            <p>
              Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn cho cả
              nhà
            </p>
          </div>
          <div class="profile">
            <img src="Image/user/Profile.png" alt="" />
            <div class="content_profile">
              <p class="name">Nguyễn Phước Huy</p>
              <p>12/12/2021</p>
            </div>
          </div>
        </div>
      </div>

      <div class="xemthem">
        <a href="#" class="btn">Xem thêm</a>
      </div>
    </div>

    <!-- menu section ends -->

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
    <script>
      var counter = 1;
      setInterval(function () {
        document.getElementById("radio" + counter).checked = true;
        counter++;
        if (counter > 3) {
          counter = 1;
        }
      }, 5000);
    </script>
  </body>
</html>
