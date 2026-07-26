package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ay implements Map.Entry, Cloneable {
    public String a;
    public String b;
    public dy c;

    public final Object clone() {
        try {
            return (ay) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ay.class == obj.getClass()) {
            ay ayVar = (ay) obj;
            String str = ayVar.a;
            String str2 = this.a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.b;
            String str4 = ayVar.b;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        dy dyVar = this.c;
        String str3 = this.a;
        int iA = dyVar.a(str3);
        String str4 = "";
        if (iA != -1 && (str = dyVar.c[iA]) != null) {
            str4 = str;
        }
        int iA2 = dyVar.a(str3);
        if (iA2 != -1) {
            dyVar.c[iA2] = str2;
        }
        this.b = str2;
        return str4;
    }
}
