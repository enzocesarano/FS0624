import { Component } from 'react'

class ImageComponent extends Component {
    render() {
        return (
          <>
            <img src={this.props.src} className={this.props.css} alt={this.props.alt} />
          </>
        )
      }
}

export default ImageComponent