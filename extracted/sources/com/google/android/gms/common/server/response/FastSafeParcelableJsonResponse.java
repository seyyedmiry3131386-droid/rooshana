package com.google.android.gms.common.server.response;

import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.br9;
import defpackage.dw1;
import defpackage.rq4;
import defpackage.rw3;
import defpackage.t61;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse implements SafeParcelable {
    public static final Object f(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.k;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public static final void g(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i = fastJsonResponse$Field.b;
        if (i == 11) {
            Class cls = fastJsonResponse$Field.h;
            rq4.n(cls);
            sb.append(((FastSafeParcelableJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(rw3.a((String) obj));
            sb.append("\"");
        }
    }

    public abstract Map a();

    public Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        String str = fastJsonResponse$Field.f;
        if (fastJsonResponse$Field.h == null) {
            return c();
        }
        if (c() != null) {
            throw new IllegalStateException(dw1.n("Concrete field shouldn't be value object: ", str));
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(strSubstring).length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Object c() {
        return null;
    }

    public boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.d != 11) {
            return e();
        }
        if (fastJsonResponse$Field.e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = (FastSafeParcelableJsonResponse) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (d(fastJsonResponse$Field)) {
                if (!fastSafeParcelableJsonResponse.d(fastJsonResponse$Field) || !vy2.w(b(fastJsonResponse$Field), fastSafeParcelableJsonResponse.b(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (fastSafeParcelableJsonResponse.d(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (d(fastJsonResponse$Field)) {
                Object objB = b(fastJsonResponse$Field);
                rq4.n(objB);
                iHashCode = (iHashCode * 31) + objB.hashCode();
            }
        }
        return iHashCode;
    }

    public String toString() {
        Map mapA = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapA.keySet()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) mapA.get(str);
            if (d(fastJsonResponse$Field)) {
                Object objF = f(fastJsonResponse$Field, b(fastJsonResponse$Field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                t61.y(sb, "\"", str, "\":");
                if (objF != null) {
                    switch (fastJsonResponse$Field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objF, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objF, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            br9.T(sb, (HashMap) objF);
                            break;
                        default:
                            if (fastJsonResponse$Field.c) {
                                ArrayList arrayList = (ArrayList) objF;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        g(sb, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                g(sb, fastJsonResponse$Field, objF);
                            }
                            break;
                    }
                } else {
                    sb.append(Ssh2PublicKeyAlgorithmName.NULL);
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
