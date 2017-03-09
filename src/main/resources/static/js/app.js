import React from 'react';
import ReactDom from 'react-dom';
import {Router, Route, IndexRoute, hashHistory} from 'react-router';

import Layout from './layout';

import Home from './pages/home';
import Dashboard from './pages/dashboard';
import Department from './pages/department/department';

const app = document.getElementById('app');


ReactDom.render(
    <Router history={hashHistory}>
        <Route path="/" component={Layout}>
            <IndexRoute component={Home}/>
            <Route path="dashboard" component={Dashboard}/>
            <Route path="departments" component={Department}/>
        </Route>
    </Router>
    app
);