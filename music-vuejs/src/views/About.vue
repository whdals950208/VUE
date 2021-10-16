<template>
  <div class="about">
    <h1>This is an about page</h1>
    <ul>
      <li v-for="b in a">{{ b }} </li>
    </ul>
    <b-button @click="axiosTest">버튼</b-button>
    <p>e : {{err}}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      a : null,
      err : null
    }
  },
  methods : {
    axiosTest(){
      let paramData = new FormData();
      paramData.append("data1", "1111");
      paramData.append("data2", "2222");
      this.$axios.post('/api/example', paramData)
      .then(res => {
        this.a = res.data;
      })
      .catch(err => {
        this.err = err;
      })
    }
  }

}
</script>

