package com.example.kiz.mvpdemo.data.model;

public class User {
    private String login;
    private int id;
    private String nodeId;
    private String avatarUrl;
    private String grAvatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String receivedEventsUrl;
    private String type;
    private int numberOfSubscription;

    public User() {
    }

    public User(String login, int id, String nodeId, String avatarUrl, String grAvatarId,
                String url, String htmlUrl, String followersUrl, String subscriptionsUrl,
                String organizationsUrl, String reposUrl, String receivedEventsUrl, String type,
                int numberOfSubscription) {
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.grAvatarId = grAvatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.numberOfSubscription = numberOfSubscription;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGrAvatarId() {
        return grAvatarId;
    }

    public void setGrAvatarId(String grAvatarId) {
        this.grAvatarId = grAvatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfSubscription() {
        return numberOfSubscription;
    }

    public void setNumberOfSubscription(int numberOfSubscription) {
        this.numberOfSubscription = numberOfSubscription;
    }
}
