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
      <div class="content">
        <form action="" id="">
          <div class="row">
            <div class="col-md-6">
              <div class="recipes-image">
                <img src="Image/manhinhcua1CT/bunocsuonHN.png" alt="" />
              </div>
            </div>

            <div class="col-md-6">
              <div class="text-detail">
                <div class="row">
                  <div class="col-md-4">
                    <img src="Image/manhinhcua1CT/heart.png" alt="" />
                    <a> Like </a>
                    <span>5710</span>
                  </div>

                  <div class="col-md-3">
                    <img src="Image/manhinhcua1CT/save.png" alt="" />
                    <a> Save </a>
                  </div>

                  <div class="col-md-5">
                    <img src="Image/manhinhcua1CT/time.png" alt="" />
                    <a> Thời gian: </a>
                    <span>600</span>
                    <a> phút </a>
                  </div>
                </div>
              </div>
              <div class="recipes-name">
                <span> Bún ốc sườn Hà Nội </span>
              </div>

              <div class="recipes-tag">
                <span> #bun </span>
                <span> #monnuoc </span>
                <span> #oc </span>
                <span> #ansang </span>
                <span> #HaNoi </span>
              </div>

              <div class="profile">
                <img src="Image/user/DucDam.png" alt="" />
                <div class="content_profile">
                  <p class="name">Đàm Hồng Đức</p>
                  <p>12/12/2021</p>
                </div>
              </div>

              <div class="recipes-mota">
                <span>
                  Mùa đông lành lạnh tranh thủ dậy sớm làm món bún ốc sườn Hà
                  Nội cho cả nhà. Có phải bạn đã từng thưởng thức món bún ốc
                  sườn non, bạn nhớ và thích hương vị của nó. Vậy hôm nay, hãy
                  cùng mình ghi nhớ công thức để thực hiện lại món nước hấp dẫn
                  này nhé. Nhanh vào bếp ngay thôi!
                </span>
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
                <span> + Bún tươi </span>
              </div>
              <div class="nguyenlieu-content">
                <span> + Nước luộc ốc </span>
              </div>
              <div class="nguyenlieu-content">
                <span> + Ốc vặn </span>
              </div>
              <div class="nguyenlieu-content">
                <span> + Cà chua </span>
              </div>
              <div class="nguyenlieu-content">
                <span>
                  + Tiêu, bột nghệ, nước mắm, bột canh, mỳ chính, đường, dấm
                  bỗng
                </span>
              </div>
              <div class="nguyenlieu-content">
                <span> + ống Xương sườn, xương </span>
              </div>
              <div class="nguyenlieu-content">
                <span> + Rau thơm tía tô, đậu phụ </span>
              </div>
              <div class="nguyenlieu-content">
                <span> + Tỏi, hành khô </span>
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
                <div class="sttbuoc">
                  <label> Bước 1: </label>
                </div>
                <div class="content-buoc">
                  <span>
                    Em mua loại ốc đã làm rồi, đặt thêm nước ốc(cần có nước ốc
                    nhé ạ) ốc đổ ra bát rồi cho 1,5 thìa nước mắm, ít tiêu 0,5
                    thìa bột nghệ trộn đều ướp 30p
                  </span>
                  <div class="hinhanh-buoc">
                    <img src="Image/manhinhcua1CT/buoc1.png" alt="" />
                  </div>
                </div>

                <div class="sttbuoc">
                  <label> Bước 2: </label>
                </div>
                <div class="content-buoc">
                  <span>
                    Em mua loại ốc đã làm rồi, đặt thêm nước ốc(cần có nước ốc
                    nhé ạ) ốc đổ ra bát rồi cho 1,5 thìa nước mắm, ít tiêu 0,5
                    thìa bột nghệ trộn đều ướp 30p
                  </span>
                  <div class="hinhanh-buoc">
                    <img src="Image/manhinhcua1CT/buoc1.png" alt="" />
                  </div>
                </div>

                <div class="sttbuoc">
                  <label> Bước 3: </label>
                </div>
                <div class="content-buoc">
                  <span>
                    Em mua loại ốc đã làm rồi, đặt thêm nước ốc(cần có nước ốc
                    nhé ạ) ốc đổ ra bát rồi cho 1,5 thìa nước mắm, ít tiêu 0,5
                    thìa bột nghệ trộn đều ướp 30p
                  </span>
                  <div class="hinhanh-buoc">
                    <img src="Image/manhinhcua1CT/buoc1.png" alt="" />
                  </div>
                </div>

                <div class="sttbuoc">
                  <label> Bước 4: </label>
                </div>
                <div class="content-buoc">
                  <span>
                    Em mua loại ốc đã làm rồi, đặt thêm nước ốc(cần có nước ốc
                    nhé ạ) ốc đổ ra bát rồi cho 1,5 thìa nước mắm, ít tiêu 0,5
                    thìa bột nghệ trộn đều ướp 30p
                  </span>
                  <div class="hinhanh-buoc">
                    <img src="Image/manhinhcua1CT/buoc1.png" alt="" />
                  </div>
                </div>
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

            <input
              type="text"
              name=""
              class="form-control"
              placeholder="Nhập bình luận"
            />

            <div class="profile">
              <img src="Image/user/DucDam.png" alt="" />
              <div class="content_profile">
                <p class="name">Đàm Hồng Đức</p>
                <p>Quá tuyệt vời !!!</p>
              </div>
            </div>

            <div class="profile">
              <img src="Image/user/DucDam.png" alt="" />
              <div class="content_profile">
                <p class="name">Đàm Hồng Đức</p>
                <p>Ngon thật sự !!!</p>
              </div>
            </div>

            <div class="profile">
              <img src="Image/user/DucDam.png" alt="" />
              <div class="content_profile">
                <p class="name">Đàm Hồng Đức</p>
                <p>Sao anh có thể làm ngon như vậy ạ !!!</p>
              </div>
            </div>
          </div>
        </form>
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
