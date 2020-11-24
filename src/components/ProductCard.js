import React from "react";

export default function ProductCards(props) {
  return (
    <div className="card">
      <img
        src="https://picsum.photos/200/300"
        className="card-img-top"
        alt="Card image cap"
      />
      <div className="card-body">
        <h5 className="card-title"> {props.title}</h5>
        <p className="card-text"> {props.text}</p>
        <a href="#0" className="btn btn-primary">
          Go somewhere
        </a>
      </div>
    </div>
  );
}
