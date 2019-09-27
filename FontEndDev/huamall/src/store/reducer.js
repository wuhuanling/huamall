//默认数据
const defaultState = {
    inputValue: '输入的值',
    list:[
        '早上4点起床',
        '中午下班游泳一小时'
    ]
}
export default (state = defaultState,action)=>{  //就是一个方法函数
    // console.log(state,action)
    if(action.type === 'change_input_value'){
        let newState = JSON.parse(JSON.stringify(state))
        newState.inputValue = action.value
        return newState
    }

    //state值只能传递，不能使用
    if(action.type === 'addItem' ){ //根据type值，编写业务逻辑
        let newState = JSON.parse(JSON.stringify(state))
        newState.list.push(newState.inputValue)  //push新的内容到列表中去
        newState.inputValue = ''
        return newState
    }

    if(action.type === 'deleteItem' ){
        let newState = JSON.parse(JSON.stringify(state))
        newState.list.splice(action.index,1)  //删除数组中对应的值
        return newState
    }

    return state
}