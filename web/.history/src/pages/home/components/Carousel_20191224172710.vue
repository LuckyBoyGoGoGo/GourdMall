<template>
  <el-row :gutter="5">
    <el-col :span="5">
      <el-card :body-style="{ padding: '0px', height: '400px' }">
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">手机</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">安卓手机</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">苹果手机</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">电脑</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">笔记本</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">平板</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">配件</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">家居</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">家具</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">家装</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">厨具</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">男装</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">女装</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">童装</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">内衣</el-breadcrumb-item>
        </el-breadcrumb><el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">美妆</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">个护清洁</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">宠物</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">香水</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">女鞋</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">箱包</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">钟表</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">珠宝</el-breadcrumb-item>
        </el-breadcrumb><el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">男装</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">户外</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">运动</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">球鞋</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">房产</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">汽车</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">汽车用品</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">轮胎</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">母婴</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">玩具</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">乐器</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">Steam</el-breadcrumb-item>
        </el-breadcrumb><el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">艺术</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">礼品鲜花</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">绿植</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">花盆</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">图书</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">文娱</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">教育</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">电子书</el-breadcrumb-item>
        </el-breadcrumb><el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
        </el-breadcrumb>
        <el-breadcrumb style="height: 25px; line-height: 25px" separator="/">
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
          <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
        </el-breadcrumb>

      </el-card>

    </el-col>
    <el-col :span="15">
      <div class="block">
        <el-carousel height="400px">
          <el-carousel-item v-for="item in urls" :key="item">
              <div>
                <img :src="item" height="400px" width="100%" alt="">
              </div>
          </el-carousel-item>
        </el-carousel>
      </div>
    </el-col>
    <el-col :span="4">
      <el-carousel  height="400px" direction="vertical" :autoplay="true">
        <el-carousel-item v-for="(item, index) in showVerImg.slice(0, -2)" :key="index">
          <div>
            <img :src="item" indicator-position="none" height="200px" width="100%" alt="">
          </div>
          <div>

            <img :src="showVerImg[index+1]" indicator-position="none" height="200px" width="100%" alt="">
          </div>
        </el-carousel-item>
      </el-carousel>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'Carousel',
  components: {},
  data () {
    return {
      urls: [
        'https://resource.smartisan.com/resource/1/1220858shoujilouceng.jpg',
        'https://resource.smartisan.com/resource/z/zhoubianshangpin1220858web.jpg',
        'https://resource.smartisan.com/resource/a/acillouceng1220856.jpg'
      ],
      showVerImg: [
        'https://resource.smartisan.com/resource/a1c53b5f12dd7ef790cadec0eaeaf466.jpg',
        'https://resource.smartisan.com/resource/2b05dbca9f5a4d0c1270123f42fb834c.jpg',
        'https://resource.smartisan.com/resource/804edf579887b3e1fae4e20a379be5b5.png',
        'https://resource.smartisan.com/resource/10525c4b21f039fc8ccb42cd1586f5cd.jpg',
        'https://resource.smartisan.com/resource/5e4b1feddb13639550849f12f6b2e202.jpg'
      ]
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
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 450px;
  margin: 0 auto;
  text-align: center
}
.el-carousel {
  border-radius: 5px;
}
.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}
.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}
</style>
