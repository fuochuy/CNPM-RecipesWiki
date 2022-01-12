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
    <link rel="stylesheet" href="css/tao_event.css" />

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
      <div class="head_upload">
        <img src="Image/tao_event/event.png" alt="" />
        <h3>
          Hãy tạo ra một sự kiện tuyệt vời để mọi người cùng tham gia nhé!
        </h3>
      </div>
      <div class="content_upload">
        <form method="post" action="tao_event" enctype="multipart/form-data">
          <label class="form-title" for="tensk">Tên sự kiện</label>
          <input
            type="text"
            name="tensk"
            class="form-control"
            placeholder="Nhập tên sự kiện"
          />

          <label class="form-title" for="tgbatdau">Ngày và giờ bắt đầu</label>
          <input
            type="datetime-local"
            class="form-date"
            name="ngayvagiobatdau"
          />

          <label class="form-title" for="tgketthuc">Ngày và giờ kết thúc</label>
          <input
            type="datetime-local"
            class="form-date"
            name="ngayvagioketthuc"
          />

          <label class="form-title" for="giaithuong">Giải thưởng</label>
          <input
            type="text"
            name="giaithuong"
            class="form-control"
            placeholder="Nhập giải thưởng"
          />

          <label class="form-title" for="mota">Mô tả</label>
          <textarea
            name=""
            id=""
            placeholder="Hãy mô tả cho sự kiện này"
            class="form-control-textarea"
          ></textarea>

          <p>Ảnh minh họa</p>
          <input
            type="file"
            name="hinhanh"
            id="file-ip-0"
            accept="image/*"
            onchange="showPreview(event);"
          />
          <div class="preview">
            <img id="file-ip-0-preview" />
          </div>
          <div class="preview">
            <img id="file-ip-0-preview" />
          </div>

          <button>
            Tạo sự kiện
            <i class="zmdi zmdi-long-arrow-right"></i>
          </button>
        </form>
      </div>
    </div>
    <script type="text/javascript">
      var pic = 0;
      function showPreview(event) {
        if (event.target.files.length > 0) {
          var src = URL.createObjectURL(event.target.files[0]);
          var preview = document.getElementById("file-ip-" + pic + "-preview");
          preview.src = src;
          preview.style.width = "400px";
          preview.style.height = "auto";
          preview.style.display = "block";
          pic++;
        }
      }
    </script>
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
