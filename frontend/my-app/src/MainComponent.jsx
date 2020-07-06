import React, {Component} from "react";

import {Carousel} from "react-bootstrap";

import axios from "axios";

import testImage from './logo.svg'

class MainComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            message:"",
        }
    }

    componentDidMount() {
        this.getApi();
    }

    getApi = () => {
        axios.get("http://localhost:8080/api/hello")
        .then(res => {
            
            console.log(res);
            this.setState({
                message: res.data.message,
            })
        })
        .catch(res => console.log(res))
    }

    render() {
        return (
            <>
                <Carousel>
                    <Carousel.Item>
                        <img
                        className="d-block w-100"
                        src={testImage}></img>
                        <Carousel.Caption>
                            <h3>베너1</h3>
                            <p>이벤트 1입니다.</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <img
                        className="d-block w-100"
                        src={testImage}></img>
                        <Carousel.Caption>
                            <h3>베너2</h3>
                            <p>이벤트 2입니다.</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                </Carousel>
            </>
        )
    }
}

export default MainComponent;