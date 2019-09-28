//默认数据
const defaultState = {
    inputValue: '',
    list:[
    ],
    // test: [
    //     'https://res.vmallres.com/pimages//pages/picImages/zrHiAHQtxNSuv2rQ0Ea1.jpg',
    //     'https://res.vmallres.com/pimages//pages/picImages/pGpGYxwvdYSjs5MoKAAB.jpg',
    //     'https://res.vmallres.com/pimages//pages/picImages/zrHiAHQtxNSuv2rQ0Ea1.jpg',
    //     'https://res.vmallres.com/pimages//pages/picImages/pGpGYxwvdYSjs5MoKAAB.jpg',
    // ]
}
export default (state = defaultState,action)=>{  //就是一个方法函数


    // //state值只能传递，不能使用
    // if(action.type === 'addItem' ){ //根据type值，编写业务逻辑
    //     let newState = JSON.parse(JSON.stringify(state))
    //     newState.list.push(newState.inputValue)  //push新的内容到列表中去
    //     newState.inputValue = ''
    //     return newState
    // }


    return state
}