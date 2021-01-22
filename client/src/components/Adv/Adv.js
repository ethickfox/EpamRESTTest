import React from 'react';
import './Adv.css';


class Adv extends React.Component {

    state = {
        value: this.props.value,
        delete: this.props.delete,
        update:this.props.update,
        isEditable: false
    };
    makeEditable = () => {
        this.setState({isEditable:true})
    }

    renderEditable() {

        return (
        <div className="post">
            <p>Изменить объявление</p>
            <form onSubmit={this.state.update}>
                <input type={"hidden"} name={"id"} value={this.state.value.id}/>
                <input type="text" placeholder={"Имя"} name={"name"}  defaultValue={this.state.value.author}/>
                <br/>
                <input type="text" placeholder={"Email"} name={"email"} defaultValue={this.state.value.email} />
                <br/>
                <br/>
                <textarea placeholder={"Объявление"} name={"text"} defaultValue={this.state.value.text} />
                <br/>
                <input type="submit" value="Отправить"/>
            </form>
        </div>
        )
    }

    renderNotEditable() {
        return (
            <div className="post" key={this.state.value.id}>
                <div className="text"> {this.state.value.text}</div>

                <header>
                    <button className={"edit"} onClick={this.makeEditable}>⚙</button>

                    {this.state.value.author}: {this.state.value.email}

                    <button className={"delete"} onClick={this.state.delete}>×</button>
                </header>
            </div>
        )
    }

    render() {
        if (this.state.isEditable)
            return this.renderEditable()
        else
            return this.renderNotEditable()
    }
}

export default Adv