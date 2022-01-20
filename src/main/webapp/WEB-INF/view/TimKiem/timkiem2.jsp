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

    <div>
      <div class="row">
        <div class="col-md-2">
          <div class="container-checkbox">
            <!-- checkbox tên chủ đề -->
            <div class="checkbox1">
              <!-- checkbox tên thể loại -->
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Món luộc</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Bún</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Bún</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Phở</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Cơm</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Món xào</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Thịt chiên</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Thịt ram</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Món hấp</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Thịt kho</label><br />
            </div>
            <div class="checkbox1">
              <input type="radio" id="vehicle3" name="vehicle3" value="" />
              <label for="vehicle3"> Thịt nướng</label><br />
            </div>
          </div>
        </div>
        <div class="col-md-9">
          <div class="row">
            <div class="col-md-4">
              <div class="menu" id="menu">
                <div class="box-container">
                  <div class="box">
                    <div class="image">
                      <img src="Image/menu/menu-1.jpg" alt="" />
                    </div>
                    <div class="content">
                      <h3>Ốc hương rang muối</h3>
                      <p>
                        Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn
                        cho cả nhà
                      </p>
                    </div>
                    <div class="profile">
                      <img src="Image/user/DucDam.png" alt="" />
                      <div class="content_profile">
                        <p class="name">Lê Thái Bình Minh</p>
                        <p>12/12/2021</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="menu" id="menu">
                <div class="box-container">
                  <div class="box">
                    <div class="image">
                      <img src="Image/menu/menu-1.jpg" alt="" />
                    </div>
                    <div class="content">
                      <h3>Ốc hương rang muối</h3>
                      <p>
                        Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn
                        cho cả nhà
                      </p>
                    </div>
                    <div class="profile">
                      <img src="Image/user/DucDam.png" alt="" />
                      <div class="content_profile">
                        <p class="name">Lê Thái Bình Minh</p>
                        <p>12/12/2021</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="menu" id="menu">
                <div class="box-container">
                  <div class="box">
                    <div class="image">
                      <img src="Image/menu/menu-1.jpg" alt="" />
                    </div>
                    <div class="content">
                      <h3>Ốc hương rang muối</h3>
                      <p>
                        Mùa đông lạnh lạnh tranh thủ dậy sớm làm món bún ốc sườn
                        cho cả nhà
                      </p>
                    </div>
                    <div class="profile">
                      <img src="Image/user/DucDam.png" alt="" />
                      <div class="content_profile">
                        <p class="name">Lê Thái Bình Minh</p>
                        <p>12/12/2021</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-1"></div>
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
