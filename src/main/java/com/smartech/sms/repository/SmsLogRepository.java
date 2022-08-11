package com.smartech.sms.repository;

import com.smartech.sms.domain.SmsLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsLogRepository extends JpaRepository<SmsLog, Long> {
}
