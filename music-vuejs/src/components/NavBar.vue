<template>
  <div>
    <b-navbar toggleable="lg" type="dark" variant="info">
      <b-navbar-brand href="#"><b-icon icon="music-note-beamed" aria-hidden="true"></b-icon></b-navbar-brand>


      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item-dropdown text="MUSIC">
            <b-dropdown-item><router-link to="/musicChart">음악 차트</router-link></b-dropdown-item>
            <b-dropdown-item><router-link to="/music">음악 감상</router-link></b-dropdown-item>
            <b-dropdown-item><router-link to="/myMusic">나만의 음악</router-link></b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>

        <b-navbar-nav>
          <b-nav-item-dropdown text="CALENDAL">
            <b-dropdown-item href="#">달력</b-dropdown-item>
            <b-dropdown-item href="#">일정 관리</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>

        <b-navbar-nav>
          <b-nav-item-dropdown text="LUCKY">
            <b-dropdown-item href="#">LOTTO</b-dropdown-item>
            <b-dropdown-item href="#">운세</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>

        <b-navbar-nav>
          <b-nav-item-dropdown text="정보 공유">
            <b-dropdown-item><router-link to="/board">노래 신청</router-link></b-dropdown-item>
            <b-dropdown-item><router-link to="/notice">공지 사항</router-link></b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item-dropdown text="언어" right>
            <b-dropdown-item href="#">한국어</b-dropdown-item>
            <b-dropdown-item href="#">영어</b-dropdown-item>
            <b-dropdown-item href="#">일본어</b-dropdown-item>
          </b-nav-item-dropdown>

          <b-nav-item-dropdown right>
            <!-- Using 'button-content' slot -->
            <template #button-content>
              <em><b-icon icon="gear" aria-hidden="true"></b-icon></em>
            </template>
            <b-dropdown-item href="#">내 정보</b-dropdown-item>
            <b-dropdown-item href="#">로그인</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>
export default {
  name: 'NavBar',
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
