package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import defpackage.mw3;
import defpackage.om8;
import defpackage.t61;
import defpackage.wu8;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class ToNumberPolicy implements om8 {
    public static final ToNumberPolicy a;
    public static final ToNumberPolicy b;
    public static final /* synthetic */ ToNumberPolicy[] c;

    static {
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.1
            @Override // defpackage.om8
            public final Number a(mw3 mw3Var) {
                return Double.valueOf(mw3Var.nextDouble());
            }
        };
        a = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.2
            @Override // defpackage.om8
            public final Number a(mw3 mw3Var) {
                return new LazilyParsedNumber(mw3Var.t());
            }
        };
        b = toNumberPolicy2;
        c = new ToNumberPolicy[]{toNumberPolicy, toNumberPolicy2, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.3
            public static Double b(String str, mw3 mw3Var) throws MalformedJsonException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (mw3Var.b != Strictness.a) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + mw3Var.k(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e) {
                    StringBuilder sbN = t61.n("Cannot parse ", str, "; at path ");
                    sbN.append(mw3Var.k(true));
                    throw new JsonParseException(sbN.toString(), e);
                }
            }

            @Override // defpackage.om8
            public final Number a(mw3 mw3Var) throws IOException {
                String strT = mw3Var.t();
                if (strT.indexOf(46) >= 0) {
                    return b(strT, mw3Var);
                }
                try {
                    return Long.valueOf(Long.parseLong(strT));
                } catch (NumberFormatException unused) {
                    return b(strT, mw3Var);
                }
            }
        }, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.4
            @Override // defpackage.om8
            public final Number a(mw3 mw3Var) throws IOException {
                String strT = mw3Var.t();
                try {
                    return wu8.F(strT);
                } catch (NumberFormatException e) {
                    StringBuilder sbN = t61.n("Cannot parse ", strT, "; at path ");
                    sbN.append(mw3Var.k(true));
                    throw new JsonParseException(sbN.toString(), e);
                }
            }
        }};
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) c.clone();
    }
}
