import React from "react";
import {  Route, Link  } from "react-router-dom";
import Login from './Login'
import QrcodeLogin from './QrcodeLogin'
import AuthorizeLogin from './AuthorizeLogin'


function Index(){
    return (
        <div>
            <div className="topNav">
                <h3>登录子菜单索引</h3>
                <ul>
                    <li><Link to="/signin/Login">登录</Link></li>
                    <li><Link to="/signin/QrcodeLogin">扫码登录</Link></li>
                    <li><Link to="/signin/AuthorizeLogin">第三方授权登录</Link></li>

                </ul>
            </div>
            <div className="videoContent">
                <h3>子菜单视图</h3>
                <Route path="/signin/Login/"            component={Login} />
                <Route path="/signin/QrcodeLogin/"      component={QrcodeLogin} />
                <Route path="/signin/AuthorizeLogin/"   component={AuthorizeLogin} />

            </div>
        </div>
    )
}
export default Index;