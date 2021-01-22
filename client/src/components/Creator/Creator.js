import React from "react";
import "./Creator.css"

class Creator extends React.Component {
    state = {
        create:this.props.create,
        name: "",
        email: "",
        text: "",
    }

    render() {
        return (
            <div className="post">
                <p>Добавить объявление</p>
                <form onSubmit={this.state.create}>
                    <input type="text" placeholder={"Имя"} name={"name"} />
                    <br/>
                    <input type="text" placeholder={"Email"} name={"email"} />
                    <br/>
                    <br/>
                    <textarea placeholder={"Объявление"} name={"text"}/>
                    <br/>
                    <input type="submit" value="Отправить"/>
                </form>
            </div>
        );
    };

    sendData() {
    }
}

export default Creator;