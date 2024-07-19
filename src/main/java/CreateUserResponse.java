public class CreateUserResponse {
    private boolean successFlag;
    private User user;
    private String accessToken;
    private String refreshToken;

    public CreateUserResponse(boolean success, User user, String accessToken, String refreshToken) {
        this.successFlag = success;
        this.user = user;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
    public boolean isSuccess() {
        return successFlag;
    }

    public void setSuccess(boolean success) {
        this.successFlag = success;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
