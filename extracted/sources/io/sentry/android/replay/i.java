package io.sentry.android.replay;

import defpackage.bl4;
import defpackage.js3;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public final File a;
    public final long b;
    public final String c;

    public i(File file, long j, String str) {
        this.a = file;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return js3.i(this.a, iVar.a) && this.b == iVar.b && js3.i(this.c, iVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", screen=");
        return bl4.y(sb, this.c, ')');
    }
}
