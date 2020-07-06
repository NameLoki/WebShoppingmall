import React, {Component} from 'react';
import axios from 'axios'

import MenuList from './MenuListComponent';

class MenuComponent extends Component {

    constructor(props) {
        super(props);
        
        this.state = {
            menus:[]
        }
    }

    componentDidMount() {
        this.getMenu();
    }

    getMenu = () => {
        axios.get('/api/menu')
        .then(res => {
            this.setState({
                menus:res.data
            });
            console.log(res);
        })
        .catch(res => {
            console.error('error');
            console.log(res);
        })
    }
        

    render() {
        return (
            <MenuList menus={this.state.menus}></MenuList>
        )
    }
}

export default MenuComponent;