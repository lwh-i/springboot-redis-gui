<template>
  <div>
    <li-form ref="liForm" :model="formData" :rules="rules" size="medium" label-width="100px">
      <header>
        <li-row type="flex" class="header">
          <li-fe-col :span="12" class="main-container">
            <a to="/" class="logo">
              <img
                src="data:image/png;base64,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" />
              <span>redis后台管理</span>
            </a>
            <nav>
              <a href="/">首页</a>
              <a href="/ide/" class="hiddenInSmallScreen">shell</a>
              <a href="/materials/">帮助</a>
              <a href="/component/">退出</a>
            </nav>
          </li-fe-col>
        </li-row>
      </header>
          
<!-- 下拉框 -->
<li-radio-group v-model="isCollapse" style="margin-bottom: 20px;">
  <li-radio-button :label="false">展开</li-radio-button>
  <li-radio-button :label="true">收起</li-radio-button>
</li-radio-group>
<li-menu class="li-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="isCollapse">
  <li-submenu index="1">
    <template slot="title">
      <i class="li-icon-setting"></i>
      <span slot="title">redis常规操作</span>
    </template>
    <li-submenu index="1-1">
        <template slot="title">ttl</template>
      <li-menu-item index="1-1-1">选项1</li-menu-item>
      <li-menu-item index="1-1-2">选项2</li-menu-item>
    </li-submenu>
    <li-submenu index="1-2">
        <template slot="title">del</template>
      <li-menu-item index="1-2-1">选项1</li-menu-item>
    </li-submenu>
  </li-submenu>

  <li-submenu index="2">
    <template slot="title">
      <i class="li-icon-setting"></i>
      <span slot="title">redis类型操作</span>
    </template>
    <li-submenu index="2-1">
        <template slot="title">string</template>
      <li-menu-item index="2-1-1">set</li-menu-item>
      <li-menu-item index="2-1-2">get</li-menu-item>
    </li-submenu>
    <li-submenu index="2-2">
        <template slot="title">hash</template>
      <li-menu-item index="2-2-1">get</li-menu-item>
      <li-menu-item index="2-2-2">set</li-menu-item>
    </li-submenu>
  </li-submenu>

<!-- key  value框 -->
<div class="key_value">
    <li-input
  type="textarea"
  autosize
  placeholder="请输入key"
  v-model="formData.key">
</li-input>
<div style="margin: 20px 0;"></div>
<li-input
  type="textarea"
  :autosize="{ minRows: 2, maxRows: 10}"
  placeholder="请输入value"
  v-model="formData.value">
</li-input>

<li-button  @click="submitForm()" type="primary" size="large">提交</li-button>
</div>



</li-menu>





    </li-form>
  </div>
</template>
<script>
import axios from "axios"
export default {
  components: {},
  props: [],
  data() {
    return {
      isCollapse: false,
      renderData: {},
      formData:{
      type:"string",
      operation:"get",
      key: '',
      value: '',
      },
  
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    submitForm() {
        alert(this.formData.type)
        var url="http://localhost:8090/redis/choose"
        var vm=this
        axios.post(url,this.formData).then(function(response){
          alert("111")
          console.log(response.data)
          
        })
    },
    resetForm() {
      this.$refs['liForm'].resetFields()
    },
    con() {
      console.log(this.header.aaa)
    },


        handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }

    
  }
}

</script>
<style>
header {
  position: relative;
  top: 0;
  left: 0;
  width: 100%;
  z-index: 999999;
  color: #000;
}

.header {
  box-shadow: 0 1px 12dpx rgba(0, 0, 0, 0.08);
}

.header .main-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  padding: 30px;
}

.header .main-container a {
  text-decoration: none;
  color: #000;
}

@media only screen and (max-width:719px) {
  .header .main-container .logo {
    width: 55px;
    overflow: hidden;
  }
}

.header .main-container .logo img {
  width: 50px;
}

.header .main-container .logo span {
  margin-left: 10px;
}

@media only screen and (max-width:719px) {
  .header .main-container .logo span {
    display: none;
  }
}

.header .main-container nav {
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
  align-items: center;
}

.header .main-container nav a {
  margin: 5px 30px 5px 0;
  font-size: 14px;
}

@media only screen and (max-width:719px) {
  .header .main-container nav .hiddenInSmallScreen {
    display: none;
  }
}
  .li-menu-vertical-demo:not(.li-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }


.key_value{
    position: absolute;
    top: 0;
    left: 100%;
    width: 100%;

}
</style>
