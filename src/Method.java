public enum Method {
    POST("POST"),

    GET("GET"),

    PUT("PUT"),

    DELETE("DELETE");

    final String method;

    Method(String method) {
        this.method = method;
    }
}
