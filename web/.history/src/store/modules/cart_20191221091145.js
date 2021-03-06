import Vue from 'vue'
import Vuex from 'vuex'
import * as types from '../mutation-types'
import * as api from './../../axios/api'
Vue.use(Vuex)

const state = {
  cart: null
}

export default {
  state,
  actions,
  getters,
  mutations
}
