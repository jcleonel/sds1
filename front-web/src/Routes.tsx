import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Header from './components/Header';
import Home from './pages/Home';
import Records from './pages/Records';
import Charts from './pages/Charts';

const Routes = () => (
    <div>
        <BrowserRouter>
            <Header />
            <Switch>               
                <Route exact path="/" component={Home} />
                <Route exact path="/records" component={Records} />
                <Route exact path="/charts" component={Charts} />
            </Switch>
        </BrowserRouter>
    </div>
);

export default Routes;