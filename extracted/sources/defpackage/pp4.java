package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pp4 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public ImmutableList I = ImmutableList.q();
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public fv6 i;
    public fv6 j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public CharSequence y;
    public CharSequence z;

    public final void a(int i, byte[] bArr) {
        if (this.k == null || i == 3 || !Objects.equals(this.l, 3)) {
            this.k = (byte[]) bArr.clone();
            this.l = Integer.valueOf(i);
        }
    }

    public final void b(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void c(Long l) {
        vy2.j(l == null || l.longValue() >= 0);
        this.h = l;
    }
}
