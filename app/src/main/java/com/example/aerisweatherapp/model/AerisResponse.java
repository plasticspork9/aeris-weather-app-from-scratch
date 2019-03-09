package com.example.aerisweatherapp.model;


public class AerisResponse {
    private boolean success;
    private Response[] response;

    public boolean isSuccess() {
        return success;
    }

    public Response[] getResponse() {
        return response;
    }

    public class Response {
        private String interval;
        private Period[] periods;

        public class Period {
            private int maxTempC;
            private int minTempC;
            private int avgTempC;
            private int maxTempF;
            private int minTempF;
            private int avgTempF;
            private String dateTimeISO;

            public String getDateTimeISO() {
                return dateTimeISO;
            }

            public float getMaxTempC() {
                return maxTempC;
            }

            public float getMinTempC() {
                return minTempC;
            }

            public float getAvgTempC() {
                return avgTempC;
            }

            public float getMaxTempF() {
                return maxTempF;
            }

            public float getMinTempF() {
                return minTempF;
            }

            public float getAvgTempF() {
                return avgTempF;
            }
        }
    }
}
