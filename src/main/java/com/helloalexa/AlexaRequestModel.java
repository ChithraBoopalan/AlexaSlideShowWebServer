package com.helloalexa;

import com.google.gson.annotations.SerializedName;

public class AlexaRequestModel {

    /**
     * version : 1.0
     * session : {"new":false,"sessionId":"amzn1.echo-api.session.32383308-9076-486b-868f-78d781ed8d20","application":{"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"},"user":{"userId":"amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ"}}
     * context : {"AudioPlayer":{"playerActivity":"IDLE"},"Display":{"token":""},"System":{"application":{"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"},"user":{"userId":"amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ"},"device":{"deviceId":"amzn1.ask.device.AFFBJGOCHCEVUOZSXGLIH4TTIEFV4CLMGPQUH3TF7J3BCSJM5PIEQ74I74JWQ2ETNJL5ST5TDGPIV7HDBG6DISK4TDHVSGLKBCDBXZPAH5Y2W7PKMMDW623E33XSZO4SDOKV3ZAME72YBYGK2N3QJHSF2EIQ","supportedInterfaces":{"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}},"apiEndpoint":"https://api.amazonalexa.com","apiAccessToken":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjM3YTc3YmM3LTc4NmYtNGI0OS04MGYyLTE3MTE2NzAzOGRlZSIsImV4cCI6MTUyNDQxNzYwNSwiaWF0IjoxNTI0NDE0MDA1LCJuYmYiOjE1MjQ0MTQwMDUsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUZGQkpHT0NIQ0VWVU9aU1hHTElINFRUSUVGVjRDTE1HUFFVSDNURjdKM0JDU0pNNVBJRVE3NEk3NEpXUTJFVE5KTDVTVDVUREdQSVY3SERCRzZESVNLNFRESFZTR0xLQkNEQlhaUEFINVkyVzdQS01NRFc2MjNFMzNYU1pPNFNET0tWM1pBTUU3MllCWUdLMk4zUUpIU0YyRUlRIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUhFSUkyU1FaN0s2TFZHWEFaWkxER0laTjdINEdFSEpSQVA2RURET0pESVlHSEdEUFhMVEdERzMyVE1SWUJaNE9OWjVKSU9MRFlDRlQ2UFE2Tlk2TVE0MklaSFpRVE9QT1VCV1pORVpON09aTzZEQlhPSjdGM00zUjRSRFk0NkFDMkVPNllGWjZMWFFWWDNPSUREU0ZCRU1CWTVSN1VZREJTV0UzSTROQTRSV01FVjRMSFJYWENFTlBXNVVFN1paN1lLUlZRS0ZYQlRGUkVRIn19.CasjAhStMhwksogFXA64BaXMA4E2FIFT0ZSiHsod2cD9Ocr7W-5t4gWzThAIcHYYPzHJWIW-aYgdlUEP_0iLyzrgiNR6ou3pPhrBt6P4aIz2Q4FQHYuuIx6Qe7SmgSRrXG0jerUDjIHGPcD2nQ6zk1j5m1r3keq4UTYUTj5Bwj54nm6jIq1T1fMbnReKCkZGLp2ekY1hRwFBu-Wh5b2PpRrEXtAIec8jzJ-D121PTdTdLsJSQOTMhnIpVUgD7oXKYiFGQUKMwZDlZIs4AHAsTmI4HlaShWghj-wBMbnyoxXMotSuwrd2ZyNZbHozut2mefRhTD6v0Xa_TvCTuOo_og"}}
     * request : {"type":"IntentRequest","requestId":"amzn1.echo-api.request.9b9aa627-2f66-4729-acf4-a6dc0d6af4a8","timestamp":"2018-04-22T16:20:05Z","locale":"en-IN","intent":{"name":"GoToSlide","confirmationStatus":"NONE","slots":{"number":{"name":"number","value":"4","confirmationStatus":"NONE"},"Search":{"name":"Search","value":"hello","confirmationStatus":"NONE"}}},"dialogState":"STARTED"}
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
         * new : false
         * sessionId : amzn1.echo-api.session.32383308-9076-486b-868f-78d781ed8d20
         * application : {"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"}
         * user : {"userId":"amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ"}
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
             * userId : amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ
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
         * Display : {"token":""}
         * System : {"application":{"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"},"user":{"userId":"amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ"},"device":{"deviceId":"amzn1.ask.device.AFFBJGOCHCEVUOZSXGLIH4TTIEFV4CLMGPQUH3TF7J3BCSJM5PIEQ74I74JWQ2ETNJL5ST5TDGPIV7HDBG6DISK4TDHVSGLKBCDBXZPAH5Y2W7PKMMDW623E33XSZO4SDOKV3ZAME72YBYGK2N3QJHSF2EIQ","supportedInterfaces":{"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}},"apiEndpoint":"https://api.amazonalexa.com","apiAccessToken":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjM3YTc3YmM3LTc4NmYtNGI0OS04MGYyLTE3MTE2NzAzOGRlZSIsImV4cCI6MTUyNDQxNzYwNSwiaWF0IjoxNTI0NDE0MDA1LCJuYmYiOjE1MjQ0MTQwMDUsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUZGQkpHT0NIQ0VWVU9aU1hHTElINFRUSUVGVjRDTE1HUFFVSDNURjdKM0JDU0pNNVBJRVE3NEk3NEpXUTJFVE5KTDVTVDVUREdQSVY3SERCRzZESVNLNFRESFZTR0xLQkNEQlhaUEFINVkyVzdQS01NRFc2MjNFMzNYU1pPNFNET0tWM1pBTUU3MllCWUdLMk4zUUpIU0YyRUlRIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUhFSUkyU1FaN0s2TFZHWEFaWkxER0laTjdINEdFSEpSQVA2RURET0pESVlHSEdEUFhMVEdERzMyVE1SWUJaNE9OWjVKSU9MRFlDRlQ2UFE2Tlk2TVE0MklaSFpRVE9QT1VCV1pORVpON09aTzZEQlhPSjdGM00zUjRSRFk0NkFDMkVPNllGWjZMWFFWWDNPSUREU0ZCRU1CWTVSN1VZREJTV0UzSTROQTRSV01FVjRMSFJYWENFTlBXNVVFN1paN1lLUlZRS0ZYQlRGUkVRIn19.CasjAhStMhwksogFXA64BaXMA4E2FIFT0ZSiHsod2cD9Ocr7W-5t4gWzThAIcHYYPzHJWIW-aYgdlUEP_0iLyzrgiNR6ou3pPhrBt6P4aIz2Q4FQHYuuIx6Qe7SmgSRrXG0jerUDjIHGPcD2nQ6zk1j5m1r3keq4UTYUTj5Bwj54nm6jIq1T1fMbnReKCkZGLp2ekY1hRwFBu-Wh5b2PpRrEXtAIec8jzJ-D121PTdTdLsJSQOTMhnIpVUgD7oXKYiFGQUKMwZDlZIs4AHAsTmI4HlaShWghj-wBMbnyoxXMotSuwrd2ZyNZbHozut2mefRhTD6v0Xa_TvCTuOo_og"}
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
            /**
             * playerActivity : IDLE
             */

