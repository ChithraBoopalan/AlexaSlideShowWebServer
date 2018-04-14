package com.helloalexa;

import com.google.gson.annotations.SerializedName;

public class AlexaRequestModel {

    /**
     * version : 1.0
     * session : {"new":true,"sessionId":"amzn1.echo-api.session.73e241bb-5d7a-4841-9b61-c79b5d41acc8","application":{"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"},"user":{"userId":"amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI"}}
     * context : {"AudioPlayer":{"playerActivity":"IDLE"},"Display":{},"System":{"application":{"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"},"user":{"userId":"amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI"},"device":{"deviceId":"amzn1.ask.device.AEQALIIJQS4QVW62PGAXXFBLNIZQFGCOBY4QJGJER6ALKPFCGKHO3CXOJ7HCDL73JR6GIARXIJXUK5SK6K7PCSDEGXQCYBJX7QTRLE2C6SAESKKXZXUKXFVNQHPNRXY7RMCEW3Z5JADGXIMRF35J3LZ6URHA","supportedInterfaces":{"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}},"apiEndpoint":"https://api.amazonalexa.com","apiAccessToken":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjM3YTc3YmM3LTc4NmYtNGI0OS04MGYyLTE3MTE2NzAzOGRlZSIsImV4cCI6MTUyMzY0MDkyMiwiaWF0IjoxNTIzNjM3MzIyLCJuYmYiOjE1MjM2MzczMjIsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUVRQUxJSUpRUzRRVlc2MlBHQVhYRkJMTklaUUZHQ09CWTRRSkdKRVI2QUxLUEZDR0tITzNDWE9KN0hDREw3M0pSNkdJQVJYSUpYVUs1U0s2SzdQQ1NERUdYUUNZQkpYN1FUUkxFMkM2U0FFU0tLWFpYVUtYRlZOUUhQTlJYWTdSTUNFVzNaNUpBREdYSU1SRjM1SjNMWjZVUkhBIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUVPV1NDVFJOVFhLRVpDNkxPNzc3SU9WRTdCVllIWUdRTVhHSlVUTUdIN1MyU0VEWEw2V01JN0U2UjVMQUhNRlNXTVNDSU9KTFNJN0g1MjZJRUIzQzVIVE1CVUNTWjVWSEpLVEVLR1ZRUVZYVFFHQ0FGS1VCTVhUMkVGSERJMzJNQkhENkNBVFdQNFlVNDdPVVpJR1lJSDNUM0xDTUxJNUFISFFURVk3TTZLTlVNTUtZR0NEU1JMQVdJRjROU1FHUVVOTE9DNTRVQTZUTEhJIn19.dL8SHayYyfHDDoW95WDRGOqPf_jplaZJa3P20y2-zgtulBlcC1TdF8swnBwPA_VBBFCBU_HtJ3yTkzeb4SD1XNoxdo8Ne_B6CE0gf687ZhuMSyJHenFP5vIWcNK1MfewJYFSUs_GE1DsAo5Z3nMkw2xNhr56hIQFTroOL1P5KCjeggDYzTf1VUV7d7eMqIoANBdbqWa6n_0fZuDgdjT227aFvHxxqHOrPQW5ozaTQHu8D0G3akipm8g8BT3jdXKNqePO63zzcRy_0SW3hx7BDnOZqxHqXx2Qeg_xII6uT-Us5uqjsG8BCfY-2OBFo5ohLUaPO6SpjYNX11eyMhjN1w"}}
     * request : {"type":"IntentRequest","requestId":"amzn1.echo-api.request.3a52c591-d0a7-4f08-9897-f35d7c31f6a2","timestamp":"2018-04-13T16:35:22Z","locale":"en-IN","intent":{"name":"ListOpenAssignedIssues","confirmationStatus":"NONE"}}
     */

    private String version;
    private SessionBean session;
    private ContextBean context;
    private RequestBean request;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SessionBean getSession() {
        return session;
    }

    public void setSession(SessionBean session) {
        this.session = session;
    }

    public ContextBean getContext() {
        return context;
    }

    public void setContext(ContextBean context) {
        this.context = context;
    }

    public RequestBean getRequest() {
        return request;
    }

    public void setRequest(RequestBean request) {
        this.request = request;
    }

