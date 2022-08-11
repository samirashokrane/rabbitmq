package com.smartech.sms.service.proxy.log;

import com.smartech.sms.dto.request.SmsLogRequest;
import com.smartech.sms.dto.response.SmsLogResponse;

public interface SmsLogService {

     SmsLogResponse register(final SmsLogRequest request);
}
