package com.mikeescom.stepbuilderpattern;

class UserConfiguration {
    private final String name;
    private final String filePath;
    private ServerDetails serverDetails;

    public UserConfiguration(String name, String filePath){
        this.name = name;
        this.filePath = filePath;
    }
    public void setServerDetails(ServerDetails serverDetails) {
        this.serverDetails = serverDetails;
    }

    //all the getters
}
