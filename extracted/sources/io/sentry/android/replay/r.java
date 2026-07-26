package io.sentry.android.replay;

import defpackage.dw1;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public r(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.b == rVar.b && Float.compare(this.c, rVar.c) == 0 && Float.compare(this.d, rVar.d) == 0 && this.e == rVar.e && this.f == rVar.f;
    }

    public final int hashCode() {
        return ((dw1.g(this.d, dw1.g(this.c, ((this.a * 31) + this.b) * 31, 31), 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.a);
        sb.append(", recordingHeight=");
        sb.append(this.b);
        sb.append(", scaleFactorX=");
        sb.append(this.c);
        sb.append(", scaleFactorY=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitRate=");
        return dw1.q(sb, this.f, ')');
    }
}
