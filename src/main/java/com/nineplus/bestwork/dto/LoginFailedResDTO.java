package com.nineplus.bestwork.dto;

public class LoginFailedResDto {
	String username;
    int countLoginFailed;
    boolean isLocked;

    public String getUsername() {
          return username;
    }

    public void setUsername(String username) {
          this.username = username;
    }

    public int getCountLoginFailed() {
          return countLoginFailed;
    }

    public void setCountLoginFailed(int countLoginFailed) {
          this.countLoginFailed = countLoginFailed;
    }

    public boolean isLocked() {
          return isLocked;
    }

    public void setLocked(boolean isLocked) {
          this.isLocked = isLocked;
    }


}
