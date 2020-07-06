import React, {Component} from 'react';
import {ListGroup, Button} from "react-bootstrap";
import {BrowserRouter as Router, Route} from "react-router-dom";

import MenuInfo from './MenuInfoComponent';

import Product from './ProductComponent';

import './MenuListComponent.css'

class MenuListComponent extends Component {
    static defaultProps = {
        menus:[]
    }

    render() {
        const { menus } = this.props;

        const list = menus.map(
            info => (
                <MenuInfo info={info}></MenuInfo>
            )
        );

        return(
            <>
            <div id='menuList'>
            <ListGroup defaultActiveKey='1'>
                {list}
            </ListGroup>
            </div>
            <div>
                <Route path="/menu/:menuId" component={Product}></Route>
            </div>
            </>
        );
    }
}

export default MenuListComponent;