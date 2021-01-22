import React from 'react';
import './Adv.css';

class Adv extends React.Component {
    state = {
        values: this.props.values
    }

    items = () => {
        return (
            this.state.values.map((item) => {
                return (
                    <div className="post">
                        <text> {item.text}</text>
                        <header>{item.user}: {item.email}</header>
                    </div>
                );
            })
        )
    }

    render() {
        return this.items()
    }
}

export default Adv