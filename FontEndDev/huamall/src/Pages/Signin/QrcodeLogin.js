import React from "react"
import QRCode from 'qrcode.react'

function QrcodeLogin(){
    return (
        <aside className="qrlogin-comp">
                <h2>这是二维码登录</h2>
                <QRCode
                value={"https://trashink.tk"}
                size={300}
                bgColor={"#ffffff"}
                fgColor={"#40a9ff"}
                level={"M"}
                renderAs={"svg"}
                />

                <img src="https://trashink.tk/img/LOGO.png" />


        </aside>

    )
}





export default QrcodeLogin