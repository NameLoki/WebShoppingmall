import React, {Component} from "react";
import {Navbar} from "react-bootstrap";
import {BrowserRouter as Router, Route} from "react-router-dom";

import MainComponent from './MainComponent';
import DashboardComponent from './Dashboard';
import LoginComponent from './LoginComponent';
import MenuComponent from './MenuComponent';

import ProductDetail from './ProductDetaileComponent';

class TopMenuComponent extends Component {
    render() {
        return <Router>
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
                    <Navbar.Brand href="/login">
                        로그인
                    </Navbar.Brand>
                    <Navbar.Brand href="/dashboard">
                        이벤트
                    </Navbar.Brand>
                </Navbar>
                <Route path="/main" component={MainComponent}></Route>
                <Route path="/menu" component={MenuComponent}></Route>
                <Route path="/login" component={LoginComponent}/>
                <Route path="/event" component={DashboardComponent}/>
                <Route path="/product/:id" component={ProductDetail}></Route>
        </Router>
    }
}

export default TopMenuComponent;