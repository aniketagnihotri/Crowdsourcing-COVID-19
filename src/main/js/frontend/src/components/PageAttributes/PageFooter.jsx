import React, { Component } from 'react';
import "./Navbar.css"
import {
    Link
} from "react-router-dom";

class PageHeader extends Component {

    styleText = {
        margin: 1,
        padding: 5,
        fontSize: 30,
    };

    styleIcon = {
        fontSize: 30,
        color: "#FFFFFF"
    };

    render() {
        return (
            <div className={"flexbox-container-footer footer-container"} >
                <Link to={"/"}>
                    <p href="#home" style={this.styleIcon}>indigo</p>
                </Link>
                <h6 style={{color:'gray'}}>Leave us some feedback at help.indigo04@gmail.com!</h6>
                <h6 style={{color:'gray'}}>Data provided by Yelp's Fusion API.</h6>
            </div>
        );
    }

}

export default PageHeader;