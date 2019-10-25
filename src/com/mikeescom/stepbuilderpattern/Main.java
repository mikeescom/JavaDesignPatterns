package com.mikeescom.stepbuilderpattern;

public class Main {
    public static void main(String[] args) {
        // A local user configuration
        UserConfiguration localUserConfiguration = UserConfigurationBuilder
                .newBuilder()
                .name("aLocalConfiguration")
                .filePath("/opt/conf/user.txt")
                .onLocalhost()
                .build();
        // A remote user configuration
        UserConfiguration remoteUserConfiguration = UserConfigurationBuilder
                .newBuilder()
                .name("aRemoteConfiguration")
                .filePath("/opt/conf/user.txt")
                .onRemoteHost("172.x.x.x")
                .credentials("user","password")
                .build();
    }

}
