package com.pulselens.analytics.entity;
import jakarta.persistence.*;import java.time.LocalDateTime;
@Entity @Table(name="users") public class AppUser {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(name="full_name",nullable=false) private String fullName;
 @Column(nullable=false,unique=true) private String username;
 @Column(nullable=false,unique=true) private String email;
 @Column(name="password_hash",nullable=false) private String passwordHash;
 private String country; @Column(nullable=false) private String role="USER";
 @Column(name="email_verified",nullable=false) private boolean emailVerified=false;
 @Column(name="account_enabled",nullable=false) private boolean accountEnabled=true;
 @Column(name="created_at",nullable=false) private LocalDateTime createdAt=LocalDateTime.now();
 public Long getId(){return id;}public String getFullName(){return fullName;}public void setFullName(String v){fullName=v;}public String getUsername(){return username;}public void setUsername(String v){username=v;}public String getEmail(){return email;}public void setEmail(String v){email=v;}public String getPasswordHash(){return passwordHash;}public void setPasswordHash(String v){passwordHash=v;}public String getCountry(){return country;}public void setCountry(String v){country=v;}public String getRole(){return role;}public void setRole(String v){role=v;}public boolean isEmailVerified(){return emailVerified;}public void setEmailVerified(boolean v){emailVerified=v;}public boolean isAccountEnabled(){return accountEnabled;}public void setAccountEnabled(boolean v){accountEnabled=v;}public LocalDateTime getCreatedAt(){return createdAt;}
}
