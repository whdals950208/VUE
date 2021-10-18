import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import {
  BootstrapVue,
  IconsPlugin,
  BootstrapVueIcons
} from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

axios.defaults.headers.common['Access-Control-Allow-Origin'] = '*';
axios.defaults.headers.post['Content-Type'] = 'application/json';
axios.defaults.timeout = 100000;

//axios.defaults.baseURL = '{url}'
// 캐싱 방지
axios.defaults.headers.get['Cache-Control'] = 'no-cache';

axios.defaults.headers.get['Pragma'] = 'no-cache';

Vue.prototype.$axios = axios
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)
Vue.use(BootstrapVueIcons)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')