            private String playerActivity;

            public String getPlayerActivity() {
                return playerActivity;
            }

            public void setPlayerActivity(String playerActivity) {
                this.playerActivity = playerActivity;
            }
        }

        public static class DisplayBean {
            /**
             * token :
             */

            private String token;

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }
        }

        public static class SystemBean {
            /**
             * application : {"applicationId":"amzn1.ask.skill.37a77bc7-786f-4b49-80f2-171167038dee"}
             * user : {"userId":"amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ"}
             * device : {"deviceId":"amzn1.ask.device.AFFBJGOCHCEVUOZSXGLIH4TTIEFV4CLMGPQUH3TF7J3BCSJM5PIEQ74I74JWQ2ETNJL5ST5TDGPIV7HDBG6DISK4TDHVSGLKBCDBXZPAH5Y2W7PKMMDW623E33XSZO4SDOKV3ZAME72YBYGK2N3QJHSF2EIQ","supportedInterfaces":{"AudioPlayer":{},"Display":{"templateVersion":"1.0","markupVersion":"1.0"}}}
             * apiEndpoint : https://api.amazonalexa.com
             * apiAccessToken : eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLjM3YTc3YmM3LTc4NmYtNGI0OS04MGYyLTE3MTE2NzAzOGRlZSIsImV4cCI6MTUyNDQxNzYwNSwiaWF0IjoxNTI0NDE0MDA1LCJuYmYiOjE1MjQ0MTQwMDUsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUZGQkpHT0NIQ0VWVU9aU1hHTElINFRUSUVGVjRDTE1HUFFVSDNURjdKM0JDU0pNNVBJRVE3NEk3NEpXUTJFVE5KTDVTVDVUREdQSVY3SERCRzZESVNLNFRESFZTR0xLQkNEQlhaUEFINVkyVzdQS01NRFc2MjNFMzNYU1pPNFNET0tWM1pBTUU3MllCWUdLMk4zUUpIU0YyRUlRIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUhFSUkyU1FaN0s2TFZHWEFaWkxER0laTjdINEdFSEpSQVA2RURET0pESVlHSEdEUFhMVEdERzMyVE1SWUJaNE9OWjVKSU9MRFlDRlQ2UFE2Tlk2TVE0MklaSFpRVE9QT1VCV1pORVpON09aTzZEQlhPSjdGM00zUjRSRFk0NkFDMkVPNllGWjZMWFFWWDNPSUREU0ZCRU1CWTVSN1VZREJTV0UzSTROQTRSV01FVjRMSFJYWENFTlBXNVVFN1paN1lLUlZRS0ZYQlRGUkVRIn19.CasjAhStMhwksogFXA64BaXMA4E2FIFT0ZSiHsod2cD9Ocr7W-5t4gWzThAIcHYYPzHJWIW-aYgdlUEP_0iLyzrgiNR6ou3pPhrBt6P4aIz2Q4FQHYuuIx6Qe7SmgSRrXG0jerUDjIHGPcD2nQ6zk1j5m1r3keq4UTYUTj5Bwj54nm6jIq1T1fMbnReKCkZGLp2ekY1hRwFBu-Wh5b2PpRrEXtAIec8jzJ-D121PTdTdLsJSQOTMhnIpVUgD7oXKYiFGQUKMwZDlZIs4AHAsTmI4HlaShWghj-wBMbnyoxXMotSuwrd2ZyNZbHozut2mefRhTD6v0Xa_TvCTuOo_og
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
                 * userId : amzn1.ask.account.AHEII2SQZ7K6LVGXAZZLDGIZN7H4GEHJRAP6EDDOJDIYGHGDPXLTGDG32TMRYBZ4ONZ5JIOLDYCFT6PQ6NY6MQ42IZHZQTOPOUBWZNEZN7OZO6DBXOJ7F3M3R4RDY46AC2EO6YFZ6LXQVX3OIDDSFBEMBY5R7UYDBSWE3I4NA4RWMEV4LHRXXCENPW5UE7ZZ7YKRVQKFXBTFREQ
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
                 * deviceId : amzn1.ask.device.AFFBJGOCHCEVUOZSXGLIH4TTIEFV4CLMGPQUH3TF7J3BCSJM5PIEQ74I74JWQ2ETNJL5ST5TDGPIV7HDBG6DISK4TDHVSGLKBCDBXZPAH5Y2W7PKMMDW623E33XSZO4SDOKV3ZAME72YBYGK2N3QJHSF2EIQ
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
         * requestId : amzn1.echo-api.request.9b9aa627-2f66-4729-acf4-a6dc0d6af4a8
         * timestamp : 2018-04-22T16:20:05Z
         * locale : en-IN
         * intent : {"name":"GoToSlide","confirmationStatus":"NONE","slots":{"number":{"name":"number","value":"4","confirmationStatus":"NONE"},"Search":{"name":"Search","value":"hello","confirmationStatus":"NONE"}}}
         * dialogState : STARTED
         */

        private String type;
        private String requestId;
        private String timestamp;
        private String locale;
        private IntentBean intent;
        private String dialogState;

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

        public String getDialogState() {
            return dialogState;
        }

        public void setDialogState(String dialogState) {
            this.dialogState = dialogState;
        }

        public static class IntentBean {
            /**
             * name : GoToSlide
             * confirmationStatus : NONE
             * slots : {"number":{"name":"number","value":"4","confirmationStatus":"NONE"},"Search":{"name":"Search","value":"hello","confirmationStatus":"NONE"}}
             */

            private String name;
            private String confirmationStatus;
            private SlotsBean slots;

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

            public SlotsBean getSlots() {
                return slots;
            }

            public void setSlots(SlotsBean slots) {
                this.slots = slots;
            }

            public static class SlotsBean {
                /**
                 * number : {"name":"number","value":"4","confirmationStatus":"NONE"}
                 * Search : {"name":"Search","value":"hello","confirmationStatus":"NONE"}
                 */

                private NumberBean number;
                private SearchBean Search;

                public NumberBean getNumber() {
                    return number;
                }

                public void setNumber(NumberBean number) {
                    this.number = number;
                }

                public SearchBean getSearch() {
                    return Search;
                }

                public void setSearch(SearchBean Search) {
                    this.Search = Search;
                }

                public static class NumberBean {
                    /**
                     * name : number
                     * value : 4
                     * confirmationStatus : NONE
                     */

                    private String name;
                    private String value;
                    private String confirmationStatus;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public String getConfirmationStatus() {
                        return confirmationStatus;
                    }

                    public void setConfirmationStatus(String confirmationStatus) {
                        this.confirmationStatus = confirmationStatus;
                    }
                }

                public static class SearchBean {
                    /**
                     * name : Search
                     * value : hello
                     * confirmationStatus : NONE
                     */

                    private String name;
                    private String value;
                    private String confirmationStatus;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
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
    }
}
