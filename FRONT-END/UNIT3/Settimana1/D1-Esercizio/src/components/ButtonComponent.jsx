const ButtonComponent = function (props) {
    return (
        <>
            <button className={props.css}>{props.title}</button>
        </>
    )
}

export default ButtonComponent