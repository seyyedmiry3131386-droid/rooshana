package io.sentry.config;

import defpackage.dw1;
import io.sentry.util.k;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        a.W(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final Map a() {
        String strS = dw1.s(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strS)) {
                    map.put(str.substring(strS.length()), k.d((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return k.d(this.b.getProperty(this.a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
