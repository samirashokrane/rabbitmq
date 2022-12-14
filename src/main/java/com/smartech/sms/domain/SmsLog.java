package com.smartech.sms.domain;

import com.smartech.sms.dto.enums.MessageStatusEnum;
import com.smartech.sms.dto.enums.SmsProviderEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
@Table(name = "sms_log")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SmsLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "message_status")
    @Enumerated(EnumType.STRING)

    MessageStatusEnum messageStatus;

    @Column(name = "sms_content")
    String smsContent;

    @Column(name = "provider")
    @Enumerated(EnumType.STRING)

    SmsProviderEnum provider;

    @Column(name = "destination_number")
    String destinationNumber;

    @Column(name = "sign_text")
    String signText;


    @Column(name = "send_time")
    LocalDateTime sendTime;

    @Column(name ="delivered_time")
    LocalDateTime deliveredTime;

}

