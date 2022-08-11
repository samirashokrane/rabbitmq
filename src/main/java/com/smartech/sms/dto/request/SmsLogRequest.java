package com.smartech.sms.dto.request;

import com.smartech.sms.domain.BaseEntity;
import com.smartech.sms.dto.enums.MessageStatusEnum;
import com.smartech.sms.dto.enums.SmsProviderEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SmsLogRequest  implements Serializable {

    private static final long serialVersionUID = 1L;


    String smsContent;

    String destinationNumber;

    String signText;

}

