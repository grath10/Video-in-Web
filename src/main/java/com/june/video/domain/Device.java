package com.june.video.domain;

import javax.persistence.*;

@Table(name = "device")
public class Device {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "Location")
    private String location;

    @Column(name = "Type")
    private String type;

    @Column(name = "ClientId")
    private String clientid;

    @Column(name = "Architecture_ID")
    private Integer architectureId;

    @Column(name = "State")
    private String state;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "StreamUrl")
    private String streamurl;

    @Column(name = "Historic_Count")
    private Integer historicCount;

    @Column(name = "Annual_Count")
    private Integer annualCount;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return Location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * @return Type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return ClientId
     */
    public String getClientid() {
        return clientid;
    }

    /**
     * @param clientid
     */
    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    /**
     * @return Architecture_ID
     */
    public Integer getArchitectureId() {
        return architectureId;
    }

    /**
     * @param architectureId
     */
    public void setArchitectureId(Integer architectureId) {
        this.architectureId = architectureId;
    }

    /**
     * @return State
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return StreamUrl
     */
    public String getStreamurl() {
        return streamurl;
    }

    /**
     * @param streamurl
     */
    public void setStreamurl(String streamurl) {
        this.streamurl = streamurl == null ? null : streamurl.trim();
    }

    /**
     * @return Historic_Count
     */
    public Integer getHistoricCount() {
        return historicCount;
    }

    /**
     * @param historicCount
     */
    public void setHistoricCount(Integer historicCount) {
        this.historicCount = historicCount;
    }

    /**
     * @return Annual_Count
     */
    public Integer getAnnualCount() {
        return annualCount;
    }

    /**
     * @param annualCount
     */
    public void setAnnualCount(Integer annualCount) {
        this.annualCount = annualCount;
    }
}