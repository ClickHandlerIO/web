import React from "react";
import ReactDOM from "react-dom";
import {Router, browserHistory, hashHistory} from "react-router";


window.React = React;
window.ReactDOM = ReactDOM;
window.ReactRouter = {
    browserHistory: browserHistory,
    hashHistory: hashHistory,
    Router: Router
};
