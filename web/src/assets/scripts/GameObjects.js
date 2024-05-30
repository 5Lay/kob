const GAME_OBJECT = [];

export class GameObject {
    constructor() {
        GAME_OBJECT.push(this);
        this.timedelta = 0;
        this.has_cassed_start = false;
    }

    start() {   // 只执行一次

    }

    update() { // 每一帧之星一次，除了第一帧之外

    }

    on_destroy() {  // 删除之前执行

    }

    destroy() {
        for (let i in GAME_OBJECT) {
            const obj = GAME_OBJECT[i];
            if (obj === this){
                GAME_OBJECT.splice(i)
                break;
            }
        }
    }
}
let last_timestamp; // 上一次执行的时间
const step = timestamp => {
    for (let obj of GAME_OBJECT) {
        if (!obj.has_cassed_start) {
            obj.has_cassed_start = true;
            obj.start();
        } else {
            obj.timedelta = timestamp - last_timestamp;
            obj.update();
        }
    }

    last_timestamp = timestamp;
    requestAnimationFrame(step)
}

requestAnimationFrame(step)