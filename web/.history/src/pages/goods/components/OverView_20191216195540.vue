<template>
  <el-row :gutter="20">
    <el-col :span="4" id="left">
      <el-row style="height: 80px;" class="mini-pic"   v-for="item in urls" :key="item">
        <el-col :class="[ item === 1 ? 'isActive' : '' ]" class="pic-wrap" >
            <el-avatar shape="square" :size="65" fit="cover" :src="item"></el-avatar>
        </el-col>
      </el-row>
    </el-col>
    <el-col :span="8" id="center">
      <el-row>
        <el-col :span="24" class="big-pic-wrap">
          <img class="big-pic" src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg" width="300px"  alt="">
        </el-col>
      </el-row>
    </el-col>
    <el-col :span="11" id="right" >
      <el-row class="info-wrap">
        <el-col :span="24">
          <div class="info-header">
            <h2>商品名称</h2>
            <span>简介</span>
          </div>
          <div class="info-middle">
            <!-- 数量 <el-input-number v-model="num"  size="mini" :min="1" :max="10" label="描述文字"></el-input-number> -->
            <div id="list-demo" class="demo">
              <button v-on:click="add">Add</button>
              <button v-on:click="remove">Remove</button>
              <transition-group name="list" tag="p">
                <span v-for="item in items"  v-bind:key="item" class="list-item">
                  {{ item }}
                </span>
              </transition-group>
            </div>
          </div>
          <div class="info-footer">
            <el-button type="primary" class="add-shop-cart">加入购物车</el-button>
            <el-button class="buy-now">现在购买</el-button>
          </div>
        </el-col>
      </el-row>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'OverView',
  components: {},
  data () {
    return {
      num: 1,
      urls: [
        'https://fuss10.elemecdn.com/a/3f/3302e58f9a181d2509f3dc0fa68b0jpeg.jpeg',
        'https://fuss10.elemecdn.com/1/34/19aa98b1fcb2781c4fba33d850549jpeg.jpeg',
        'https://fuss10.elemecdn.com/0/6f/e35ff375812e6b0020b6b4e8f9583jpeg.jpeg',
        'https://fuss10.elemecdn.com/9/bb/e27858e973f5d7d3904835f46abbdjpeg.jpeg',
        'https://fuss10.elemecdn.com/d/e6/c4d93a3805b3ce3f323f7974e6f78jpeg.jpeg'
      ],
      items: [1],
      nextNum: 2
    }
  },
  computed: {},
  watch: {},
  methods: {
    randomIndex: function () {
      return Math.floor(Math.random() * this.items.length)
    },
    add: function () {
      this.items.splice(0, 0, this.nextNum++)
      this.items.splice(1, 1)

      // this.nextNum++
    },
    remove: function () {
      // this.items.splice(0, 1)
      this.items.splice(0, 1, this.nextNum--)
    }
  },
  created () {
  },
  mounted () {
  }
}
</script>
<style scoped>
.el-row {
  background: white;
  height: 560px;
  border-radius: 10px;

}
.el-col {
  height: 100%;
  vertical-align: middle;
  text-align: center;
  /* border:1px azure solid; */
  /* background: red */
}

#left {
  /* background: red; */
  padding-top: 30px;
}
.mini-pic {
  border-radius: 5px;
  margin: 15px 40px;
  border: 1px #dbdbdb solid;
}

.block {
  /* background: red; */
  margin-top: 4px;
  height: 65px;
}

.el-avatar {
  /* border-radius: 5px; */
  border: 2px #f7f7f7 solid;
  /* margin-top: 6px; */
}

.pic-wrap {
  padding-top: 6px;
}

.isActive {
  /* margin-top: -2px; */
  border: 3px #dbdbdb solid;
  border-radius: 5px;
  padding-top: 4px;
}

.big-pic-wrap {
  /* background: red; */
  border-radius: 5px;
  padding-top: 145px;

}

.big-pic {
  border-radius: 5px;
}

.demo-image__lazy {
  overflow: auto;
  height: 300px;
  border-radius: 5px;
}

.info-wrap {
  margin-left: 40px;
  /* background: red */
}

.info-header{
  margin-top: 60px;
  height: 100px;
  /* background: red; */
  text-align: left;
  margin-right: 50px;
  border-bottom: 1px #dbdbdb solid;
  padding-left: 30px;
}

.info-middle {
  margin-top: 40px;
  height: 60px;
  padding-left: 30px;
  /* background: red; */
  color: #8d8d8d;
  text-align: left;
  margin-right: 50px;
  border-bottom: 1px #dbdbdb solid;
}

.info-footer {
  /* margin-top: 20px; */
  padding-top: 30px;
  margin-right: 50px;
  height: 80px;
  /* background: red */
}

.info-footer .el-button {
  height: 50px;
  width: 120px;
  text-align: center;
  margin: 0px 15px;
}
.list-item {
  display: inline-block;
  margin-right: 10px;
  background: red;
  position: absolute
}
.list-enter-active, .list-leave-active {
  transition: all 1s;
}
.list-enter, .list-leave-to
/* .list-leave-active for below version 2.1.8 */ {
  opacity: 0;
  transform: translateY(30px);
}

.add-shop-cart {
  background: #5c84e3;
}

.add-shop-cart:hover {
  background: #6080ce
}

.buy-now {
  background: #f2f2f2
}

.buy-now:hover {
  background: #ededed
}

.el-input-number {
  margin-left: 20px;
  width: 100px;
}
</style>
