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

            </div>
            <div className="signInContent">
                <nav>&times;</nav>

                <header>
                    <Link to="/signin/Login">登录</Link>
                    <Link to="/signin/QrcodeLogin">扫码登录</Link>
                    <Link to="/signin/AuthorizeLogin">第三方授权登录</Link>
                </header>
                <Route path="/signin/Login/"            component={Login} />
                <Route path="/signin/QrcodeLogin/"      component={QrcodeLogin} />
                <Route path="/signin/AuthorizeLogin/"   component={AuthorizeLogin} />
            </div>

        </div>
    )
}
export default Index;