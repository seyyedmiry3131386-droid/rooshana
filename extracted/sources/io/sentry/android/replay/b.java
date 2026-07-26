package io.sentry.android.replay;

import defpackage.js3;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final File a;
    public final int b;
    public final long c;

    public b(File file, int i, long j) {
        this.a = file;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return js3.i(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "GeneratedVideo(video=" + this.a + ", frameCount=" + this.b + ", duration=" + this.c + ')';
    }
}
