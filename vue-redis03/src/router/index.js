import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import RedisMain from '../views/redis-main.vue'
Vue.use(Router)

export default new Router({
   mode:'history',
  routes: [
      
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
        {
      path: '/main',
      name: 'RedisMain',
      component: RedisMain
    }
  ]
})
