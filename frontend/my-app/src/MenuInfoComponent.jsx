import React, {Component} from 'react';
import {ListGroup} from "react-bootstrap";

class MenuInfoComponent extends Component {

    static defaultProps = {
        info: {
            name: '카테고리'
        }
    }

    render() {
        
        const {name, id} = this.props.info;

        const move = '/menu/' + id;

        return (
            <ListGroup.Item action href={move}>
                {name}
            </ListGroup.Item>
        );
    }
}

export default MenuInfoComponent;