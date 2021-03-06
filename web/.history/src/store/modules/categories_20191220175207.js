// vuex
import Vue from 'vue'
import Vuex from 'vuex'
import * as types from '../mutation-types'
import {getCategories} from '../../axios/api'

Vue.use(Vuex)

// 创建vuex的store

const state = {
  cate: [
  ]
}

const mutations = {
  [types.SET_CATE] (state, cate) {
    state.cate = cate
  }
}

const getters = {
  getCate: (state) => {
    return state.cate
  }
}

const actions = {

}

export default {
  state,
  actions,
  getters,
  mutations
}
