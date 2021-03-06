// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/icon/iconfont.css'
import Animate from 'animate.css'
import Axios from 'axios'
import store from './'
// import VueResource from 'vue-resource'

// Vue.prototype = Axios
import Bus from '../src/assets/js/eventBus.js'
Vue.prototype.$bus = Bus
Vue.use(ElementUI)
Vue.use(Animate)
Vue.prototype.$axios = Axios

Vue.config.productionTip = false
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
