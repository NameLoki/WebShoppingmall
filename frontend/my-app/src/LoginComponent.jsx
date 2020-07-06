import React, {Component} from "react";
import axios from "axios"

const {useState, useRef} = React;

const LoginComponent = () => {
    const [account, setAccount] = useState('');
    const [password, setPassword] = useState('');

    const onChangeAccount = (e) => {
        setAccount(e.target.value);
    }

    const onChangePassword = (e) => {
        setPassword(e.target.value);
    }

    const onClickLogin = (e) => {
            axios.post('/api/user/login', {
            account:account,
            password:password
        }).then(res => {
            alert(JSON.stringify(res));
        });

    }

    return <>
        <h2>로그인</h2>
        <input onChange={onChangeAccount}></input>
        <input type='password' onChange={onChangePassword}></input>
        <button onClick={onClickLogin}>로그인</button>
    </>
}

export default LoginComponent;