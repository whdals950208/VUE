<template>
  <div>
    <b-table striped hover :items="items" ></b-table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      items: []
    }
  },
  mounted() {
    this.$axios.get("/api/board/list")
    .then(res =>{
      this.items = res.data;
    })
  },
}
</script>

<style scoped>

</style>