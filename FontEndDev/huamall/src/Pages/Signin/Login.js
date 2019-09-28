import React from "react";
import { Form, Icon, Input, Button, Checkbox, Divider } from 'antd';

class NormalLoginForm extends React.Component {
    handleSubmit = e => {
        e.preventDefault();
        //获取查询条件的值 validateFields
        this.props.form.validateFields((err, values) => {
          //若没发生错误则回调走下列逻辑拿到values值
          if (!err) {
            console.log('获取到的值为: ', values);
          }
        })
    }
    render() {
        const { getFieldDecorator } = this.props.form;
        return (
            <div className="login-comp">
                <Form onSubmit={this.handleSubmit} className="login-form">
                    <Form.Item>
                    {getFieldDecorator(
                        //getFieldDecorator(id, options) 用作双向绑定
                        // 第一个括号参数定义数据
                        'username', {
                        rules: [{ required: true, message: '用户名不能为空!' }],
                    })(
                        // 第二个括号参数定义结构样式
                        <Input
                        prefix={<Icon type="user" style={{ color: 'rgba(0,0,0,.25)' }} />}
                        placeholder="请输入用户名"
                        />,
                    )}
                    </Form.Item>
                    <Form.Item>
                    {getFieldDecorator(
                        'password', {
                        rules: [{ required: true, message: '密码不能为空!' }],
                    })(
                        <Input
                        prefix={<Icon type="lock" style={{ color: 'rgba(0,0,0,.25)' }} />}
                        type="password"
                        placeholder="请输入密码"
                        />,
                    )}
                    </Form.Item>
                    <Form.Item>
                    {getFieldDecorator('remember', {
                        valuePropName: 'checked',
                        initialValue: false,
                    })(<Checkbox>记住HuaMall账号</Checkbox>)}
                    <a className="login-form-forgot" href="#">
                        忘记密码
                    </a>
                    <Button type="primary" htmlType="submit" className="login-form-button">
                        登录
                    </Button>
                    或&nbsp;
                    <a href="#">
                        现在加入!
                    </a>
                    </Form.Item>
                </Form>

                <Divider>HuaMall商城</Divider>
                <small>继续访问即代表您已同意<em>HuaMall商城服务协议</em>和<em>HuaMall隐私政策</em></small>
            </div>
        )
    }

}

const Index = Form.create({ name: 'normal_login' })(NormalLoginForm);
export default Index;