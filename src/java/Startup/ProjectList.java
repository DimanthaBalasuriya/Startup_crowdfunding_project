/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startup;

import Models.projectmodel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CASSIE
 */
public class ProjectList {

    public static List<projectmodel> getAllProjects() {
        List<projectmodel> projects = new ArrayList<>();
        try {
            ResultSet rs1 = Database.getData("SELECT `project`.`prg_name`, `project`.`prg_describe_briefly`, `project`.`prg_id`,  `project`.`prg_video_link`, `intrest`.`int_name` FROM `startup_new_version`.`project_intrest` INNER JOIN `startup_new_version`.`project` ON (`project_intrest`.`prg_id` = `project`.`prg_id`) INNER JOIN `startup_new_version`.`intrest` ON (`project_intrest`.`int_id` = `intrest`.`int_id`)");
            while (rs1.next()) {
                projects.add(new projectmodel(rs1.getString("prg_id"), rs1.getString("prg_name"), rs1.getString("prg_describe_briefly"), rs1.getString("prg_video_link"), rs1.getString("int_name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return projects;
    }

}
