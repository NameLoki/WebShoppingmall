import React from 'react';
import {BrowserRouter as Router, Route} from "react-router-dom";

import MainComponent from './MainComponent';
import DashboardComponent from './Dashboard';
import LoginComponent from './LoginComponent';
import MenuComponent from './MenuComponent';

import ProductDetail from './ProductDetaileComponent';

const BodyCompoent = () => {
    return(
        <Router>
            <Route path="/main" component={MainComponent}></Route>
            <Route path="/menu" component={MenuComponent}></Route>
            <Route path="/login" component={LoginComponent}/>
            <Route path="/event" component={DashboardComponent}/>
            <Route path="/menu/product/:id" component={ProductDetail}></Route>
        </Router>
    )
}

export default BodyCompoent;