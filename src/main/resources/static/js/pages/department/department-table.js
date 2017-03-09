import React from 'react';

import DepartmentRow from './department-row';

export default class DepartmentTable extends React.Component{

    constructor(){
        super();
    }

    componentDidMount(){
        
    }

    render(){
        const departments = [
            {id: '1',
                departmentName: 'AR-GE',
                description: 'araştırma geliştirme',
                employeeId: '1'
            },{id: '1',
            	departmentName: 'DEVELOPERS',
                description: 'frontend developers',
                employeeId: '1'
            },{id: '1',
            	departmentName: 'DEVELOPERS BACK',
                description: 'backend developers',
                employeeId: '1'
            },{id: '1',
            	departmentName: 'Insan Kaynakları',
                description: 'çalışan ihtiyacları ve kariyer planlama',
                employeeId: '1'
            }
        ].map((department, i) => <DepartmentRow key={i} department={department} />);

        return(
            <div className="row">
                <div className="col-md-12">
                    <div className="table-responsive">
                        <table className="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>Department Name</th>
                                <th>Description</th>
                                <th>Employee Id</th>
                                <th>Delete</th>
                            </tr>
                            </thead>
                            <tbody>
                                {departments}
                            </tbody>
                        </table>
                    </div>
                    <nav aria-label="Page navigation">
                        <ul className="pagination pull-right">
                            <li>
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li>
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        );
    }
}