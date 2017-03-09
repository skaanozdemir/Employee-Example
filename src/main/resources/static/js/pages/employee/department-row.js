import React from 'react';

export default class DepartmentRow extends React.Component{

    render(){
        const department = this.props.department;

        return(
            <tr>
                <td>{department.departmentId}</td>
                <td>{department.departmentName}</td>
                <td>{department.description}</td>
                <td>{department.employeeId}</td>
                <td><span className="glyphicon glyphicon-trash"/></td>
            </tr>
        );
    }
}