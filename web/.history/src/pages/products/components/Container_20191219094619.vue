<template>
<el-row>
          <el-col :span="14" offset="5">
    <el-container>
      <el-header height="">
        <!-- Header content -->
        操作栏
      </el-header>
      <el-main height="">
        <!-- Main content -->

            <el-container>
              <el-header height="">
                <!-- Header content -->
                顶部
              </el-header>
              <el-main height="">
                <!-- Main content -->
                底部
              </el-main>
            </el-container>

      </el-main>
    </el-container>
    </el-col>
        </el-row>
</template>

<script>
export default {
  name: 'ProductsWrap',
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
</style>
