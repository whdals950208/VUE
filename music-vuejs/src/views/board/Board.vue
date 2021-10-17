  <template>
    <div>
      <b-table :items="items"
               :fields="fields"
               selectable
               @row-clicked="getBoardDetail"
      ></b-table>
    </div>
  </template>

<script>
export default {
  data() {
    return {
      fields: [
          {key :'idx' , label : "번호"}
        , {key :'id' ,  label : "아이디"}
        , {key :'name' , label : "이름"}
        , {key :'title' , label : "제목"}
        , {key :'content' , label : "내용"}
        , {key :'crtDt' , label : "생성 일자"}
        , {key :'hit' , label : "조회수"}
      ],
      items: []
    }
  },
  mounted() {
    this.$axios.get("/api/board/list")
    .then(res =>{
      this.items = res.data;
    })
  },
  methods : {
    getBoardDetail : () => {
      this.$axios.get("/api/board/detail")
      .then(res =>{
        this.items = res.data;
      })
    }
  }
}
</script>

<style scoped>

</style>