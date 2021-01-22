import React from 'react';
import './App.css';
import Adv from "./components/Adv";
import Creator from "./components/Creator";
import axios from "axios";

class App extends React.Component {
    state = {
        ads: []
    }

    componentDidMount() {
        this.loadAd()
    }

    deleteAdById(id) {
        axios.delete(`/api/adv/delete?id=` + id)
            .then(() => {
                this.loadAd()
            })
            .catch(ex => {
                alert(ex)
            })
    }

    createAd(event) {
        const name = event.target.name.value;
        const email = event.target.email.value;
        const text = event.target.text.value;

        axios.put(`/api/adv/save?`
            +`name=`+ name
            +`&email=`+ email
            +`&text=` + text)
            .catch(e=>{alert(e)})

    }

    updateAd(event) {
        const id = event.target.id.value;
        const name = event.target.name.value;
        const email = event.target.email.value;
        const text = event.target.text.value;

        axios.put(
            `/api/adv/update?`
            +`name=`+ name
            +`&email=`+ email
            +`&text=` + text
            +`&id=`+id)
            .catch(e=>{alert(e)})
    }

    loadAd() {
        axios.get(`/api/adv/`)
            .then(res => {
                const resAdv = res.data;
                this.setState({ads: resAdv});
            })
            .catch(ex => {
                alert(ex)
            })
    }

    render() {
        return (
            <div className="App">
                <Creator create={this.createAd}/>
                {
                    this.state.ads.map(item => {
                        return (
                            <Adv key={item.id}
                                 value={item}
                                 delete={this.deleteAdById.bind(this, item.id)}
                                 update={this.updateAd}
                            />
                        )
                    })
                }
            </div>
        )
    }
}

export default App;
