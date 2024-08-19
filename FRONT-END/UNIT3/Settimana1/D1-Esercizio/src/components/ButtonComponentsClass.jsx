import { Component } from 'react'

class ButtonComponentClass extends Component {
  render() {
    return (
      <>
        <button className={this.props.css}>{this.props.title}</button>
      </>
    )
  }
}

export default ButtonComponentClass