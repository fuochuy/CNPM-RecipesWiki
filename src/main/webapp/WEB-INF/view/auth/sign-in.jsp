<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Đăng nhập</title>
    <link rel="stylesheet" href="./css/signin.css" />
  </head>
  <body>
    <div class="center">
      <form method="post">
        <div class="txt_field">
          <input type="text" required name="username" />
          <span></span>
          <label>Email</label>
        </div>
        <div class="txt_field">
          <input type="password" required name="password" />
          <span></span>
          <label>Mật khẩu</label>
        </div>
        <div class="pass">Quên mật khẩu?</div>
        <div class="btn_fb">
          <img src="./Image/signin/fb.png" alt="fblogo" />
        </div>
        <div class="btn_gg">
          <img src="./Image/signin/gg.png" alt="gglogo" />
        </div>
        <div class="signup_link">
          <a href="sign-up">Chưa có tài khoản</a>
        </div>
        <button class="btn_Submit" type="submit">
          <img src="./Image/signin/sign-in.png" alt="" />
        </button>
      </form>
    </div>
  </body>
</html>
