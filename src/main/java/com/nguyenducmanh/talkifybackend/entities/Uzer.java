package com.nguyenducmanh.talkifybackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "users")
public class Uzer extends BaseEntity {
    String firstName;
    String lastName;
    String username;
    String email;
    String phone;
    String password;
    String avatar;
}
