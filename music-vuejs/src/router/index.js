import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)
const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import(/* webpackChunkName: "about" */ '../views/Home.vue')
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/musicChart',
    name: 'MusicChart',
    component: () => import('../views/music/MusicChart.vue')
  },
  {
    path: '/music',
    name: 'Music',
    component: () => import('../views/music/Music.vue')
  },
  {
    path: '/myMusic',
    name: 'MyMusic',
    component: () => import('../views/music/MyMusic.vue')
  },
  {
    path: '/board',
    name: 'Board',
    component: () => import('../views/board/Board.vue')
  },
  {
    path: '/notice',
    name: 'Notice',
    component: () => import('../views/notice/Notice.vue')
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/login/Login.vue')
  },
  {
    path: '*',
    component: () => import ('@/views/NotFoundPage.vue'),
  },
  /*{
    path: '/callback',
    name: 'Callback',
    component: () => import('../views/callback/Callback.vue')
  }*/
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
