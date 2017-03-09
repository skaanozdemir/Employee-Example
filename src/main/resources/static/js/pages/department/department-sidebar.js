import React from 'react';

export default class DepartmentSidebar extends React.Component{
    
    constructor(props){
        super(props);
        this.closeSidebar = this.closeSidebar.bind(this);
    }
    
    closeSidebar(){
        this.props.toggleSidebarRight();
    }
    
    render(){

        const resizeClass = {
            resize: "vertical"
        };

        return(
            <div id="sidebar-wrapper-right">
                <form role="form" className="form-horizontal">
                    <div className="form-group">
                        <div className="col-sm-8">
                            <h4><span className="glyphicon glyphicon-plus"/> Add New Department</h4>
                        </div>
                        <div className="col-sm-4">
                            <button type="button" className="btn btn-danger pull-right">
                                Reset <span className="glyphicon glyphicon-refresh"/>
                            </button>
                        </div>
                    </div>
                    <hr/>
                    <div className="form-group">
                        <label htmlFor="departmentName" className="col-sm-3 control-label">Department Name:</label>
                        <div className="col-sm-9">
                            <input type="text" className="form-control"
                                   name="departmentName" id="departmentName" placeholder="John"/>
                        </div>
                    </div>
                    <div className="form-group">
                        <label htmlFor="description" className="col-sm-3 control-label">Description:</label>
                        <div className="col-sm-9">
                            <textarea className="form-control" rows="3" style={resizeClass}
                                      name="description" id="description" placeholder="Insert Text Here..."/>
                        </div>
                    </div>
                    <div className="form-group">
                        <label htmlFor="employeeId" className="col-sm-3 control-label">Employee Id:</label>
                        <div className="col-sm-9">
                            <input type="text" className="form-control"
                                   name="employeeId" id="employeeId" placeholder="Manila"/>
                        </div>
                    </div>
           
                    <div className="form-group">
                        <label htmlFor="dueDate" className="col-sm-3 control-label">Due Date:</label>
                        <div className="col-sm-9">
                            <input type="date" className="form-control"
                                   name="dueDate" id="dueDate"/>
                        </div>
                    </div>
                    <hr/>
                    <div className="form-group">
                        <div className="col-sm-offset-5 col-sm-3">
                            <button type="button" className="btn btn-primary pull-right">
                                Save <span className="glyphicon glyphicon-ok"/>
                            </button>
                        </div>
                        <div className="col-sm-4">
                            <button type="button" className="btn btn-warning pull-right" onClick={this.closeSidebar}>
                                Cancel <span className="glyphicon glyphicon-remove"/>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        );
    }
}