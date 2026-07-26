package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class cp4 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final ImmutableMap c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ImmutableList g;
    public final byte[] h;

    static {
        String str = j29.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public cp4(bp4 bp4Var) {
        vy2.s((bp4Var.c && ((Uri) bp4Var.e) == null) ? false : true);
        UUID uuid = (UUID) bp4Var.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) bp4Var.e;
        this.c = (ImmutableMap) bp4Var.f;
        this.d = bp4Var.a;
        this.f = bp4Var.c;
        this.e = bp4Var.b;
        this.g = (ImmutableList) bp4Var.g;
        byte[] bArr = (byte[]) bp4Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp4)) {
            return false;
        }
        cp4 cp4Var = (cp4) obj;
        return this.a.equals(cp4Var.a) && Objects.equals(this.b, cp4Var.b) && Objects.equals(this.c, cp4Var.c) && this.d == cp4Var.d && this.f == cp4Var.f && this.e == cp4Var.e && this.g.equals(cp4Var.g) && Arrays.equals(this.h, cp4Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
