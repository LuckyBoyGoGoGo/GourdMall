// vuex
import Vue from 'vue'
import Vuex from 'vuex'
import {getCategories} from '../../axios/api'

Vue.use(Vuex)

// 创建vuex的store

const state = {
  count: 0,
  code: 0,
  message: '',
  getCategories: []
}
// 更改store的状态
const mutations = {
  getCategorie () {
    alert('进入action')
    getCategories().then(
      (result) => {
        console.log(result)
      }
    )
  }
}
// 有异步的时候， 需要action
const actions = {
  getCategorie () {
    alert('进入action')
    getCategories().then(
      (result) => {
        console.log(result)
      }
    )
  }
}
// 通过getter 进行数据获取
const getters = {
  getState (state) {
    return state.count > 0 ? state.count : 0
  },
  getCategorie (state) {
    getCategories().then(
      (result) => {
        console.log(result)
        state.getCategories = result.data
      }
    )
    return state.getCategories
  }
}

export default {
  state,
  actions,
  getters,
  mutations
}
