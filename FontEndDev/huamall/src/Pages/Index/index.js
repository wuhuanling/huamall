import React, { Component } from 'react';
// import PropTypes from 'prop-types';
import 'antd/dist/antd.css'
import { Carousel,Menu, Dropdown, Button } from 'antd'
import store from '../../store'
import { whileStatement } from '@babel/types';

const menu = (
    <Menu>
      <Menu.Item>
        <a target="_blank" rel="noopener noreferrer" href="http://www.alipay.com/">
          1st menu item
        </a>
      </Menu.Item>
      <Menu.Item>
        <a target="_blank" rel="noopener noreferrer" href="http://www.taobao.com/">
          2nd menu item
        </a>
      </Menu.Item>
      <Menu.Item>
        <a target="_blank" rel="noopener noreferrer" href="http://www.tmall.com/">
          3rd menu item
        </a>
      </Menu.Item>
    </Menu>
);

class index extends Component {
    constructor(props) {
        super(props)
        this.setState = store.getState()
        this.storeChange = this.storeChange.bind(this)
        store.subscribe(this.storeChange)

        this.state= {
            test: [
                'https://res.vmallres.com/pimages//pages/picImages/zrHiAHQtxNSuv2rQ0Ea1.jpg',
                'https://res.vmallres.com/pimages//pages/picImages/pGpGYxwvdYSjs5MoKAAB.jpg',
                'https://res.vmallres.com/pimages//pages/picImages/zrHiAHQtxNSuv2rQ0Ea1.jpg',
                'https://res.vmallres.com/pimages//pages/picImages/pGpGYxwvdYSjs5MoKAAB.jpg',
            ]
        }



        //绑定this

    }
    render() {
        return (
            <div className="indexPage">
                <aside>
                    <Dropdown overlay={menu} placement="topCenter">
                        <Button>topCenter</Button>
                    </Dropdown>
                    <Dropdown overlay={menu} placement="topCenter">
                        <Button>topCenter</Button>
                    </Dropdown>
                    <Dropdown overlay={menu} placement="topCenter">
                        <Button>topCenter</Button>
                    </Dropdown>
                    <Dropdown overlay={menu} placement="topCenter">
                        <Button>topCenter</Button>
                    </Dropdown>
                    <Dropdown overlay={menu} placement="topCenter">
                        <Button>topCenter</Button>
                    </Dropdown>
                    <Dropdown overlay={menu} placement="topCenter">
                        <Button>topCenter</Button>
                    </Dropdown>
                </aside>
                <main>
                <Carousel autoplay dotPosition='right'>

                    {this.state.test.map((item,index)=>{
                        return (

                            <img
                            src={item}

                            key={index} className={index + '00'}



                            />




                        )

                    })
                }
                </Carousel>
                </main>
            </div>
        )
    }
    //生命周期函数
    componentDidMount() {
        console.log("挂载完成")
        console.log(this.state.test)
    }
    //最定义方法
    storeChange(){
        this.setState(store.getState()) //刷新一下stat
    }
}

// index.propTypes = {

// };

export default index;