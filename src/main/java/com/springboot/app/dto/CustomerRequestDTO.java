package com.springboot.app.dto;

import com.springboot.app.entity.CustomerRequestComment;
import com.springboot.app.enums.Gender;
import com.springboot.app.enums.Habit;
import com.springboot.app.enums.HousekeepingRole;
import com.springboot.app.enums.LanguageKnown;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDTO {
    private Long requestId;
    private Long customerId;
    private HousekeepingRole housekeepingRole;
    private String timeSlotlist;
    private Gender gender;
    private LanguageKnown languageKnown;
    private String ageRange;
    private Habit cookingHabit;
    private Habit dietryHabit;
    private Long serviceProviderId;
    private Timestamp assignedDate;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String isResolved = "NO";
    private Long supervisorId;
    private String isPotential = "NO";
    private Long modifiedBy;
    private List<CustomerRequestComment> comments;
}
