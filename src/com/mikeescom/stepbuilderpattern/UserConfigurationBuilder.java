package com.mikeescom.stepbuilderpattern;

public class UserConfigurationBuilder {
    public static NameStep newBuilder() {
        return new Steps();
    }
    private UserConfigurationBuilder() {}

    public interface NameStep {
        FileStep name(String name);
    }

    public interface FileStep {
        ServerStep filePath(String name);
    }

    public interface ServerStep {
        BuildStep onLocalhost();
        CredentialsStep onRemoteHost(String host);
    }

    public interface CredentialsStep {
        BuildStep credentials(String user, String password);
    }

    public interface BuildStep {
        UserConfiguration build();
    }

    private static class Steps implements NameStep, FileStep, ServerStep, CredentialsStep, BuildStep { 
        private String name;
        private String host;
        private String user;
        private String password;
        private String filePath;

        @Override
        public FileStep name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public ServerStep filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        @Override
        public BuildStep onLocalhost() {
            this.host = "localhost";
            return this;
        }

        @Override
        public CredentialsStep onRemoteHost(String host) {
            this.host = host;
            return this;
        }

        @Override
        public BuildStep credentials(String user, String password) {
            this.user = user;
            this.password = password;
            return this;
        }

        @Override
        public UserConfiguration build() {
            UserConfiguration userConfiguration = new UserConfiguration(name, filePath);
            ServerDetails serverDetails = new ServerDetails(host);
            if (!serverDetails.isLocalHost()) {
                serverDetails.setUser(user);
                serverDetails.setPassword(password);
            }
            userConfiguration.setServerDetails(serverDetails);
            return userConfiguration;
        }
    }
}

