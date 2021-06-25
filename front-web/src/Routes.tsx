import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Header from './components/Header';
import Home from './pages/Home';
import Records from './pages/Records';

const Routes = () => (
    <div>
        <BrowserRouter>
            <Header />
            <Switch>               
                <Route exact path="/" component={Home} />
                <Route exact path="/records" component={Records} />
            </Switch>
        </BrowserRouter>
    </div>
);

export default Routes;