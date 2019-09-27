import React from "react";
import { BrowserRouter as Router, Route, Link  } from "react-router-dom";
import Index from './Pages/Index'
import Signin from './Pages/Signin/Index'
import User from './Pages/User/Index'
import './index.css'

function AppRouter() {
    let routeConfig =[
      {path:'/',title:'首页',exact:true,component:Index},
      {path:'/signin/',title:'登录',exact:false,component:Signin},
      {path:'/user/',title:'我的订单',exact:false,component:User}
    ]
    return (
      <Router>
          <div className="mainDiv">
            <div className="TopNav">
                <h3>HuaMall 商城系统</h3>
                <ul>
                    {
                      routeConfig.map((item,index)=>{
                          return (<li key={index}> <Link to={item.path}>{item.title}</Link> </li>)
                      })
                    }
                </ul>
            </div>

            <div className="Main">
                    {
                      routeConfig.map((item,index)=>{
                          return (<Route key={index} exact={item.exact} path={item.path}  component={item.component} />)
                      })
                    }

            </div>
          </div>
      </Router>
    );
  }


  export default AppRouter;