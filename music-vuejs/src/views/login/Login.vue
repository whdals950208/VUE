<template>
  <div class="container login-container">
    <div class="row">
      <div class="col-md-6 login-form-1">
        <h3>!로그인!</h3>

        <div class="form-group">
          <input type="text" class="form-control" placeholder="Your Email *" value=""/>
        </div>
        <div class="form-group">
          <input type="password" class="form-control" placeholder="Your Password *" value=""/>
        </div>
        <div class="form-group">
          <input type="submit" class="btnSubmit" value="Login"/>
        </div>
        <div class="form-group">
          <a href="#" class="btnForgetPwd">비밀번호 찾기</a>
        </div>

      </div>
      <div class="col-md-6 login-form-2">
        <h3>다른 API에서 로그인 하기</h3>
        <div class="form-group">
          <div id="naver_id_login"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  mounted() {
    const naver_id_login = new window.naver_id_login("6SBghd7kTnGpeYgIxSd2", "http://localhost:8080/api/callback");
    const state = naver_id_login.getUniqState();
    naver_id_login.setButton("white", 10, 40); // 버튼 설정
    naver_id_login.setDomain("http://localhost:8080/");
    naver_id_login.setState(state);
    naver_id_login.setPopup(); // popup 설정을 위한 코드
    naver_id_login.init_naver_id_login();
  }
}
</script>

<style scoped>
.login-container {
  margin-top: 5%;
  margin-bottom: 5%;
}

.login-logo {
  position: relative;
  margin-left: -41.5%;
}

.login-logo img {
  position: absolute;
  width: 20%;
  margin-top: 19%;
  background: #282726;
  border-radius: 4.5rem;
  padding: 5%;
}

.login-form-1 {
  padding: 9%;
  background: #282726;
  box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
}

.login-form-1 h3 {
  text-align: center;
  margin-bottom: 12%;
  color: #fff;
}

.login-form-2 {
  padding: 9%;
  background: #f05837;
  box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
}

.login-form-2 h3 {
  text-align: center;
  margin-bottom: 12%;
  color: #fff;
}

.btnSubmit {
  font-weight: 600;
  width: 50%;
  color: #282726;
  background-color: #fff;
  border: none;
  border-radius: 1.5rem;
  padding: 2%;
}

.btnForgetPwd {
  color: #fff;
  font-weight: 600;
  text-decoration: none;
}

.btnForgetPwd:hover {
  text-decoration: none;
  color: #fff;
}
</style>