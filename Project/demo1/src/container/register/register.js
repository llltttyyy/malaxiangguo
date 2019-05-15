import React from 'react'
import Logo from '../../component/logo/logo'
import {List,InputItem,WingBlank,WhiteSpace,Button,Radio} from 'antd-mobile'
import {connect} from 'react-redux'
import {register} from '../../redux/user.redux'
import '../../index.css'

@connect(
    state => state.user,
    {register}
)
class Register extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            user:'',
            pwd:'',
            repeatpwd:'',
            type:'genius',
        }
        this.handleRegister = this.handleRegister.bind(this)
    }
    //调用redux/user.redux中的register方法，判断是否可以注册
    handleRegister(){
        this.props.register(this.state)
        // console.log(this.state);
    }
    //监控输入框的变化，及时更新state中的值
    handleChange(key,val){
        this.setState({
            [key]:val
        })
    }
    render(){
        const RadioItem = Radio.RadioItem
        return (
            <div>
                <Logo></Logo>
                <WingBlank>
                    <List>
                        {this.props.msg?<p className="error-msg">{this.props.msg}</p>:null}
                        <InputItem onChange={v=>this.handleChange('user',v)}>手机号</InputItem>
                        <InputItem onChange={v=>this.handleChange('pwd',v)} type="password">密码</InputItem>
                        <InputItem onChange={v=>this.handleChange('repeatpwd',v)} type="password">确认密码</InputItem>
                        <RadioItem onChange={()=>this.handleChange('type','genius')} checked={this.state.type=='genius'}>
                            牛人
                        </RadioItem>
                        <RadioItem onChange={()=>this.handleChange('type','boss')} checked={this.state.type=='boss'}>
                            boss
                        </RadioItem>
                    </List>
                    <WhiteSpace/>
                    <Button type="primary" onClick={this.handleRegister}>注册</Button>
                    <WhiteSpace/>
                </WingBlank>
            </div>
        )
    }
}

export default Register;
