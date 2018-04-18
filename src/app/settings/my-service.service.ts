import { Injectable } from '@angular/core';
import {Headers, Http, RequestOptions, Response} from '@angular/http';
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class MyServiceService {

  static REQUEST_OPTIONS: RequestOptions = new RequestOptions({headers: new Headers({'Content-Type': 'application/json'})});

  private apiRootUrl = 'http://localhost:8080';

  private searchUserUrl = this.apiRootUrl + '/filter';

  constructor(private http: Http) {
  }

  searchUserByKey(key: string): Observable<string[]> {
    return this.http.get(this.searchUserUrl + '/' + key)
        .map((response: Response) => response.json())
        .catch(this.defaultErrorHandler());
  }

  private defaultErrorHandler() {
    return (error: any) => {
        console.log(error);
        return Observable.throw(error.json().error || 'Server error')
    };
  }

}
