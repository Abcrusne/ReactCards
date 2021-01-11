import React from 'react';
import { Link } from 'react-router-dom';

function SveikinimoCardComponent({sveikinimas}) {
    return (
        <div className="card mx-auto mb-5" style={{ width: '18rem' }}>
            <div className="card-body text-center">
                <h5 className="card-title">Sveikina: {sveikinimas.name}</h5>
                <p className="card-text">Linki: {sveikinimas.text}</p>
                <p className="card-text"><b>Data: {sveikinimas.date}</b></p>
                <p className="card-text">Laikas: {sveikinimas.time}</p>
                <Link 
                to={`/sveikinimai/${sveikinimas.id}`} 
                className="btn btn-primary"
                >
                    Plačiau
                </Link>
            </div>
        </div>
    );
}

export default SveikinimoCardComponent;