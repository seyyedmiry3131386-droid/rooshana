package io.sentry.android.replay;

import defpackage.dw1;
import defpackage.js3;
import io.sentry.SentryReplayEvent$ReplayType;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final r a;
    public final h b;
    public final Date c;
    public final int d;
    public final long e;
    public final SentryReplayEvent$ReplayType f;
    public final String g;
    public final List h;

    public c(r rVar, h hVar, Date date, int i, long j, SentryReplayEvent$ReplayType sentryReplayEvent$ReplayType, String str, List list) {
        js3.p(list, "events");
        this.a = rVar;
        this.b = hVar;
        this.c = date;
        this.d = i;
        this.e = j;
        this.f = sentryReplayEvent$ReplayType;
        this.g = str;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return js3.i(this.a, cVar.a) && js3.i(this.b, cVar.b) && js3.i(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && js3.i(this.g, cVar.g) && js3.i(this.h, cVar.h);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31;
        long j = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastSegmentData(recorderConfig=");
        sb.append(this.a);
        sb.append(", cache=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", replayType=");
        sb.append(this.f);
        sb.append(", screenAtStart=");
        sb.append(this.g);
        sb.append(", events=");
        return dw1.t(sb, this.h, ')');
    }
}
