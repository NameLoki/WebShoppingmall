import React, {Component} from 'react';
import {Card, Button} from "react-bootstrap";

import testImage from './logo.svg'

class ProductInfoComponent extends Component {

    constructor(props) {
        super(props);
        console.log(props.info);
    }

    render() {
        const {id, name, price} = this.props.info;

        const api = "/menu/product/" + id;

        return(
            <>
            <Card style={{ width: '18rem' }}>
                <Card.Img variant="top" src={testImage}></Card.Img>
                    <Card.Body>
                        <Card.Title>{name}</Card.Title>
                        <Card.Text>{price}원</Card.Text>
                        <Card.Link href={api}>상품 자세히 보기</Card.Link>
                    </Card.Body>
                </Card>
            </>
        )
    }
}

export default ProductInfoComponent;