    public static class SessionBean {
        /**
         * new : true
         * sessionId : amzn1.echo-api.session.73e241bb-5d7a-4841-9b61-c79b5d41acc8
         * application : {"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"}
         * user : {"userId":"amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI"}
         */

        @SerializedName("new")
        private boolean newX;
        private String sessionId;
        private ApplicationBean application;
        private UserBean user;

        public boolean isNewX() {
            return newX;
        }

        public void setNewX(boolean newX) {
            this.newX = newX;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public ApplicationBean getApplication() {
            return application;
        }

        public void setApplication(ApplicationBean application) {
            this.application = application;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class ApplicationBean {
            /**
             * applicationId : amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee
             */

            private String applicationId;

            public String getApplicationId() {
                return applicationId;
            }

            public void setApplicationId(String applicationId) {
                this.applicationId = applicationId;
            }
        }

        public static class UserBean {
            /**
             * userId : amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI
             */

            private String userId;

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }
        }
    }

    public static class ContextBean {
        /**
         * AudioPlayer : {"playerActivity":"IDLE"}
         * Display : {}
         * System : {"application":{"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"},"user":{"userId":"amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI"},"device":{"deviceId":"amzn1.ask.device.AEQALIIJQS4QVW62PGAXXFBLNIZQFGCOBY4QJGJER6ALKPFCGKHO3CXOJ7HCDL73JR6GIARXIJXUK5SK6K7PCSDEGXQCYBJX7QTRLE2C6SAESKKXZXUKXFVNQHPNRXY7RMCEW3Z5JADGXIMRF35J3LZ6URHA","supportedInterfaces":{"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}},"apiEndpoint":"https://api.amazonalexa.com","apiAccessToken":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjM3YTc3YmM3LTc4NmYtNGI0OS04MGYyLTE3MTE2NzAzOGRlZSIsImV4cCI6MTUyMzY0MDkyMiwiaWF0IjoxNTIzNjM3MzIyLCJuYmYiOjE1MjM2MzczMjIsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUVRQUxJSUpRUzRRVlc2MlBHQVhYRkJMTklaUUZHQ09CWTRRSkdKRVI2QUxLUEZDR0tITzNDWE9KN0hDREw3M0pSNkdJQVJYSUpYVUs1U0s2SzdQQ1NERUdYUUNZQkpYN1FUUkxFMkM2U0FFU0tLWFpYVUtYRlZOUUhQTlJYWTdSTUNFVzNaNUpBREdYSU1SRjM1SjNMWjZVUkhBIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUVPV1NDVFJOVFhLRVpDNkxPNzc3SU9WRTdCVllIWUdRTVhHSlVUTUdIN1MyU0VEWEw2V01JN0U2UjVMQUhNRlNXTVNDSU9KTFNJN0g1MjZJRUIzQzVIVE1CVUNTWjVWSEpLVEVLR1ZRUVZYVFFHQ0FGS1VCTVhUMkVGSERJMzJNQkhENkNBVFdQNFlVNDdPVVpJR1lJSDNUM0xDTUxJNUFISFFURVk3TTZLTlVNTUtZR0NEU1JMQVdJRjROU1FHUVVOTE9DNTRVQTZUTEhJIn19.dL8SHayYyfHDDoW95WDRGOqPf_jplaZJa3P20y2-zgtulBlcC1TdF8swnBwPA_VBBFCBU_HtJ3yTkzeb4SD1XNoxdo8Ne_B6CE0gf687ZhuMSyJHenFP5vIWcNK1MfewJYFSUs_GE1DsAo5Z3nMkw2xNhr56hIQFTroOL1P5KCjeggDYzTf1VUV7d7eMqIoANBdbqWa6n_0fZuDgdjT227aFvHxxqHOrPQW5ozaTQHu8D0G3akipm8g8BT3jdXKNqePO63zzcRy_0SW3hx7BDnOZqxHqXx2Qeg_xII6uT-Us5uqjsG8BCfY-2OBFo5ohLUaPO6SpjYNX11eyMhjN1w"}
         */

        private AudioPlayerBean AudioPlayer;
        private DisplayBean Display;
        private SystemBean System;

        public AudioPlayerBean getAudioPlayer() {
            return AudioPlayer;
        }

        public void setAudioPlayer(AudioPlayerBean AudioPlayer) {
            this.AudioPlayer = AudioPlayer;
        }

