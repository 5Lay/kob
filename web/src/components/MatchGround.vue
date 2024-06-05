<template>
    <div class="matchground">
        <div class="row">
            <div class="col-6">
                <div class="user-photo">
                    <img :src="$store.state.user.photo" alt="">
                </div>
                <div class="user-name">{{ $store.state.user.username }}</div>
            </div>
            <div class="col-6">
                <div class="user-photo">
                    <img :src="$store.state.pk.opponent_photo" alt="">
                </div>
                <div class="user-name">{{ $store.state.pk.opponent_username }}</div>
            </div>
            <div class="col-12 match-btn">
                <button type="button" class="btn btn-warning btn-lg" @click="click_match_btn">{{ match_btn_info }}</button>
            </div>
        </div>

    </div>
</template>

<script>
import { ref } from 'vue';
import { useStore } from 'vuex';

export default {
    setup() {
        const store = useStore();
        let match_btn_info = ref("开始匹配");

        const click_match_btn = () => {
            if (match_btn_info.value === "开始匹配") {
                match_btn_info.value = "取消";
                store.state.pk.socket.send(JSON.stringify({
                    event: "start-matching",
                }));
            } else {
                match_btn_info.value = "开始匹配";
                store.state.pk.socket.send(JSON.stringify({
                    event: "stop-matching",
                }));
            }
        }

        return {
            match_btn_info,
            click_match_btn,
        }
    }
}
</script>

<style scoped>

div.matchground {
    width: 60vw;
    height: 70vh;
    margin: 40px auto;
    background-color: rgba(50, 50, 50, 0.5);
}

div.user-name {
    padding-top: 2vh;
    text-align: center;
    font-size: 24px;
    font-weight: 600;
    color: white;
}

div.user-photo {
    padding-top: 10vh;
    text-align: center;
}

div.user-photo > img {
    width: 20vh;
    border-radius: 50%;
}

div.match-btn {
    text-align: center;
    padding-top: 15vh;
}

</style>