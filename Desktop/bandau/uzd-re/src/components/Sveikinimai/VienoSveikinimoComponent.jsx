import React from 'react';

function VienoSveikinimoComponent({ sveikinimas }) {
  return (
    <div className="col">
      <p>{sveikinimas.image}</p>
      <h2>Sveikina: {sveikinimas.name}</h2>
      <p>Linki: {sveikinimas.text}</p>
      <p>Data: {sveikinimas.date}</p>
      <p>Laikas: {sveikinimas.time}</p>
      <p>Įrašas: {sveikinimas.audio}</p>
      <p>Tipas: {sveikinimas.type}</p>
    </div>
  );
}

export default VienoSveikinimoComponent;