        public DisplayBean getDisplay() {
            return Display;
        }

        public void setDisplay(DisplayBean Display) {
            this.Display = Display;
        }

        public SystemBean getSystem() {
            return System;
        }

        public void setSystem(SystemBean System) {
            this.System = System;
        }

        public static class AudioPlayerBean {
        }

        public static class DisplayBean {
        }

        public static class SystemBean {
            /**
             * application : {"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"}
             * user : {"userId":"amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI"}
             * device : {"deviceId":"amzn1.ask.device.AEQALIIJQS4QVW62PGAXXFBLNIZQFGCOBY4QJGJER6ALKPFCGKHO3CXOJ7HCDL73JR6GIARXIJXUK5SK6K7PCSDEGXQCYBJX7QTRLE2C6SAESKKXZXUKXFVNQHPNRXY7RMCEW3Z5JADGXIMRF35J3LZ6URHA","supportedInterfaces":{"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}}
             * apiEndpoint : https://api.amazonalexa.com
             * apiAccessToken : eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjM3YTc3YmM3LTc4NmYtNGI0OS04MGYyLTE3MTE2NzAzOGRlZSIsImV4cCI6MTUyMzY0MDkyMiwiaWF0IjoxNTIzNjM3MzIyLCJuYmYiOjE1MjM2MzczMjIsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUVRQUxJSUpRUzRRVlc2MlBHQVhYRkJMTklaUUZHQ09CWTRRSkdKRVI2QUxLUEZDR0tITzNDWE9KN0hDREw3M0pSNkdJQVJYSUpYVUs1U0s2SzdQQ1NERUdYUUNZQkpYN1FUUkxFMkM2U0FFU0tLWFpYVUtYRlZOUUhQTlJYWTdSTUNFVzNaNUpBREdYSU1SRjM1SjNMWjZVUkhBIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUVPV1NDVFJOVFhLRVpDNkxPNzc3SU9WRTdCVllIWUdRTVhHSlVUTUdIN1MyU0VEWEw2V01JN0U2UjVMQUhNRlNXTVNDSU9KTFNJN0g1MjZJRUIzQzVIVE1CVUNTWjVWSEpLVEVLR1ZRUVZYVFFHQ0FGS1VCTVhUMkVGSERJMzJNQkhENkNBVFdQNFlVNDdPVVpJR1lJSDNUM0xDTUxJNUFISFFURVk3TTZLTlVNTUtZR0NEU1JMQVdJRjROU1FHUVVOTE9DNTRVQTZUTEhJIn19.dL8SHayYyfHDDoW95WDRGOqPf_jplaZJa3P20y2-zgtulBlcC1TdF8swnBwPA_VBBFCBU_HtJ3yTkzeb4SD1XNoxdo8Ne_B6CE0gf687ZhuMSyJHenFP5vIWcNK1MfewJYFSUs_GE1DsAo5Z3nMkw2xNhr56hIQFTroOL1P5KCjeggDYzTf1VUV7d7eMqIoANBdbqWa6n_0fZuDgdjT227aFvHxxqHOrPQW5ozaTQHu8D0G3akipm8g8BT3jdXKNqePO63zzcRy_0SW3hx7BDnOZqxHqXx2Qeg_xII6uT-Us5uqjsG8BCfY-2OBFo5ohLUaPO6SpjYNX11eyMhjN1w
             */

            private ApplicationBeanX application;
            private UserBeanX user;
            private DeviceBean device;
            private String apiEndpoint;
            private String apiAccessToken;

            public ApplicationBeanX getApplication() {
                return application;
            }

            public void setApplication(ApplicationBeanX application) {
                this.application = application;
            }

            public UserBeanX getUser() {
                return user;
            }

            public void setUser(UserBeanX user) {
                this.user = user;
            }

            public DeviceBean getDevice() {
                return device;
            }

            public void setDevice(DeviceBean device) {
                this.device = device;
            }

            public String getApiEndpoint() {
                return apiEndpoint;
            }

            public void setApiEndpoint(String apiEndpoint) {
                this.apiEndpoint = apiEndpoint;
            }

            public String getApiAccessToken() {
                return apiAccessToken;
            }

            public void setApiAccessToken(String apiAccessToken) {
                this.apiAccessToken = apiAccessToken;
            }

