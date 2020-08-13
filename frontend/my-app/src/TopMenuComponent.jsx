import React, {Component} from "react";
import axios from 'axios';
import {Navbar} from "react-bootstrap";
import {BrowserRouter as Router, Route} from "react-router-dom";



class TopMenuComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            session: {
                api:'',
                msg:'',
            },
            user:false,
        }
        this.getSession();
    }

    getSession = () => {
        axios.get('/api/user/session')
        .then(res => {
            let api = '/login'
            let s = false;
            let msg = '로그인'
            if(res.data) {
                api = '/mypage'
                s = true;
                msg = '마이페이지'
            }
            this.setState({
                session:{
                    api:api,
                    msg:msg,
                },
                user:s,
            });
        })
    }

    render() {
        return <>
            <Navbar
                bg="dark"
                variant="dark"
                className="mb-4">
                    <Navbar.Brand href="/main">
                        메인
                    </Navbar.Brand>
                    <Navbar.Brand href="/menu">
                        카테고리
                    </Navbar.Brand>
                    <Navbar.Brand href={this.state.session.api}>
                        {this.state.session.msg}
                    </Navbar.Brand>
                    <Navbar.Brand href="/dashboard">
                        이벤트
                    </Navbar.Brand>
                </Navbar>
        </>
    }
}

export default TopMenuComponent;