<template>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <router-link :to="{name: 'home'}" class="navbar-brand" href="#">Kings Of Bots</router-link>
        <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
            <router-link :to="{name: 'pk_index'}" :class="route_name === 'pk_index' ? 'nav-link active' : 'nav-link'" aria-current="page" href="#">对战</router-link>
            </li>
            <li class="nav-item">
            <router-link :to="{name: 'record_index'}" :class="route_name === 'record_index' ? 'nav-link active' : 'nav-link'" href="#">对局列表</router-link>
            </li>
            <li class="nav-item">
            <router-link :to="{name: 'ranklist_index'}" :class="route_name === 'ranklist_index' ? 'nav-link active' : 'nav-link'" href="#">排行榜</router-link>
            </li>
        </ul>

        <ul class="navbar-nav" v-if="store.state.user.is_login">
            <li class="nav-item dropdown">
                <router-link :to="{name: ''}" class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    {{ store.state.user.username }}
                </router-link>
                <ul class="dropdown-menu">
                    <li><router-link :to="{name: 'user_bot_index'}" class="dropdown-item" href="#">我的Bot</router-link></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="#" @click="logout">退出</a></li>
                </ul>
            </li>
        </ul>
        <ul class="navbar-nav" v-else-if="!store.state.user.pulling_info">
            <li class="nav-item">
                <router-link :to="{name: 'user_account_login'}" :class="route_name === 'user_account_login' ? 'nav-link active' : 'nav-link'" href="#">登录</router-link>
            </li>
            <li class="nav-item">
                <router-link :to="{name: 'user_account_register'}" :class="route_name === 'user_account_register' ? 'nav-link active' : 'nav-link'" href="#">注册</router-link>
            </li>
        </ul>
        
        </div>
    </div>
    </nav>
</template>

<script>
import { useRoute } from 'vue-router'
import { computed } from 'vue'
import { useStore } from 'vuex';

export default{
    name: "NavBar",

    setup() {
        const store = useStore();
        const route = useRoute();
        let route_name = computed(() => route.name);

        const logout = () => {
            store.dispatch("logout");
        }

        return {
            route_name,
            store,
            logout,
        }
    }
}
</script>

<script scoped>

</script>