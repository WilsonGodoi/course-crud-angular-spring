import { Location } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { CoursesService } from './../services/courses.service';

@Component({
  selector: 'app-course-form',
  templateUrl: './course-form.component.html',
  styleUrls: ['./course-form.component.scss'],
})
export class CourseFormComponent {
  form: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private service: CoursesService,
    private snackBar: MatSnackBar,
    private location: Location
  ) {
    this.form = this.formBuilder.group({
      name: [null],
      category: [null],
    });
  }

  goBack() {
    this.location.back();
  }

  onSubmit() {
    this.service.save(this.form.value).subscribe(this.onSuccess, this.onError);
  }

  private onSuccess = () => {
    this.snackBar.open('Course created!', '', { duration: 3000 });
    this.goBack();
  };

  private onError = () => {
    this.snackBar.open('Error on save course!', '', { duration: 3000 });
  };
}
