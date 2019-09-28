import React from "react";
import {  Route, Link  } from "react-router-dom";
import Login from './Login'
import QrcodeLogin from './QrcodeLogin'
import AuthorizeLogin from './AuthorizeLogin'


function Index(){
    return (
        <div className='signinPage'>
            <div className="signinIndex">
                <h3>登录子菜单索引</h3>

            </div>
            <div className="signinContent">
                <nav>&times;</nav>
                <header>
                    <Link to="/signin/Login">登录</Link>
                    <Link to="/signin/QrcodeLogin">扫码登录</Link>
                    <Link to="/signin/AuthorizeLogin">授权登录</Link>
                </header>
                <main>
                    <Route path="/signin/Login/"            component={Login} />
                    <Route path="/signin/QrcodeLogin/"      component={QrcodeLogin} />
                    <Route path="/signin/AuthorizeLogin/"   component={AuthorizeLogin} />
                </main>

            </div>

        </div>
    )
}
export default Index;