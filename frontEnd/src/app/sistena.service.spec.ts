import { TestBed } from '@angular/core/testing';

import { SistenaService } from './sistena.service';

describe('SistenaService', () => {
  let service: SistenaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SistenaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
