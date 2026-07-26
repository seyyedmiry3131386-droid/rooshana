package io.sentry.util;

import io.sentry.l0;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final List a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    public static final l0 b;
    public static final l0 c;

    static {
        Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
        b = new l0(ErrorDTO.CODE_ACCESS_DENIED, 499);
        c = new l0(500, 599);
    }
}
