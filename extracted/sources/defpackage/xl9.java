package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xl9 implements Comparable {
    public final String a;

    public xl9(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xl9 xl9Var = (xl9) obj;
        xl9Var.getClass();
        String str = this.a;
        int length = str.length();
        String str2 = xl9Var.a;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xl9.class == obj.getClass()) {
            return this.a.equals(((xl9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.a});
    }

    public final String toString() {
        return o40.y("\"", this.a, "\"");
    }
}
