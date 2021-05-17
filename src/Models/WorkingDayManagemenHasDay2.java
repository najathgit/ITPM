/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class WorkingDayManagemenHasDay2 {
    private int id;
    private WorkingDayManagementModel working_day_management_wdm_id;
    private DayModel days_day_id;

    public WorkingDayManagemenHasDay2(int id, WorkingDayManagementModel working_day_management_wdm_id, DayModel days_day_id) {
        this.id = id;
        this.working_day_management_wdm_id = working_day_management_wdm_id;
        this.days_day_id = days_day_id;
    }

    public WorkingDayManagemenHasDay2(WorkingDayManagementModel working_day_management_wdm_id, DayModel days_day_id) {
        this.working_day_management_wdm_id = working_day_management_wdm_id;
        this.days_day_id = days_day_id;
    }

    public int getId() {
        return id;
    }

    public WorkingDayManagementModel getWorking_day_management_wdm_id() {
        return working_day_management_wdm_id;
    }

    public DayModel getDays_day_id() {
        return days_day_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWorking_day_management_wdm_id(WorkingDayManagementModel working_day_management_wdm_id) {
        this.working_day_management_wdm_id = working_day_management_wdm_id;
    }

    public void setDays_day_id(DayModel days_day_id) {
        this.days_day_id = days_day_id;
    }
    
    
}
