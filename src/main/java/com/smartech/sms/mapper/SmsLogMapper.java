package com.smartech.sms.mapper;

import com.smartech.sms.domain.SmsLog;
import com.smartech.sms.dto.enums.MessageStatusEnum;
import com.smartech.sms.dto.request.SmsLogRequest;
import com.smartech.sms.dto.response.SmsLogResponse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SmsLogMapper {

    public static final SmsLogMapper INSTANCE = new SmsLogMapper();

    public SmsLog initial(final SmsLogRequest request) {
        return SmsLog.builder()
                .smsContent(request.getSmsContent())
                .destinationNumber(request.getDestinationNumber())
                .signText(request.getSignText())
                .build();

    }

    public SmsLogResponse getResponse(final SmsLog smsLog) {
        return SmsLogResponse.builder()
                .messageStatus(MessageStatusEnum.SUCCESS)
                .destinationNumber(smsLog.getDestinationNumber())
                .build();
    }
}
