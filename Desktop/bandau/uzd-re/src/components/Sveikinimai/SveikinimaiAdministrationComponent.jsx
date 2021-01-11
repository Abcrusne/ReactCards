import React from 'react';
//import { Link } from 'react-router-dom';

function SveikinimaiAdministrationComponent({ sveikinimas }) {
    return (
        <tr>
            <th scope="row">{sveikinimas.id}</th>
            <td>{sveikinimas.name}</td>
            <td>{sveikinimas.tect}</td>
            <td>{sveikinimas.date}</td>
            <td>{sveikinimas.time}</td>
            <td>{sveikinimas.type}</td>
        </tr>
    );
}

export default SveikinimaiAdministrationComponent;