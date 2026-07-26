package io.sentry;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class y {
    public static final Pattern e = Pattern.compile("^o(\\d+)\\.");
    public final String a;
    public final String b;
    public final URI c;
    public final String d;

    public y(String str) {
        try {
            io.sentry.config.a.W(str, "The DSN is required.");
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                throw new IllegalArgumentException("The DSN is empty.");
            }
            URI uriNormalize = new URI(strTrim).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.b = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String strGroup = null;
            this.a = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            strSubstring = strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
            String strSubstring2 = path.substring(iLastIndexOf);
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.c = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
            String host = uriNormalize.getHost();
            if (host != null) {
                Matcher matcher = e.matcher(host);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                }
            }
            this.d = strGroup;
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }
}
