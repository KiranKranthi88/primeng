import { Component, OnInit } from '@angular/core';
import { MyServiceService } from './my-service.service';


@Component({
  selector: 'at-settings',
  templateUrl: './settings.component.html',
  styleUrls: ['./settings.component.css']
})
export class SettingsComponent implements OnInit {

    myServiceService: MyServiceService;
    user: string;
    users: string[];
    filteredUsersSingle: string[];


    constructor(myServiceService: MyServiceService) {
      this.myServiceService = myServiceService;
      // this.myServiceService.searchUserByKey('k').subscribe(
      //   users => {
      //       this.users = users;
      //       console.log('Search Results', users);
      //   },
      //   error => console.log(error)
      // )
     }
  
    ngOnInit() {
    }

    filterUserSingle(event) {
      let query = event.query;
      this.myServiceService.searchUserByKey(query).subscribe(users => {
          this.filteredUsersSingle = users;
      },
      error => console.log('kkkk errrrrrrrrrrr:: ', error)
    );
  }

}
