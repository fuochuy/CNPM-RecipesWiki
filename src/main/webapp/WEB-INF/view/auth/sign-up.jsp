<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	 <meta charset="UTF-8" />
    <meta name="viewport" />
    <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="./css/signup.css" />
    <title>Đăng ký tài khoản</title>
</head>
<body>
	<div class="center">
		<c:if test="${not empty message}">
				<div class="alert alert-dismissible bg-${alert } text-white border-0 fade show">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					${message}
				</div>
		</c:if>
        <form method="post" action="sign-up">
          <div class="txt_field">
            <input type="text" required name="username">
            <span></span>
            <label>Email</label>
          </div>
          <div class="txt_field">
            <input type="password" required name="password1">
            <span></span>
            <label>Mật khẩu</label>
          </div>
          <div class="txt_field">
            <input type="password" required name="password2">
            <span></span>
            <label>Nhập lại mật khẩu</label>
          </div>
          <div class="check_terms">
              <p><span><input type="checkbox" required></span> Tôi đồng ý với <u class="terms">điều khoản dịch vụ.</u> </p>
          </div>
          <button class="btn_Submit" type="submit"><img src="./Image/signup/sign-in.png" alt=""></button>
        </form>
      </div>
</body>
</html>