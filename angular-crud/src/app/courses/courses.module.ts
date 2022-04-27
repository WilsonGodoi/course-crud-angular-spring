import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MaterialModule } from './../shared/material/material.module';
import { SharedModule } from './../shared/shared.module';
import { CoursesRoutingModule } from './courses-routing.module';
import { CoursesComponent } from './courses/courses.component';
import { CourseFormComponent } from './course-form/course-form.component';

@NgModule({
  declarations: [CoursesComponent, CourseFormComponent],
  imports: [CommonModule, CoursesRoutingModule, MaterialModule, SharedModule],
})
export class CoursesModule {}
