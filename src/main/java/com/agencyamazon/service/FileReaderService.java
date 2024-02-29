package com.agencyamazon.service;

import com.agencyamazon.dto.external.ReportInfoDto;

import java.io.IOException;

public interface FileReaderService {
    ReportInfoDto readFile(String path) throws IOException;
}