            public static class ApplicationBeanX {
                /**
                 * applicationId : amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee
                 */

                private String applicationId;

                public String getApplicationId() {
                    return applicationId;
                }

                public void setApplicationId(String applicationId) {
                    this.applicationId = applicationId;
                }
            }

            public static class UserBeanX {
                /**
                 * userId : amzn1.ask.account.AEOWSCTRNTXKEZC6LO777IOVE7BVYHYGQMXGJUTMGH7S2SEDXL6WMI7E6R5LAHMFSWMSCIOJLSI7H526IEB3C5HTMBUCSZ5VHJKTEKGVQQVXTQGCAFKUBMXT2EFHDI32MBHD6CATWP4YU47OUZIGYIH3T3LCMLI5AHHQTEY7M6KNUMMKYGCDSRLAWIF4NSQGQUNLOC54UA6TLHI
                 */

                private String userId;

                public String getUserId() {
                    return userId;
                }

                public void setUserId(String userId) {
                    this.userId = userId;
                }
            }

            public static class DeviceBean {
                /**
                 * deviceId : amzn1.ask.device.AEQALIIJQS4QVW62PGAXXFBLNIZQFGCOBY4QJGJER6ALKPFCGKHO3CXOJ7HCDL73JR6GIARXIJXUK5SK6K7PCSDEGXQCYBJX7QTRLE2C6SAESKKXZXUKXFVNQHPNRXY7RMCEW3Z5JADGXIMRF35J3LZ6URHA
                 * supportedInterfaces : {"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}
                 */

                private String deviceId;
                private SupportedInterfacesBean supportedInterfaces;

                public String getDeviceId() {
                    return deviceId;
                }

                public void setDeviceId(String deviceId) {
                    this.deviceId = deviceId;
                }

                public SupportedInterfacesBean getSupportedInterfaces() {
                    return supportedInterfaces;
                }

                public void setSupportedInterfaces(SupportedInterfacesBean supportedInterfaces) {
                    this.supportedInterfaces = supportedInterfaces;
                }

                public static class SupportedInterfacesBean {
                    /**
                     * AudioPlayer : {}
                     * Display : {"templateVersion":"1.0","markupVersion":"1.0"}
                     */

                    private AudioPlayerBeanX AudioPlayer;
                    private DisplayBeanX Display;

                    public AudioPlayerBeanX getAudioPlayer() {
                        return AudioPlayer;
                    }

                    public void setAudioPlayer(AudioPlayerBeanX AudioPlayer) {
                        this.AudioPlayer = AudioPlayer;
                    }

                    public DisplayBeanX getDisplay() {
                        return Display;
                    }

                    public void setDisplay(DisplayBeanX Display) {
                        this.Display = Display;
                    }

                    public static class AudioPlayerBeanX {
                    }

                    public static class DisplayBeanX {
                        /**
                         * templateVersion : 1.0
                         * markupVersion : 1.0
                         */

                        private String templateVersion;
                        private String markupVersion;

                        public String getTemplateVersion() {
                            return templateVersion;
                        }

                        public void setTemplateVersion(String templateVersion) {
                            this.templateVersion = templateVersion;
                        }

                        public String getMarkupVersion() {
                            return markupVersion;
                        }

                        public void setMarkupVersion(String markupVersion) {
                            this.markupVersion = markupVersion;
                        }
                    }
                }
            }
        }
    }

    public static class RequestBean {
        /**
         * type : IntentRequest
         * requestId : amzn1.echo-api.request.3a52c591-d0a7-4f08-9897-f35d7c31f6a2
         * timestamp : 2018-04-13T16:35:22Z
         * locale : en-IN
         * intent : {"name":"ListOpenAssignedIssues","confirmationStatus":"NONE"}
         */

        private String type;
        private String requestId;
        private String timestamp;
        private String locale;
        private IntentBean intent;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public IntentBean getIntent() {
            return intent;
        }

        public void setIntent(IntentBean intent) {
            this.intent = intent;
        }

        public static class IntentBean {
            /**
             * name : ListOpenAssignedIssues
             * confirmationStatus : NONE
             */

            private String name;
            private String confirmationStatus;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getConfirmationStatus() {
                return confirmationStatus;
            }

            public void setConfirmationStatus(String confirmationStatus) {
                this.confirmationStatus = confirmationStatus;
            }
        }
    }
}
