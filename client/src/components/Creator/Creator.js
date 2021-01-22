import React from "react";
import "./Creator.css"

class Creator extends React.Component {
    state = {
        name: "",
        email: "",
        text: "",
    }

    render() {
        return (
            <div className="post">
                <p>Добавить объявление</p>
                <form onSubmit={this.sendData()}>
                    <input type="text" placeholder={"Имя"}  />
                    <br/>
                    <input type="text" placeholder={"Email"}  />
                    <br/>
                    <br/>
                    <textarea placeholder={"Объявление"}/>
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