<template>
  <el-container :style="wrapStyle" class="admin-login-wrap">
    <el-main  height="">
      <!-- Main content -->
      <el-row>
        <el-col :span="12" :offset="6">
          <el-card shadow="always">
            <el-select v-model="value" placeholder="请选择">
    <el-option
      v-for="item in options"
      :key="item.value"
      :label="item.label"
      :value="item.value">
    </el-option>
  </el-select>
          </el-card>
        </el-col>
      </el-row>

    </el-main>
  </el-container>
</template>

<script>
import WrapBg from '../../common/images/adminLoginBg.png'

export default {
  name: 'AdminLogin',
  components: {},
  data () {
    return {
      wrapStyle: {
        backgroundImage: 'url(' + WrapBg + ')',
        backgroundSize: 'cover',
        backgroundRepeat: 'no-repeat',
        backgroundPosition: 'center'
      }
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
.admin-login-wrap {
  /* background: #333333; */
  height: 933px;
}
.admin-login-wrap .el-main .el-row .el-col{
  background: white
}
</style>
