package com.mikeescom.stepbuilderpattern;

class ServerDetails {
    private final String host;
    private String user;
    private String password;

    public ServerDetails(String host) {
        this.host = host;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocalHost() {
        return true;
    }
}
