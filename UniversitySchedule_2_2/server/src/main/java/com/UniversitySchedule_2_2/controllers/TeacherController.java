package com.UniversitySchedule_2_2.controllers;

import static com.UniversitySchedule_2_2.constants.ResourceMappings.TEACHER;

import com.UniversitySchedule_2_2.dto.TeacherDTO;
import com.UniversitySchedule_2_2.dto.TeacherNamesDTO;
import com.UniversitySchedule_2_2.services.TeacherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TEACHER)
public class TeacherController {

  @Autowired
  private TeacherService teacherService;

  @GetMapping("/allTeacherNames")
  public List<TeacherNamesDTO> getAllTeacherNames() {
    return teacherService.getAllTeacherNames();
  }

  @GetMapping("/{id}")
  public TeacherDTO getOneTeacher(@PathVariable Long id) {
    return teacherService.getOneTeacher(id);
  }

  @DeleteMapping("/{id}")
  public void remove(@PathVariable Long id) {
    teacherService.remove(id);
  }

}

