import React from 'react';
import './App.css';
import Adv from "./components/Adv";
import Creator from "./components/Creator";

class App extends React.Component {
    values = [
        {
            user: "Andrey Andrey",
            email: "email@emmm.co",
            text: "Ghjlfvgdarrac Prodam Garagg"
        }
    ]

    render() {
        return (
            <div className="App">
                <Creator/>
                <Adv values={this.values}/>
            </div>
        )
    }
}

export default App;
