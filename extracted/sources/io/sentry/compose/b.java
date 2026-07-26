package io.sentry.compose;

import androidx.compose.ui.semantics.g;
import defpackage.eu;
import defpackage.hx4;
import defpackage.js3;
import io.sentry.hints.i;
import io.sentry.u0;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final Field a;
    public final Field b;

    public b(u0 u0Var) {
        this.a = i.e(u0Var, "androidx.compose.ui.platform.TestTagElement");
        this.b = i.e(u0Var, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
    }

    public final String a(hx4 hx4Var) {
        Field field;
        Field field2;
        js3.p(hx4Var, "modifier");
        String name = hx4Var.getClass().getName();
        if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = this.a) != null) {
            return (String) field2.get(hx4Var);
        }
        if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = this.b) != null) {
            return (String) field.get(hx4Var);
        }
        if (!(hx4Var instanceof eu)) {
            return null;
        }
        for (Map.Entry entry : ((eu) hx4Var).k()) {
            g gVar = (g) entry.getKey();
            Object value = entry.getValue();
            String str = gVar.a;
            if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                if (value instanceof String) {
                    return (String) value;
                }
            }
        }
        return null;
    }
}
