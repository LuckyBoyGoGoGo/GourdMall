<template>
  <el-container id="user-info-wrap">
    <el-header height="80">
      <!-- Header content -->
      专属客服
    </el-header>
    <el-main :height="140">
      <!-- Main content -->

    </el-main>

  </el-container>
</template>

<script>
export default {
  name: 'UserAssistant',
  components: {},
  data () {
    return {
    }
  },
  computed: {},
  watch: {},
  methods: {
  },
  created () {
  },
  mounted () {
  }
}
</script>
<style scoped>

#user-info-wrap {
  background: white;
  background: #f4f4f4;
}

#user-info-wrap .el-header {
  background: #f0f0f0;
  height: 70px;
  line-height: 70px;
  font-size: 19px;
  padding-left: 40px
}

#user-info-wrap .el-main {
  background: #ffffff
}
</style>
