package com.agencyamazon.service.impl;

import com.agencyamazon.dto.external.ReportInfoDto;
import com.agencyamazon.exception.FileReaderException;
import com.agencyamazon.service.FileReaderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileReaderServiceImpl implements FileReaderService {
    private final ObjectMapper objectMapper;

    @Override
    public ReportInfoDto readFile(String path) {
        try {
            String reportContent = FileUtils.readFileToString(new File(path),
                    StandardCharsets.UTF_8);
            return objectMapper.readValue(reportContent, ReportInfoDto.class);
        } catch (IOException e) {
            throw new FileReaderException("Can't read file content");
        }
    }
}
