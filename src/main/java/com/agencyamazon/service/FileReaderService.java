package com.agencyamazon.service;

import com.agencyamazon.dto.external.ReportInfoDto;

public interface FileReaderService {
    ReportInfoDto readFile(String path);
}
