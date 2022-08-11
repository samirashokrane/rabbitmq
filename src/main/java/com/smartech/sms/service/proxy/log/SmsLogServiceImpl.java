package com.smartech.sms.service.proxy.log;

import com.smartech.sms.dto.request.SmsLogRequest;
import com.smartech.sms.dto.response.SmsLogResponse;
import com.smartech.sms.mapper.SmsLogMapper;
import com.smartech.sms.repository.SmsLogRepository;
import com.smartech.sms.service.proxy.SmsService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
@Transactional(rollbackFor = Exception.class)
@AllArgsConstructor
public class SmsLogServiceImpl extends SmsService implements SmsLogService {

    private final SmsLogRepository smsLogRepository;


    public SmsLogResponse register(final SmsLogRequest request) {
        return SmsLogMapper.INSTANCE.getResponse(smsLogRepository.save(SmsLogMapper.INSTANCE.initial(request)));
    }
}
